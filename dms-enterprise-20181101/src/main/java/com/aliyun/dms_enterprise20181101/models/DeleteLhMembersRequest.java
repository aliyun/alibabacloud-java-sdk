// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLhMembersRequest extends TeaModel {
    /**
     * <p>The ID of the user to be removed. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to obtain the user ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberIds")
    public java.util.List<Integer> memberIds;

    /**
     * <p>The ID of the object.</p>
     * <ul>
     * <li>If the object is a workspace, you can call the <a href="https://help.aliyun.com/document_detail/424379.html">GetLhSpaceByName</a> operation to obtain the workspace ID.</li>
     * <li>If the object is a task flow, you can call the <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to obtain the task flow ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9***</p>
     */
    @NameInMap("ObjectId")
    public Long objectId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: workspace</li>
     * <li><strong>1</strong>: task flow</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObjectType")
    public Integer objectType;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
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
