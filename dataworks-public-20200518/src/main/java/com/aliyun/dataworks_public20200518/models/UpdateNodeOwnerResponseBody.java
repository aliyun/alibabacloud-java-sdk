// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to obtain logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: indicates that the request is successful.</p>
     * <p>*   false: indicates that the request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNodeOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOwnerResponseBody self = new UpdateNodeOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
