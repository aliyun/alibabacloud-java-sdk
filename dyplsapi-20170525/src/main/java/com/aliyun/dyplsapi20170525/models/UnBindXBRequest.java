// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindXBRequest extends TeaModel {
    /**
     * <p>The unique ID of the XB binding relationship.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34*****46</p>
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
     * <p>The number pool key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC5**********************a1a</p>
     */
    @NameInMap("CustomerPoolKey")
    public String customerPoolKey;

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
     * <p>The number X.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17*******22</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static UnBindXBRequest build(java.util.Map<String, ?> map) throws Exception {
        UnBindXBRequest self = new UnBindXBRequest();
        return TeaModel.build(map, self);
    }

    public UnBindXBRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public UnBindXBRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public UnBindXBRequest setCustomerPoolKey(String customerPoolKey) {
        this.customerPoolKey = customerPoolKey;
        return this;
    }
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    public UnBindXBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnBindXBRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public UnBindXBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnBindXBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnBindXBRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
