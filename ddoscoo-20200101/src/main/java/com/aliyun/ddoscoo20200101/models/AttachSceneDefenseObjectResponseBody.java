// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
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
