// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreateScmConfigRequest extends TeaModel {
    @NameInMap("RepoType")
    @Validation(required = true)
    public String repoType;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("RepoDomain")
    @Validation(required = true)
    public String repoDomain;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("Token")
    public String token;

    @NameInMap("Identifier")
    public String identifier;

    public static CreateScmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScmConfigRequest self = new CreateScmConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateScmConfigRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public CreateScmConfigRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateScmConfigRequest setRepoDomain(String repoDomain) {
        this.repoDomain = repoDomain;
        return this;
    }
    public String getRepoDomain() {
        return this.repoDomain;
    }

    public CreateScmConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateScmConfigRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateScmConfigRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
