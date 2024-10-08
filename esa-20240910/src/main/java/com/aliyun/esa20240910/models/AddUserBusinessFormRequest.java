// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AddUserBusinessFormRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Company")
    public String company;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>记录名称</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>记录类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Position")
    public String position;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AddUserBusinessForm</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>业务场景</p>
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
