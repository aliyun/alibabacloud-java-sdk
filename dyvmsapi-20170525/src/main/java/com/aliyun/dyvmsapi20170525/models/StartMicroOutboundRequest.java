// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartMicroOutboundRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CommandCode")
    public String commandCode;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartMicroOutboundRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundRequest self = new StartMicroOutboundRequest();
        return TeaModel.build(map, self);
    }

    public StartMicroOutboundRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartMicroOutboundRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public StartMicroOutboundRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartMicroOutboundRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public StartMicroOutboundRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public StartMicroOutboundRequest setCommandCode(String commandCode) {
        this.commandCode = commandCode;
        return this;
    }
    public String getCommandCode() {
        return this.commandCode;
    }

    public StartMicroOutboundRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public StartMicroOutboundRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartMicroOutboundRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public StartMicroOutboundRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartMicroOutboundRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
