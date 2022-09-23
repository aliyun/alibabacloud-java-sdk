// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class PoolConfigRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("CallbackType")
    public Integer callbackType;

    @NameInMap("FrozenDay")
    public Integer frozenDay;

    @NameInMap("NeedAllCallRecords")
    public Boolean needAllCallRecords;

    @NameInMap("OpenSmsWhite")
    public Boolean openSmsWhite;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolWarningLimit")
    public Integer poolWarningLimit;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SelectXMode")
    public String selectXMode;

    @NameInMap("SmartSmsWhitelist")
    public String smartSmsWhitelist;

    @NameInMap("SmsChannel")
    public String smsChannel;

    public static PoolConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PoolConfigRequest self = new PoolConfigRequest();
        return TeaModel.build(map, self);
    }

    public PoolConfigRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public PoolConfigRequest setCallbackType(Integer callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public Integer getCallbackType() {
        return this.callbackType;
    }

    public PoolConfigRequest setFrozenDay(Integer frozenDay) {
        this.frozenDay = frozenDay;
        return this;
    }
    public Integer getFrozenDay() {
        return this.frozenDay;
    }

    public PoolConfigRequest setNeedAllCallRecords(Boolean needAllCallRecords) {
        this.needAllCallRecords = needAllCallRecords;
        return this;
    }
    public Boolean getNeedAllCallRecords() {
        return this.needAllCallRecords;
    }

    public PoolConfigRequest setOpenSmsWhite(Boolean openSmsWhite) {
        this.openSmsWhite = openSmsWhite;
        return this;
    }
    public Boolean getOpenSmsWhite() {
        return this.openSmsWhite;
    }

    public PoolConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PoolConfigRequest setPoolWarningLimit(Integer poolWarningLimit) {
        this.poolWarningLimit = poolWarningLimit;
        return this;
    }
    public Integer getPoolWarningLimit() {
        return this.poolWarningLimit;
    }

    public PoolConfigRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public PoolConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PoolConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PoolConfigRequest setSelectXMode(String selectXMode) {
        this.selectXMode = selectXMode;
        return this;
    }
    public String getSelectXMode() {
        return this.selectXMode;
    }

    public PoolConfigRequest setSmartSmsWhitelist(String smartSmsWhitelist) {
        this.smartSmsWhitelist = smartSmsWhitelist;
        return this;
    }
    public String getSmartSmsWhitelist() {
        return this.smartSmsWhitelist;
    }

    public PoolConfigRequest setSmsChannel(String smsChannel) {
        this.smsChannel = smsChannel;
        return this;
    }
    public String getSmsChannel() {
        return this.smsChannel;
    }

}
