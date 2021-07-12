// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static UpdateIoTCloudConnectorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorAttributeResponseBody self = new UpdateIoTCloudConnectorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIoTCloudConnectorAttributeResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
