// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class AddOrganizationMemberRequest extends TeaModel {
    /**
     * <p>The display name. If this parameter is not empty, the name field of the account is also updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>账号名称</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account information of the TokenPlan management platform.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("CallerUacAccountId")
    public String callerUacAccountId;

    /**
     * <p>The product namespace ID. For the TokenPlan product, this field is fixed to namespace-1.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace-1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The organization ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org_123456789</p>
     */
    @NameInMap("OrgId")
    public String orgId;

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
     * <p>The seat specification.</p>
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

    public AddOrganizationMemberRequest setCallerUacAccountId(String callerUacAccountId) {
        this.callerUacAccountId = callerUacAccountId;
        return this;
    }
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    public AddOrganizationMemberRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public AddOrganizationMemberRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
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
