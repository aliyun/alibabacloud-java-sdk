// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetUserLoginInfoRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPrincipalName")
    public String accountPrincipalName;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("CurrentPk")
    public String currentPk;

    @NameInMap("MainAccountPk")
    public String mainAccountPk;

    public static GetUserLoginInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserLoginInfoRequest self = new GetUserLoginInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserLoginInfoRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetUserLoginInfoRequest setAccountPrincipalName(String accountPrincipalName) {
        this.accountPrincipalName = accountPrincipalName;
        return this;
    }
    public String getAccountPrincipalName() {
        return this.accountPrincipalName;
    }

    public GetUserLoginInfoRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetUserLoginInfoRequest setCurrentPk(String currentPk) {
        this.currentPk = currentPk;
        return this;
    }
    public String getCurrentPk() {
        return this.currentPk;
    }

    public GetUserLoginInfoRequest setMainAccountPk(String mainAccountPk) {
        this.mainAccountPk = mainAccountPk;
        return this;
    }
    public String getMainAccountPk() {
        return this.mainAccountPk;
    }

}
