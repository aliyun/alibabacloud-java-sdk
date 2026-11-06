// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCodeReviewResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the approval is successful. This does not indicate that the publish process is complete.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCodeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeReviewResponseBody self = new UpdateCodeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCodeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCodeReviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
