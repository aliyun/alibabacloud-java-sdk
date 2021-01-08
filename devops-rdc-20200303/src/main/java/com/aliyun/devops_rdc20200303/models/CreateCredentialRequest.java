// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Name")
    public String name;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserPk")
    public String userPk;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCredentialRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateCredentialRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateCredentialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCredentialRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
