// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCodeReviewResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the created code review.</p>
     * 
     * <strong>example:</strong>
     * <p>review-id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCodeReviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeReviewResponseBody self = new CreateCodeReviewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCodeReviewResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateCodeReviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
