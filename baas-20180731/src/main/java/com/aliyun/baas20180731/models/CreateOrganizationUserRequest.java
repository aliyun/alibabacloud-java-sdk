// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOrganizationUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a</p>
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

    public static CreateOrganizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationUserRequest self = new CreateOrganizationUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationUserRequest setAttrs(String attrs) {
        this.attrs = attrs;
        return this;
    }
    public String getAttrs() {
        return this.attrs;
    }

    public CreateOrganizationUserRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateOrganizationUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOrganizationUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
