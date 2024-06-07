// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddAxnTrackNoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private number in the AXN binding, that is, phone number X.</p>
     * <br>
     * <p>You can call the [BindAxn](https://help.aliyun.com/document_detail/110258.html) operation to obtain the value of PhoneNoX.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

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
     * <p>The binding ID.</p>
     * <br>
     * <p>You can call the [BindAxn](https://help.aliyun.com/document_detail/110258.html) operation to obtain the value of SubsId.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    /**
     * <p>The tracking number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("trackNo")
    public String trackNo;

    public static AddAxnTrackNoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAxnTrackNoRequest self = new AddAxnTrackNoRequest();
        return TeaModel.build(map, self);
    }

    public AddAxnTrackNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAxnTrackNoRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public AddAxnTrackNoRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public AddAxnTrackNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAxnTrackNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddAxnTrackNoRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

    public AddAxnTrackNoRequest setTrackNo(String trackNo) {
        this.trackNo = trackNo;
        return this;
    }
    public String getTrackNo() {
        return this.trackNo;
    }

}
