// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoRequest extends TeaModel {
    /**
     * <p>Specifies the home location of the phone number.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The home location can be set only to a location in the Chinese mainland.</p>
     * </li>
     * <li><p>A phone number that starts with 95 does not have a home location. If you purchase a phone number that starts with 95, set this parameter to <strong>Nationwide</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Specifies whether to add the phone number to the pool of numbers that will be displayed during calls.</p>
     * <blockquote>
     * <p> This parameter takes effect only for customers who have enabled the number display feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayPool")
    public Boolean displayPool;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The prefix of the phone number. If you specify the value of <strong>SecretNo</strong> when you purchase a phone number, a phone number starting with the specified prefix is selected.</p>
     * <blockquote>
     * <p> You can specify up to 18 digits of the phone number prefix.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>130</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    /**
     * <p>The type of the phone number. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: a phone number assigned by a virtual network operator, that is, a phone number that belongs to the 170 or 171 number segment.</li>
     * <li><strong>2</strong>: a phone number provided by a carrier.</li>
     * <li><strong>3</strong>: a phone number that starts with 95.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpecId")
    public Long specId;

    public static BuySecretNoRequest build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoRequest self = new BuySecretNoRequest();
        return TeaModel.build(map, self);
    }

    public BuySecretNoRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public BuySecretNoRequest setDisplayPool(Boolean displayPool) {
        this.displayPool = displayPool;
        return this;
    }
    public Boolean getDisplayPool() {
        return this.displayPool;
    }

    public BuySecretNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BuySecretNoRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BuySecretNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BuySecretNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BuySecretNoRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public BuySecretNoRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
