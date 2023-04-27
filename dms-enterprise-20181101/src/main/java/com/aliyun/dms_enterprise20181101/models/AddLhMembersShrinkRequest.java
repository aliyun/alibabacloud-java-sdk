// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddLhMembersShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Members")
    public String membersShrink;

    /**
     * <p>The ID of the user to be added. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <br>
     * <p>*   **0**: workspace</p>
     * <p>*   **1**: task flow</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    @NameInMap("Tid")
    public Long tid;

    public static AddLhMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLhMembersShrinkRequest self = new AddLhMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddLhMembersShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public AddLhMembersShrinkRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public AddLhMembersShrinkRequest setObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }
    public Integer getObjectType() {
        return this.objectType;
    }

    public AddLhMembersShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
