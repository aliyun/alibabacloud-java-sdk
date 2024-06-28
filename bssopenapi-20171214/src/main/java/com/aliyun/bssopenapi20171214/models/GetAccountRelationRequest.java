// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationRequest extends TeaModel {
    /**
     * <p>The ID of the financial relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>Value returned by calling the AddAccountRelation operation</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The unique ID of the request. The ID is used to mark a request and troubleshoot a problem.</p>
     * 
     * <strong>example:</strong>
     * <p>requestId</p>
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
