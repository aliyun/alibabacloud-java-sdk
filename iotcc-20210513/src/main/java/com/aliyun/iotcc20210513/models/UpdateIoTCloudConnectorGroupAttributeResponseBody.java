// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIoTCloudConnectorGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorGroupAttributeResponseBody self = new UpdateIoTCloudConnectorGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
