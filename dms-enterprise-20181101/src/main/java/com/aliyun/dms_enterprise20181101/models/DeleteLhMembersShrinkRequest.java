// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLhMembersShrinkRequest extends TeaModel {
    @NameInMap("MemberIds")
    public String memberIdsShrink;

    @NameInMap("ObjectId")
    public Long objectId;

    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteLhMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLhMembersShrinkRequest self = new DeleteLhMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLhMembersShrinkRequest setMemberIdsShrink(String memberIdsShrink) {
        this.memberIdsShrink = memberIdsShrink;
        return this;
    }
    public String getMemberIdsShrink() {
        return this.memberIdsShrink;
    }

    public DeleteLhMembersShrinkRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DeleteLhMembersShrinkRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public DeleteLhMembersShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
