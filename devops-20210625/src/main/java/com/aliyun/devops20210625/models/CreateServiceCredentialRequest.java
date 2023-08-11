// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceCredentialRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("password")
    public String password;

    @NameInMap("scope")
    public String scope;

    @NameInMap("type")
    public String type;

    @NameInMap("username")
    public String username;

    public static CreateServiceCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCredentialRequest self = new CreateServiceCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateServiceCredentialRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateServiceCredentialRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateServiceCredentialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateServiceCredentialRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
