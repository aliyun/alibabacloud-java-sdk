// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationRequest extends TeaModel {
    /**
     * <p>The UID of the RAM user. You must specify either the RelationId parameter, or the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1512996702208737</p>
     */
    @NameInMap("ChildUserId")
    public Long childUserId;

    /**
     * <p>The UID of the Alibaba Cloud account. You must specify either the RelationId parameter, or the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1738376485192612</p>
     */
    @NameInMap("ParentUserId")
    public Long parentUserId;

    /**
     * <p>The ID of the account association. You must specify either the RelationId parameter, or the ParentUserId, ChildUserId, and RelationType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>RelationId</p>
     */
    @NameInMap("RelationId")
    public Long relationId;

    /**
     * <p>The relationship type. Only enterprise_group is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_group</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The unique ID of the request. This ID is used to troubleshoot issues.</p>
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
