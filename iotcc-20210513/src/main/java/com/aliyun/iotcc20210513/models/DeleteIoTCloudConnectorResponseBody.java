// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorResponseBody self = new DeleteIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
