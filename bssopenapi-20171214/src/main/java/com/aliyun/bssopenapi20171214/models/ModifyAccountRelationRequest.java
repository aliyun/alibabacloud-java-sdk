// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationRequest extends TeaModel {
    @NameInMap("ChildNick")
    public String childNick;

    @NameInMap("ChildUserId")
    public Long childUserId;

    @NameInMap("ParentUserId")
    public Long parentUserId;

    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    @NameInMap("RelationOperation")
    public String relationOperation;

    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    public static ModifyAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationRequest self = new ModifyAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationRequest setChildNick(String childNick) {
        this.childNick = childNick;
        return this;
    }
    public String getChildNick() {
        return this.childNick;
    }

    public ModifyAccountRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public ModifyAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public ModifyAccountRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

    public ModifyAccountRelationRequest setRelationOperation(String relationOperation) {
        this.relationOperation = relationOperation;
        return this;
    }
    public String getRelationOperation() {
        return this.relationOperation;
    }

    public ModifyAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ModifyAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAccountRelationRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

}
