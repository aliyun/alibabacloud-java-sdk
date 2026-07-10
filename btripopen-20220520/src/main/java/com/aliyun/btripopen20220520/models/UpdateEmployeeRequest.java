// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateEmployeeRequest extends TeaModel {
    @NameInMap("account_email")
    public String accountEmail;

    @NameInMap("account_phone")
    public String accountPhone;

    @NameInMap("attribute")
    public String attribute;

    @NameInMap("avatar")
    public String avatar;

    @NameInMap("base_city_code_list")
    public java.util.List<String> baseCityCodeList;

    @NameInMap("base_location_list")
    public java.util.List<UpdateEmployeeRequestBaseLocationList> baseLocationList;

    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_list")
    public java.util.List<UpdateEmployeeRequestCertList> certList;

    @NameInMap("custom_role_code_list")
    public java.util.List<String> customRoleCodeList;

    @NameInMap("email")
    public String email;

    @NameInMap("gender")
    public String gender;

    @NameInMap("is_admin")
    public Boolean isAdmin;

    @NameInMap("is_boss")
    public Boolean isBoss;

    @NameInMap("is_dept_leader")
    public Boolean isDeptLeader;

    @NameInMap("job_no")
    public String jobNo;

    @NameInMap("manager_user_id")
    public String managerUserId;

    @NameInMap("out_dept_id_list")
    public java.util.List<String> outDeptIdList;

    @NameInMap("phone")
    public String phone;

    @NameInMap("position_level")
    public String positionLevel;

    @NameInMap("real_name")
    public String realName;

    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_nick")
    public String userNick;

    public static UpdateEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEmployeeRequest self = new UpdateEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEmployeeRequest setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public UpdateEmployeeRequest setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
        return this;
    }
    public String getAccountPhone() {
        return this.accountPhone;
    }

    public UpdateEmployeeRequest setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public UpdateEmployeeRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public UpdateEmployeeRequest setBaseCityCodeList(java.util.List<String> baseCityCodeList) {
        this.baseCityCodeList = baseCityCodeList;
        return this;
    }
    public java.util.List<String> getBaseCityCodeList() {
        return this.baseCityCodeList;
    }

    public UpdateEmployeeRequest setBaseLocationList(java.util.List<UpdateEmployeeRequestBaseLocationList> baseLocationList) {
        this.baseLocationList = baseLocationList;
        return this;
    }
    public java.util.List<UpdateEmployeeRequestBaseLocationList> getBaseLocationList() {
        return this.baseLocationList;
    }

    public UpdateEmployeeRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public UpdateEmployeeRequest setCertList(java.util.List<UpdateEmployeeRequestCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<UpdateEmployeeRequestCertList> getCertList() {
        return this.certList;
    }

    public UpdateEmployeeRequest setCustomRoleCodeList(java.util.List<String> customRoleCodeList) {
        this.customRoleCodeList = customRoleCodeList;
        return this;
    }
    public java.util.List<String> getCustomRoleCodeList() {
        return this.customRoleCodeList;
    }

    public UpdateEmployeeRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateEmployeeRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public UpdateEmployeeRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public UpdateEmployeeRequest setIsBoss(Boolean isBoss) {
        this.isBoss = isBoss;
        return this;
    }
    public Boolean getIsBoss() {
        return this.isBoss;
    }

    public UpdateEmployeeRequest setIsDeptLeader(Boolean isDeptLeader) {
        this.isDeptLeader = isDeptLeader;
        return this;
    }
    public Boolean getIsDeptLeader() {
        return this.isDeptLeader;
    }

    public UpdateEmployeeRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public UpdateEmployeeRequest setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }
    public String getManagerUserId() {
        return this.managerUserId;
    }

    public UpdateEmployeeRequest setOutDeptIdList(java.util.List<String> outDeptIdList) {
        this.outDeptIdList = outDeptIdList;
        return this;
    }
    public java.util.List<String> getOutDeptIdList() {
        return this.outDeptIdList;
    }

    public UpdateEmployeeRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateEmployeeRequest setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
        return this;
    }
    public String getPositionLevel() {
        return this.positionLevel;
    }

    public UpdateEmployeeRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UpdateEmployeeRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public UpdateEmployeeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateEmployeeRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public static class UpdateEmployeeRequestBaseLocationList extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("level")
        public String level;

        public static UpdateEmployeeRequestBaseLocationList build(java.util.Map<String, ?> map) throws Exception {
            UpdateEmployeeRequestBaseLocationList self = new UpdateEmployeeRequestBaseLocationList();
            return TeaModel.build(map, self);
        }

        public UpdateEmployeeRequestBaseLocationList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateEmployeeRequestBaseLocationList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class UpdateEmployeeRequestCertList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        @NameInMap("cert_nation")
        public String certNation;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("gender")
        public String gender;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("phone")
        public String phone;

        @NameInMap("real_name")
        public String realName;

        @NameInMap("real_name_en")
        public String realNameEn;

        public static UpdateEmployeeRequestCertList build(java.util.Map<String, ?> map) throws Exception {
            UpdateEmployeeRequestCertList self = new UpdateEmployeeRequestCertList();
            return TeaModel.build(map, self);
        }

        public UpdateEmployeeRequestCertList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public UpdateEmployeeRequestCertList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public UpdateEmployeeRequestCertList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public UpdateEmployeeRequestCertList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public UpdateEmployeeRequestCertList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public UpdateEmployeeRequestCertList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public UpdateEmployeeRequestCertList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public UpdateEmployeeRequestCertList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public UpdateEmployeeRequestCertList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public UpdateEmployeeRequestCertList setRealNameEn(String realNameEn) {
            this.realNameEn = realNameEn;
            return this;
        }
        public String getRealNameEn() {
            return this.realNameEn;
        }

    }

}
