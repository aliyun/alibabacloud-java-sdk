// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CallAction")
    public String callAction;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Session")
    public String sessionShrink;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("UserNumber")
    public String userNumber;

    public static WhatsappCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallShrinkRequest self = new WhatsappCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public WhatsappCallShrinkRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public WhatsappCallShrinkRequest setCallAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
    public String getCallAction() {
        return this.callAction;
    }

    public WhatsappCallShrinkRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public WhatsappCallShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public WhatsappCallShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public WhatsappCallShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public WhatsappCallShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public WhatsappCallShrinkRequest setSessionShrink(String sessionShrink) {
        this.sessionShrink = sessionShrink;
        return this;
    }
    public String getSessionShrink() {
        return this.sessionShrink;
    }

    public WhatsappCallShrinkRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
