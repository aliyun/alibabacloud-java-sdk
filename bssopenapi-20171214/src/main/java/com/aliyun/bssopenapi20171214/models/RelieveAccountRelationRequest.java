// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used as the member. You must set the RelationId parameter or all of the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1512996702208737</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The ID of the Alibaba Cloud account that is used as the management account. You must set the RelationId parameter or all of the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1738376485192612</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The ID of the financial relationship between the management account and the member. You must set the RelationId parameter or all of the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>RelationId</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The type of the financial relationship. Set the value to enterprise_group.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_group</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique ID of the request. The ID is used to mark a request and troubleshoot a problem.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RelieveAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationRequest self = new RelieveAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public RelieveAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public RelieveAccountRelationRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public RelieveAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public RelieveAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
