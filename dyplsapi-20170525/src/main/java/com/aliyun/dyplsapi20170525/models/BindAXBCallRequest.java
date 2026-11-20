// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAXBCallRequest extends TeaModel {
    /**
     * <p>The unique ID of the BX binding relationship.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12353</p>
     */
    @NameInMap("AuthId")
    public String authId;

    /**
     * <p>The customer UID. This parameter is automatically obtained by the system and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>The key of the number pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC5**********************a1a</p>
     */
    @NameInMap("CustomerPoolKey")
    public String customerPoolKey;

    /**
     * <p>The expiration time of the binding relationship. The value must be greater than 0. Unit: seconds. The automatic unbinding time is calculated by adding the binding time and the expiration time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The request deduplication ID. The maximum length is 20 characters. Ensure the atomicity of the request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>564**********879</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The phone number of customer A.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13*******43</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The custom callback parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>000</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static BindAXBCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAXBCallRequest self = new BindAXBCallRequest();
        return TeaModel.build(map, self);
    }

    public BindAXBCallRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public BindAXBCallRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public BindAXBCallRequest setCustomerPoolKey(String customerPoolKey) {
        this.customerPoolKey = customerPoolKey;
        return this;
    }
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    public BindAXBCallRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public BindAXBCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAXBCallRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public BindAXBCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAXBCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAXBCallRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAXBCallRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
