// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    /**
     * <p>The properties of the new account. In the console, click Account Properties in the top menu bar to go to the <strong>Security Settings</strong> page and view the properties.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountAttr")
    public String accountAttr;

    /**
     * <p>The name of the city in English.</p>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("CityName")
    public String cityName;

    /**
     * <p>The name of the enterprise. This is the enterprise name that corresponds to the Unified Social Credit Code.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云测试有限公司</p>
     */
    @NameInMap("EnterpriseName")
    public String enterpriseName;

    /**
     * <p>The first name of the user under the level 1 category.</p>
     * 
     * <strong>example:</strong>
     * <p>志成</p>
     */
    @NameInMap("FirstName")
    public String firstName;

    /**
     * <p>The last name of the user.</p>
     * <p>Maximum length: 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>吴</p>
     */
    @NameInMap("LastName")
    public String lastName;

    /**
     * <p>The logon email address of the member account.</p>
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
     * <p>The postal code.</p>
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
     * <p>北京</p>
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
