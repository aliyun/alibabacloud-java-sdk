// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationRequest extends TeaModel {
    /**
     * <p>The account linking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The unique request ID, used to identify the request and facilitate troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRelationRequest self = new GetAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountRelationRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public GetAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
