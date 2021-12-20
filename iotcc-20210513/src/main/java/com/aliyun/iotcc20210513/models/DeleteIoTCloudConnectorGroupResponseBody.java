// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIoTCloudConnectorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorGroupResponseBody self = new DeleteIoTCloudConnectorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
