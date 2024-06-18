// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateClientUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10797</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>727</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    /**
     * <strong>example:</strong>
     * <p>13641966835</p>
     */
    @NameInMap("MobileNumber")
    public String mobileNumber;

    /**
     * <strong>example:</strong>
     * <p>kehudiyi</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientUserRequest self = new CreateClientUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientUserRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public CreateClientUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClientUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateClientUserRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public CreateClientUserRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public CreateClientUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClientUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
