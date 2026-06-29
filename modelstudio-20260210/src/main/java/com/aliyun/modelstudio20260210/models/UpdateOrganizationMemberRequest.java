// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateOrganizationMemberRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ORG_MEMBER</p>
     */
    @NameInMap("NewRoleCode")
    public String newRoleCode;

    public static UpdateOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationMemberRequest self = new UpdateOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationMemberRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public UpdateOrganizationMemberRequest setNewRoleCode(String newRoleCode) {
        this.newRoleCode = newRoleCode;
        return this;
    }
    public String getNewRoleCode() {
        return this.newRoleCode;
    }

}
