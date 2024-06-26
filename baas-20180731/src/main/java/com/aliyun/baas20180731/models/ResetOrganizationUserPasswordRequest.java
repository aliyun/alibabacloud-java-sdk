// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetOrganizationUserPasswordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    public static ResetOrganizationUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetOrganizationUserPasswordRequest self = new ResetOrganizationUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetOrganizationUserPasswordRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ResetOrganizationUserPasswordRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ResetOrganizationUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetOrganizationUserPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
