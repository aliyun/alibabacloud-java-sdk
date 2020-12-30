// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotChgBindOrUnBindRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Imei")
    public String imei;

    @NameInMap("NewImei")
    public String newImei;

    @NameInMap("OpionType")
    public String opionType;

    @NameInMap("MidChannelId")
    public String midChannelId;

    public static DoIotChgBindOrUnBindRequest build(java.util.Map<String, ?> map) throws Exception {
        DoIotChgBindOrUnBindRequest self = new DoIotChgBindOrUnBindRequest();
        return TeaModel.build(map, self);
    }

    public DoIotChgBindOrUnBindRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DoIotChgBindOrUnBindRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DoIotChgBindOrUnBindRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DoIotChgBindOrUnBindRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public DoIotChgBindOrUnBindRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public DoIotChgBindOrUnBindRequest setNewImei(String newImei) {
        this.newImei = newImei;
        return this;
    }
    public String getNewImei() {
        return this.newImei;
    }

    public DoIotChgBindOrUnBindRequest setOpionType(String opionType) {
        this.opionType = opionType;
        return this;
    }
    public String getOpionType() {
        return this.opionType;
    }

    public DoIotChgBindOrUnBindRequest setMidChannelId(String midChannelId) {
        this.midChannelId = midChannelId;
        return this;
    }
    public String getMidChannelId() {
        return this.midChannelId;
    }

}
