// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AddUserBusinessFormRequest extends TeaModel {
    /**
     * <p>The company.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx有限公司</p>
     */
    @NameInMap("Company")
    public String company;

    /**
     * <p>The email address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@alibaba.com">xxxx@alibaba.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>158********</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The job title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>经理</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>Additional remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>请尽快联系我们</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The company website.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.com</p>
     */
    @NameInMap("Website")
    public String website;

    public static AddUserBusinessFormRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserBusinessFormRequest self = new AddUserBusinessFormRequest();
        return TeaModel.build(map, self);
    }

    public AddUserBusinessFormRequest setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public AddUserBusinessFormRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AddUserBusinessFormRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddUserBusinessFormRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public AddUserBusinessFormRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddUserBusinessFormRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AddUserBusinessFormRequest setWebsite(String website) {
        this.website = website;
        return this;
    }
    public String getWebsite() {
        return this.website;
    }

}
