// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountWithKeyPairAutoCreationRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Password")
    public String password;

    @NameInMap("RecoverPassword")
    public String recoverPassword;

    public static CreateAntChainAccountWithKeyPairAutoCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountWithKeyPairAutoCreationRequest self = new CreateAntChainAccountWithKeyPairAutoCreationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountWithKeyPairAutoCreationRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationRequest setRecoverPassword(String recoverPassword) {
        this.recoverPassword = recoverPassword;
        return this;
    }
    public String getRecoverPassword() {
        return this.recoverPassword;
    }

}
