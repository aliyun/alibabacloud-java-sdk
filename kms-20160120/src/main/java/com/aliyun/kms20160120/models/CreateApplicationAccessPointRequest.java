// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateApplicationAccessPointRequest extends TeaModel {
    @NameInMap("AuthenticationMethod")
    public String authenticationMethod;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policies")
    public String policies;

    public static CreateApplicationAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAccessPointRequest self = new CreateApplicationAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAccessPointRequest setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public CreateApplicationAccessPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationAccessPointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationAccessPointRequest setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

}
