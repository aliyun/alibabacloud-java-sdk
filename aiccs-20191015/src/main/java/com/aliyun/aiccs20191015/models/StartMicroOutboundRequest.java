// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartMicroOutboundRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>223457****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>BUC_TYPE</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>0571456****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>1367123****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <strong>example:</strong>
     * <p>outBound_Call</p>
     */
    @NameInMap("CommandCode")
    public String commandCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;caseId&quot;:23232****}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>aiccs</p>
     */
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
