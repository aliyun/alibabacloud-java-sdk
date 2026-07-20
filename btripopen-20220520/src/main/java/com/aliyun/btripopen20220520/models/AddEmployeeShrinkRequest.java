// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeeShrinkRequest extends TeaModel {
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
    public String baseCityCodeListShrink;

    /**
     * <p>The base location information of the employee.</p>
     */
    @NameInMap("base_location_list")
    public String baseLocationListShrink;

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
    public String certListShrink;

    /**
     * <p>The collection of role IDs associated with the employee. The number of roles associated with a single employee must be less than or equal to 200. Otherwise, the employee synchronization fails.</p>
     */
    @NameInMap("custom_role_code_list")
    public String customRoleCodeListShrink;

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
    public String outDeptIdListShrink;

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

    public static AddEmployeeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeeShrinkRequest self = new AddEmployeeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeeShrinkRequest setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }
    public String getAccountEmail() {
        return this.accountEmail;
    }

    public AddEmployeeShrinkRequest setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
        return this;
    }
    public String getAccountPhone() {
        return this.accountPhone;
    }

    public AddEmployeeShrinkRequest setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
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

    public AddEmployeeShrinkRequest setBaseLocationListShrink(String baseLocationListShrink) {
        this.baseLocationListShrink = baseLocationListShrink;
        return this;
    }
    public String getBaseLocationListShrink() {
        return this.baseLocationListShrink;
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
