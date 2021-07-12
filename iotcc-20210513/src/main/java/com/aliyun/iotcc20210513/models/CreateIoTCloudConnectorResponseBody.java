// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorResponseBody self = new CreateIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorResponseBody setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
