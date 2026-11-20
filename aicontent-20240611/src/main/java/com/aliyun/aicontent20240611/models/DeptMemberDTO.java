// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class DeptMemberDTO extends TeaModel {
    /**
     * <p>The comma-separated list of authorized model IDs. This field is valid only when include_authorization is specified. An empty value indicates that the models are inherited or all models are authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("allowedModels")
    public String allowedModels;

    /**
     * <p>The authorization configuration. Valid values: inherit: Inherited from the department. custom: Customized. This field is valid only when include_authorization is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>inherit</p>
     */
    @NameInMap("authConfig")
    public String authConfig;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The member user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The number of active keys that belong to the member. This field is valid only when include_authorization is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("keyCount")
    public Integer keyCount;

    /**
     * <p>The logon name.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("loginName")
    public String loginName;

    /**
     * <p>The monthly balance. This field is valid only when include_balance is specified. The value is 0 if the feature is not activated.</p>
     * 
     * <strong>example:</strong>
     * <p>10.00</p>
     */
    @NameInMap("monthlyBalance")
    public Double monthlyBalance;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The permanent balance. This field is valid only when include_balance is specified. The value is 0 if the feature is not activated.</p>
     * 
     * <strong>example:</strong>
     * <p>20.00</p>
     */
    @NameInMap("permanentBalance")
    public Double permanentBalance;

    /**
     * <p>The mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The role code.</p>
     * 
     * <strong>example:</strong>
     * <p>member</p>
     */
    @NameInMap("roleCode")
    public String roleCode;

    /**
     * <p>The role name.</p>
     * 
     * <strong>example:</strong>
     * <p>Member</p>
     */
    @NameInMap("roleName")
    public String roleName;

    public static DeptMemberDTO build(java.util.Map<String, ?> map) throws Exception {
        DeptMemberDTO self = new DeptMemberDTO();
        return TeaModel.build(map, self);
    }

    public DeptMemberDTO setAllowedModels(String allowedModels) {
        this.allowedModels = allowedModels;
        return this;
    }
    public String getAllowedModels() {
        return this.allowedModels;
    }

    public DeptMemberDTO setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public DeptMemberDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DeptMemberDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeptMemberDTO setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
        return this;
    }
    public Integer getKeyCount() {
        return this.keyCount;
    }

    public DeptMemberDTO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public DeptMemberDTO setMonthlyBalance(Double monthlyBalance) {
        this.monthlyBalance = monthlyBalance;
        return this;
    }
    public Double getMonthlyBalance() {
        return this.monthlyBalance;
    }

    public DeptMemberDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeptMemberDTO setPermanentBalance(Double permanentBalance) {
        this.permanentBalance = permanentBalance;
        return this;
    }
    public Double getPermanentBalance() {
        return this.permanentBalance;
    }

    public DeptMemberDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public DeptMemberDTO setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public DeptMemberDTO setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
