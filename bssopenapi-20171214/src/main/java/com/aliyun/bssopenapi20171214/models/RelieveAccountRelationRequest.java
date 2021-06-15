// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationRequest extends TeaModel {
    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("ParentUserId")
    public Long parentUserId;

    @NameInMap("ChildUserId")
    public Long childUserId;

    @NameInMap("RequestId")
    public String requestId;

    public static RelieveAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationRequest self = new RelieveAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public RelieveAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public RelieveAccountRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public RelieveAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
