// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationRequest extends TeaModel {
    // relationId
    @NameInMap("RelationId")
    public Long relationId;

    // requestId
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
