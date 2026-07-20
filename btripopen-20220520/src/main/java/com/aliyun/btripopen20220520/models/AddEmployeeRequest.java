// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeRequest extends TeaModel {
    /**
     * <p>The account email address. This parameter can be specified when the enterprise activation method is email activation.</p>
     * 
     * <strong>example:</strong>
     * <p>j*********@example.com</p>
     */
    @NameInMap("account_email")
    public String accountEmail;

    /**
     * <p>The account phone number. For enterprises with international phone numbers enabled, specify international numbers, Hong Kong (China), Macao (China), and Taiwan (China) numbers in the format +xx-xxxxxx.</p>
     * 
     * <strong>example:</strong>
     * <p>+86-18812345678</p>
     */
    @NameInMap("account_phone")
    public String accountPhone;

    /**
     * <p>The custom extension field for the employee, which supports key-value pairs.</p>
     * <ul>
     * <li>Format: JSON string.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;sio&quot;: &quot;123&quot;,
     *     &quot;location&quot;: &quot;22222&quot;,
     *     &quot;isForeigner&quot;: &quot;Y&quot;
     * }</p>
     */
    @NameInMap("attribute")
    public String attribute;

    /**
     * <p>The avatar of the employee. Specify the URL of the image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.jpg">https://example.com/example.jpg</a></p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The 6-digit administrative code of the work location.</p>
     * <ul>
     * <li>A maximum of two different administrative codes can be specified.</li>
     * </ul>
     */
    @NameInMap("base_city_code_list")
    public java.util.List<String> baseCityCodeList;

    /**
     * <p>The base location information of the employee.</p>
     */
    @NameInMap("base_location_list")
    public java.util.List<AddEmployeeRequestBaseLocationList> baseLocationList;

    /**
     * <p>The birthday of the employee.</p>
     * <ul>
     * <li>Format: yy-MM-dd.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("birthday")
    public String birthday;

    /**
     * <p>The certificate information of the employee.</p>
     */
    @NameInMap("cert_list")
    public java.util.List<AddEmployeeRequestCertList> certList;

    /**
     * <p>The collection of role IDs associated with the employee. The number of roles associated with a single employee must be less than or equal to 200. Otherwise, the employee synchronization fails.</p>
     */
    @NameInMap("custom_role_code_list")
    public java.util.List<String> customRoleCodeList;

    /**
     * <p>The email address of the employee.</p>
     * 
     * <strong>example:</strong>
     * <p>j*********@example.com</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The gender of the employee.</p>
     * 
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <p>Specifies whether the employee is an Alibaba Business Travel enterprise administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_admin")
    public Boolean isAdmin;

    /**
     * <p>Specifies whether the employee is the boss.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_boss")
    public Boolean isBoss;

    /**
     * <p>Specifies whether the employee is a department manager.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_dept_leader")
    public Boolean isDeptLeader;

    /**
     * <p>The employee number, which serves as a unique identifier for the employee along with <code>user_id</code>. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>job_1234</p>
     */
    @NameInMap("job_no")
    public String jobNo;

    /**
     * <p>The ID of the direct manager of the employee.</p>
     * 
     * <strong>example:</strong>
     * <p>user_001</p>
     */
    @NameInMap("manager_user_id")
    public String managerUserId;

    /**
     * <p>The list of departments to which the employee belongs.</p>
     */
    @NameInMap("out_dept_id_list")
    public java.util.List<String> outDeptIdList;

    /**
     * <p>The mobile phone number of the employee.</p>
     * <ul>
     * <li>This field is commonly used for booking business travel services across various categories. <strong>In this case, it is required.</strong></li>
     * <li>If your enterprise is a government agency or other special enterprise, call 400-800-5890 to contact an Alibaba Business Travel customer service representative.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>131****8888</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>The position level of the employee, which is commonly used to match different travel standards.</p>
     * 
     * <strong>example:</strong>
     * <p>高级</p>
     */
    @NameInMap("position_level")
    public String positionLevel;

    /**
     * <p>The name of the employee.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("real_name")
    public String realName;

    /**
     * <p>The English name of the employee. Follow these format requirements:</p>
     * <ul>
     * <li>Separate the last name and first name with &quot;/&quot;, for example: LastName/FirstName.</li>
     * <li>Do not include spaces between the last name and first name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>John/Wilson</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <p>The unique identifier of the same employee across multiple enterprises (parent and subsidiary enterprises).</p>
     * 
     * <strong>example:</strong>
     * <p>union_0123</p>
     */
    @NameInMap("union_id")
    public String unionId;

    /**
     * <p>The employee ID, which is the unique identifier of the employee within the enterprise. Ensure that this value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_1234</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The nickname of the employee.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>弓长</p>
     */
    @NameInMap("user_nick")
    public String userNick;

    public static AddEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeRequest self = new AddEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeeRequest setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public AddEmployeeRequest setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
        return this;
    }
    public String getAccountPhone() {
        return this.accountPhone;
    }

    public AddEmployeeRequest setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
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

    public AddEmployeeRequest setBaseLocationList(java.util.List<AddEmployeeRequestBaseLocationList> baseLocationList) {
        this.baseLocationList = baseLocationList;
        return this;
    }
    public java.util.List<AddEmployeeRequestBaseLocationList> getBaseLocationList() {
        return this.baseLocationList;
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

    public static class AddEmployeeRequestBaseLocationList extends TeaModel {
        /**
         * <p>The 6-digit administrative division code.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The administrative division level: province or city.</p>
         */
        @NameInMap("level")
        public String level;

        public static AddEmployeeRequestBaseLocationList build(java.util.Map<String, ?> map) throws Exception {
            AddEmployeeRequestBaseLocationList self = new AddEmployeeRequestBaseLocationList();
            return TeaModel.build(map, self);
        }

        public AddEmployeeRequestBaseLocationList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddEmployeeRequestBaseLocationList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class AddEmployeeRequestCertList extends TeaModel {
        /**
         * <p>The birthday of the employee.</p>
         * <ul>
         * <li>Format: yy-MM-dd.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <p>The expiration date of the certificate.</p>
         * <ul>
         * <li>Format: <code>yy-MM-dd</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2050-01-01</p>
         */
        @NameInMap("cert_expired_time")
        public String certExpiredTime;

        /**
         * <p>The two-letter country/region code (Country Code) of the certificate issuing country/region.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>110101********1234</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>The certificate type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <p>The gender of the employee, which must be consistent with the certificate information.</p>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("gender")
        public String gender;

        /**
         * <p>The two-letter country/region code (Country Code) of the employee.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <p>The mobile phone number of the employee.</p>
         * 
         * <strong>example:</strong>
         * <p>131****8888</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>The name of the employee, which must be consistent with the certificate information.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("real_name")
        public String realName;

        /**
         * <p>The English name of the employee. Follow these format requirements:</p>
         * <ul>
         * <li>Separate the last name and first name with &quot;/&quot;, for example: LastName/FirstName.</li>
         * <li>Do not include spaces between the last name and first name.</li>
         * </ul>
         * 
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
