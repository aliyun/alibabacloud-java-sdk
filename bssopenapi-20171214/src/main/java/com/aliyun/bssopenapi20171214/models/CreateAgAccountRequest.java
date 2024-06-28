// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    /**
     * <p>The attribute of the account. To view the attribute of the account, use the account to log on to the Alibaba Cloud Management Console, move the pointer over the profile picture in the upper-right corner, and then click <strong>Security Settings</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountAttr")
    public String accountAttr;

    /**
     * <p>The name of the city.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("CityName")
    public String cityName;

    /**
     * <p>The name of the enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>Dongguan ChuangNeng Electric Appliance Co., Ltd</p>
     */
    @NameInMap("EnterpriseName")
    public String enterpriseName;

    /**
     * <p>The first name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhicheng</p>
     */
    @NameInMap("FirstName")
    public String firstName;

    /**
     * <p>The last name.</p>
     * <p>The last name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Wu</p>
     */
    @NameInMap("LastName")
    public String lastName;

    /**
     * <p>The email address used to log on to the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>email</p>
     */
    @NameInMap("LoginEmail")
    public String loginEmail;

    /**
     * <p>The country code.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("NationCode")
    public String nationCode;

    /**
     * <p>The zip code.</p>
     * 
     * <strong>example:</strong>
     * <p>350000</p>
     */
    @NameInMap("Postcode")
    public String postcode;

    /**
     * <p>The name of the province. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("ProvinceName")
    public String provinceName;

    public static CreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountRequest self = new CreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountRequest setAccountAttr(String accountAttr) {
        this.accountAttr = accountAttr;
        return this;
    }
    public String getAccountAttr() {
        return this.accountAttr;
    }

    public CreateAgAccountRequest setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public CreateAgAccountRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public CreateAgAccountRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public CreateAgAccountRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

    public CreateAgAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public CreateAgAccountRequest setNationCode(String nationCode) {
        this.nationCode = nationCode;
        return this;
    }
    public String getNationCode() {
        return this.nationCode;
    }

    public CreateAgAccountRequest setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
    public String getPostcode() {
        return this.postcode;
    }

    public CreateAgAccountRequest setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getProvinceName() {
        return this.provinceName;
    }

}
