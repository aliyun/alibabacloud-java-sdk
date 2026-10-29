// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class AddOrganizationMemberRequest extends TeaModel {
    /**
     * <p>The display name. If this parameter is not empty, the name field of the account is updated synchronously.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Account name</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The organization role code. Valid values: ORG_ADMIN and ORG_MEMBER. Default value: ORG_MEMBER.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ORG_MEMBER</p>
     */
    @NameInMap("OrgRoleCode")
    public String orgRoleCode;

    /**
     * <p>The seat specification. Valid values:</p>
     * <ul>
     * <li>standard: Standard seat.</li>
     * <li>pro: Pro seat.</li>
     * <li>max: Premium seat.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SpecType")
    public String specType;

    public static AddOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrganizationMemberRequest self = new AddOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddOrganizationMemberRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AddOrganizationMemberRequest setOrgRoleCode(String orgRoleCode) {
        this.orgRoleCode = orgRoleCode;
        return this;
    }
    public String getOrgRoleCode() {
        return this.orgRoleCode;
    }

    public AddOrganizationMemberRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

}
