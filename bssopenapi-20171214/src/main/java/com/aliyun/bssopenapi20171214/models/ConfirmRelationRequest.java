// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationRequest extends TeaModel {
    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("ParentUserId")
    public Long parentUserId;

    @NameInMap("ConfirmCode")
    public String confirmCode;

    @NameInMap("ChildUserId")
    public Long childUserId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    public static ConfirmRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationRequest self = new ConfirmRelationRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ConfirmRelationRequest setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
        return this;
    }
    public Long getParentUserId() {
        return this.parentUserId;
    }

    public ConfirmRelationRequest setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
        return this;
    }
    public String getConfirmCode() {
        return this.confirmCode;
    }

    public ConfirmRelationRequest setChildUserId(Long childUserId) {
        this.childUserId = childUserId;
        return this;
    }
    public Long getChildUserId() {
        return this.childUserId;
    }

    public ConfirmRelationRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmRelationRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

}
