// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateClientUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10701</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20644</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>13641966835</p>
     */
    @NameInMap("MobileNumber")
    public String mobileNumber;

    public static UpdateClientUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientUserRequest self = new UpdateClientUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientUserRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public UpdateClientUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateClientUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateClientUserRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateClientUserRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

}
