// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DetachSceneDefenseObjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DetachSceneDefenseObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachSceneDefenseObjectResponseBody self = new DetachSceneDefenseObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachSceneDefenseObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachSceneDefenseObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
