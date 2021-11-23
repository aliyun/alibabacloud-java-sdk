// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AddAccountRelationRequest extends TeaModel {
    @NameInMap("ChildNick")
    public String childNick;

    @NameInMap("ChildUserId")
    public Long childUserId;

    @NameInMap("ParentUserId")
    public Long parentUserId;

    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    public static AddAccountRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAccountRelationRequest self = new AddAccountRelationRequest();
        return TeaModel.build(map, self);
    }

    public AddAccountRelationRequest setChildNick(String childNick) {
        this.childNick = childNick;
        return this;
    }
    public String getChildNick() {
        return this.childNick;
    }

    public AddAccountRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public AddAccountRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public AddAccountRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

    public AddAccountRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public AddAccountRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAccountRelationRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

}
