// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddAxnTrackNoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private number in the AXN binding, that is, phone number X.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/110258.html">BindAxn</a> operation to obtain the value of PhoneNoX.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000****</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The binding ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/110258.html">BindAxn</a> operation to obtain the value of SubsId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15678890****</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    /**
     * <p>The tracking number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abcde*****</p>
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
