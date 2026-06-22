// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallShrinkRequest extends TeaModel {
    /**
     * <p>The business number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86138***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The action to perform on the call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connect</p>
     */
    @NameInMap("CallAction")
    public String callAction;

    /**
     * <p>The call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wamid-xx**</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The Space ID of the ISV sub-customer, or the instance ID of the direct customer. View the Space ID on the</p>
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xx**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The call negotiation information.</p>
     */
    @NameInMap("Session")
    public String sessionShrink;

    /**
     * <p>The user\&quot;s number.</p>
     * 
     * <strong>example:</strong>
     * <p>86131***</p>
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
