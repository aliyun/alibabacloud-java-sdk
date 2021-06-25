// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateScmConfigRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

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

    public static UpdateScmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScmConfigRequest self = new UpdateScmConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScmConfigRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateScmConfigRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public UpdateScmConfigRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateScmConfigRequest setRepoDomain(String repoDomain) {
        this.repoDomain = repoDomain;
        return this;
    }
    public String getRepoDomain() {
        return this.repoDomain;
    }

    public UpdateScmConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateScmConfigRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateScmConfigRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
