// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationRequest extends TeaModel {
    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("RelationOperation")
    public String relationOperation;

    @NameInMap("ParentUserId")
    public Long parentUserId;

    @NameInMap("ChildNick")
    public String childNick;

    @NameInMap("ChildUserId")
    public Long childUserId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    public static ModifyAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationRequest self = new ModifyAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ModifyAccountRelationRequest setRelationOperation(String relationOperation) {
        this.relationOperation = relationOperation;
        return this;
    }
    public String getRelationOperation() {
        return this.relationOperation;
    }

    public ModifyAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
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

    public ModifyAccountRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

}
