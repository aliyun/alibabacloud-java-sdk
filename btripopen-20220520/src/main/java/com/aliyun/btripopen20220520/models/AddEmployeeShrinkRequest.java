// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://static-legacy.dingtalk.com/media/lADPF8XMoxJeUkbNA2LNA5s_923_866.jpg">https://static-legacy.dingtalk.com/media/lADPF8XMoxJeUkbNA2LNA5s_923_866.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    @NameInMap("base_city_code_list")
    public String baseCityCodeListShrink;

    /**
     * <strong>example:</strong>
     * <p>2000-01-02</p>
     */
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_list")
    public String certListShrink;

    @NameInMap("custom_role_code_list")
    public String customRoleCodeListShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123@163.com">123@163.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_admin")
    public Boolean isAdmin;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_boss")
    public Boolean isBoss;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_dept_leader")
    public Boolean isDeptLeader;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("job_no")
    public String jobNo;

    /**
     * <strong>example:</strong>
     * <p>user456</p>
     */
    @NameInMap("manager_user_id")
    public String managerUserId;

    @NameInMap("out_dept_id_list")
    public String outDeptIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>13111111111</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>M4</p>
     */
    @NameInMap("position_level")
    public String positionLevel;

    @NameInMap("real_name")
    public String realName;

    /**
     * <strong>example:</strong>
     * <p>John/Wilson</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <strong>example:</strong>
     * <p>union123</p>
     */
    @NameInMap("union_id")
    public String unionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_nick")
    public String userNick;

    public static AddEmployeeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeShrinkRequest self = new AddEmployeeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeeShrinkRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public AddEmployeeShrinkRequest setBaseCityCodeListShrink(String baseCityCodeListShrink) {
        this.baseCityCodeListShrink = baseCityCodeListShrink;
        return this;
    }
    public String getBaseCityCodeListShrink() {
        return this.baseCityCodeListShrink;
    }

    public AddEmployeeShrinkRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public AddEmployeeShrinkRequest setCertListShrink(String certListShrink) {
        this.certListShrink = certListShrink;
        return this;
    }
    public String getCertListShrink() {
        return this.certListShrink;
    }

    public AddEmployeeShrinkRequest setCustomRoleCodeListShrink(String customRoleCodeListShrink) {
        this.customRoleCodeListShrink = customRoleCodeListShrink;
        return this;
    }
    public String getCustomRoleCodeListShrink() {
        return this.customRoleCodeListShrink;
    }

    public AddEmployeeShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddEmployeeShrinkRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public AddEmployeeShrinkRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public AddEmployeeShrinkRequest setIsBoss(Boolean isBoss) {
        this.isBoss = isBoss;
        return this;
    }
    public Boolean getIsBoss() {
        return this.isBoss;
    }

    public AddEmployeeShrinkRequest setIsDeptLeader(Boolean isDeptLeader) {
        this.isDeptLeader = isDeptLeader;
        return this;
    }
    public Boolean getIsDeptLeader() {
        return this.isDeptLeader;
    }

    public AddEmployeeShrinkRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public AddEmployeeShrinkRequest setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }
    public String getManagerUserId() {
        return this.managerUserId;
    }

    public AddEmployeeShrinkRequest setOutDeptIdListShrink(String outDeptIdListShrink) {
        this.outDeptIdListShrink = outDeptIdListShrink;
        return this;
    }
    public String getOutDeptIdListShrink() {
        return this.outDeptIdListShrink;
    }

    public AddEmployeeShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddEmployeeShrinkRequest setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
        return this;
    }
    public String getPositionLevel() {
        return this.positionLevel;
    }

    public AddEmployeeShrinkRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AddEmployeeShrinkRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public AddEmployeeShrinkRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public AddEmployeeShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddEmployeeShrinkRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
