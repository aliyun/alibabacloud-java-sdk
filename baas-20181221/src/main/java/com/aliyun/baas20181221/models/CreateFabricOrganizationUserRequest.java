// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricOrganizationUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>foo=foo1,bar=bar1</p>
     */
    @NameInMap("Attrs")
    public String attrs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-yidio-1tuigx42b****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static CreateFabricOrganizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricOrganizationUserRequest self = new CreateFabricOrganizationUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricOrganizationUserRequest setAttrs(String attrs) {
        this.attrs = attrs;
        return this;
    }
    public String getAttrs() {
        return this.attrs;
    }

    public CreateFabricOrganizationUserRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateFabricOrganizationUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateFabricOrganizationUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
