// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsSignRequest extends TeaModel {
    /**
     * <p>收信人号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>178****3614</p>
     */
    @NameInMap("CalledNo")
    public String calledNo;

    /**
     * <p>客户uid</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>发信人号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150****6539</p>
     */
    @NameInMap("CallingNo")
    public String callingNo;

    /**
     * <p>号码池key</p>
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
     * <p>请求去重ID, reqId最大长度为20位,接入方需要保持原子性</p>
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

    public static CreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignRequest self = new CreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignRequest setCalledNo(String calledNo) {
        this.calledNo = calledNo;
        return this;
    }
    public String getCalledNo() {
        return this.calledNo;
    }

    public CreateSmsSignRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public CreateSmsSignRequest setCallingNo(String callingNo) {
        this.callingNo = callingNo;
        return this;
    }
    public String getCallingNo() {
        return this.callingNo;
    }

    public CreateSmsSignRequest setCustomerPoolKey(String customerPoolKey) {
        this.customerPoolKey = customerPoolKey;
        return this;
    }
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    public CreateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public CreateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
