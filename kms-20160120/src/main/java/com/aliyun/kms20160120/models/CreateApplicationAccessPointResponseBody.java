// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateApplicationAccessPointResponseBody extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    @NameInMap("AuthenticationMethod")
    public String authenticationMethod;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policies")
    public String policies;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAccessPointResponseBody self = new CreateApplicationAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAccessPointResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateApplicationAccessPointResponseBody setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public CreateApplicationAccessPointResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationAccessPointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationAccessPointResponseBody setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

    public CreateApplicationAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
