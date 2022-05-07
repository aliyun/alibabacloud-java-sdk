// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnetorBackhaulRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIoTCloudConnetorBackhaulRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnetorBackhaulRouteResponseBody self = new DeleteIoTCloudConnetorBackhaulRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnetorBackhaulRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
