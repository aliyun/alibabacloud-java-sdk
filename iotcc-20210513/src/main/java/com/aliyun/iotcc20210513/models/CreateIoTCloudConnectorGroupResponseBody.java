// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorGroupResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIoTCloudConnectorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorGroupResponseBody self = new CreateIoTCloudConnectorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorGroupResponseBody setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public CreateIoTCloudConnectorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
