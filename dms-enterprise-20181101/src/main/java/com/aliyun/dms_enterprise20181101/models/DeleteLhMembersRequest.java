// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLhMembersRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DeleteLhMembers**.</p>
     */
    @NameInMap("MemberIds")
    public java.util.List<Integer> memberIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteLhMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLhMembersRequest self = new DeleteLhMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLhMembersRequest setMemberIds(java.util.List<Integer> memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public java.util.List<Integer> getMemberIds() {
        return this.memberIds;
    }

    public DeleteLhMembersRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DeleteLhMembersRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public DeleteLhMembersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
