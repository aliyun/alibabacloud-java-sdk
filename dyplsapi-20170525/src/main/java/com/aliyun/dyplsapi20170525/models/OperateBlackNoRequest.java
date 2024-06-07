// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateBlackNoRequest extends TeaModel {
    /**
     * <p>The phone number to be added to or deleted from the blacklist.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlackNo")
    public String blackNo;

    /**
     * <p>The type of the operation on the phone number. Valid values:</p>
     * <br>
     * <p>*   **AddBlack**: adds the phone number to the blacklist.</p>
     * <p>*   **DeleteBlack**: deletes the phone number from the blacklist.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Tips")
    public String tips;

    public static OperateBlackNoRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBlackNoRequest self = new OperateBlackNoRequest();
        return TeaModel.build(map, self);
    }

    public OperateBlackNoRequest setBlackNo(String blackNo) {
        this.blackNo = blackNo;
        return this;
    }
    public String getBlackNo() {
        return this.blackNo;
    }

    public OperateBlackNoRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateBlackNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OperateBlackNoRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public OperateBlackNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OperateBlackNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public OperateBlackNoRequest setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

}
