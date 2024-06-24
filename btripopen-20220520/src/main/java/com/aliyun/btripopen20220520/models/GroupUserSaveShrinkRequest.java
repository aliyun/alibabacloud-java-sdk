// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupUserSaveShrinkRequest extends TeaModel {
    @NameInMap("base_city_code")
    public String baseCityCode;

    @NameInMap("birthday")
    public String birthday;

    @NameInMap("cert_list")
    public String certListShrink;

    @NameInMap("gender")
    public String gender;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("job_no")
    public String jobNo;

    /**
     * <strong>example:</strong>
     * <p>18000000000</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>ce/shi</p>
     */
    @NameInMap("real_name_en")
    public String realNameEn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sub_corp_id_list")
    public String subCorpIdListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_name")
    public String userName;

    public static GroupUserSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupUserSaveShrinkRequest self = new GroupUserSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GroupUserSaveShrinkRequest setBaseCityCode(String baseCityCode) {
        this.baseCityCode = baseCityCode;
        return this;
    }
    public String getBaseCityCode() {
        return this.baseCityCode;
    }

    public GroupUserSaveShrinkRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public GroupUserSaveShrinkRequest setCertListShrink(String certListShrink) {
        this.certListShrink = certListShrink;
        return this;
    }
    public String getCertListShrink() {
        return this.certListShrink;
    }

    public GroupUserSaveShrinkRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public GroupUserSaveShrinkRequest setJobNo(String jobNo) {
        this.jobNo = jobNo;
        return this;
    }
    public String getJobNo() {
        return this.jobNo;
    }

    public GroupUserSaveShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GroupUserSaveShrinkRequest setRealNameEn(String realNameEn) {
        this.realNameEn = realNameEn;
        return this;
    }
    public String getRealNameEn() {
        return this.realNameEn;
    }

    public GroupUserSaveShrinkRequest setSubCorpIdListShrink(String subCorpIdListShrink) {
        this.subCorpIdListShrink = subCorpIdListShrink;
        return this;
    }
    public String getSubCorpIdListShrink() {
        return this.subCorpIdListShrink;
    }

    public GroupUserSaveShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GroupUserSaveShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
