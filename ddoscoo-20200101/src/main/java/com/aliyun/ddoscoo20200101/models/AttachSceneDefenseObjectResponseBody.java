// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AttachSceneDefenseObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachSceneDefenseObjectResponseBody self = new AttachSceneDefenseObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachSceneDefenseObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachSceneDefenseObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
