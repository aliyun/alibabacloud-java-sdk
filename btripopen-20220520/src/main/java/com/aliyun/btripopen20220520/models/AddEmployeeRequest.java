// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://static-legacy.dingtalk.com/media/lADPF8XMoxJeUkbNA2LNA5s_923_866.jpg">https://static-legacy.dingtalk.com/media/lADPF8XMoxJeUkbNA2LNA5s_923_866.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    @NameInMap("base_city_code_list")
    public java.util.List<String> baseCityCodeList;

    /**
     * <strong>example:</strong>
     * <p>2000-01-02</p>
     */
    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_list")
    public java.util.List<AddEmployeeRequestCertList> certList;

    @NameInMap("custom_role_code_list")
    public java.util.List<String> customRoleCodeList;

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
    public java.util.List<String> outDeptIdList;

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

    public static AddEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeRequest self = new AddEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeeRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public AddEmployeeRequest setBaseCityCodeList(java.util.List<String> baseCityCodeList) {
        this.baseCityCodeList = baseCityCodeList;
        return this;
    }
    public java.util.List<String> getBaseCityCodeList() {
        return this.baseCityCodeList;
    }

    public AddEmployeeRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public AddEmployeeRequest setCertList(java.util.List<AddEmployeeRequestCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<AddEmployeeRequestCertList> getCertList() {
        return this.certList;
    }

    public AddEmployeeRequest setCustomRoleCodeList(java.util.List<String> customRoleCodeList) {
        this.customRoleCodeList = customRoleCodeList;
        return this;
    }
    public java.util.List<String> getCustomRoleCodeList() {
        return this.customRoleCodeList;
    }

    public AddEmployeeRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddEmployeeRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public AddEmployeeRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public AddEmployeeRequest setIsBoss(Boolean isBoss) {
        this.isBoss = isBoss;
        return this;
    }
    public Boolean getIsBoss() {
        return this.isBoss;
    }

    public AddEmployeeRequest setIsDeptLeader(Boolean isDeptLeader) {
        this.isDeptLeader = isDeptLeader;
        return this;
    }
    public Boolean getIsDeptLeader() {
        return this.isDeptLeader;
    }

    public AddEmployeeRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public AddEmployeeRequest setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
        return this;
    }
    public String getManagerUserId() {
        return this.managerUserId;
    }

    public AddEmployeeRequest setOutDeptIdList(java.util.List<String> outDeptIdList) {
        this.outDeptIdList = outDeptIdList;
        return this;
    }
    public java.util.List<String> getOutDeptIdList() {
        return this.outDeptIdList;
    }

    public AddEmployeeRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddEmployeeRequest setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
        return this;
    }
    public String getPositionLevel() {
        return this.positionLevel;
    }

    public AddEmployeeRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AddEmployeeRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public AddEmployeeRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public AddEmployeeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddEmployeeRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public static class AddEmployeeRequestCertList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000-01-02</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>2099-03-12</p>
         */
        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>13111111111</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("real_name")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>John/Wilson</p>
         */
        @NameInMap("real_name_en")
        public String realNameEn;

        public static AddEmployeeRequestCertList build(java.util.Map<String, ?> map) throws Exception {
            AddEmployeeRequestCertList self = new AddEmployeeRequestCertList();
            return TeaModel.build(map, self);
        }

        public AddEmployeeRequestCertList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public AddEmployeeRequestCertList setCertExpiredTime(String certExpiredTime) {
            this.certExpiredTime = certExpiredTime;
            return this;
        }
        public String getCertExpiredTime() {
            return this.certExpiredTime;
        }

        public AddEmployeeRequestCertList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public AddEmployeeRequestCertList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public AddEmployeeRequestCertList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public AddEmployeeRequestCertList setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public AddEmployeeRequestCertList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public AddEmployeeRequestCertList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public AddEmployeeRequestCertList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public AddEmployeeRequestCertList setRealNameEn(String realNameEn) {
            this.realNameEn = realNameEn;
            return this;
        }
        public String getRealNameEn() {
            return this.realNameEn;
        }

    }

}
