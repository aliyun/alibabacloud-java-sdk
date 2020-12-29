// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetFabricOrganizationUserPasswordRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Username")
    public String username;

    @NameInMap("Password")
    public String password;

    @NameInMap("Location")
    public String location;

    public static ResetFabricOrganizationUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetFabricOrganizationUserPasswordRequest self = new ResetFabricOrganizationUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetFabricOrganizationUserPasswordRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ResetFabricOrganizationUserPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ResetFabricOrganizationUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetFabricOrganizationUserPasswordRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
