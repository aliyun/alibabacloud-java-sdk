// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteAntOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAntOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntOpenPlatformConfigResponseBody self = new DeleteAntOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAntOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
