// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallRequest extends TeaModel {
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
    public WhatsappCallRequestSession session;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("UserNumber")
    public String userNumber;

    public static WhatsappCallRequest build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallRequest self = new WhatsappCallRequest();
        return TeaModel.build(map, self);
    }

    public WhatsappCallRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public WhatsappCallRequest setCallAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
    public String getCallAction() {
        return this.callAction;
    }

    public WhatsappCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public WhatsappCallRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public WhatsappCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public WhatsappCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public WhatsappCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public WhatsappCallRequest setSession(WhatsappCallRequestSession session) {
        this.session = session;
        return this;
    }
    public WhatsappCallRequestSession getSession() {
        return this.session;
    }

    public WhatsappCallRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

    public static class WhatsappCallRequestSession extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Sdp")
        public String sdp;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("SdpType")
        public String sdpType;

        public static WhatsappCallRequestSession build(java.util.Map<String, ?> map) throws Exception {
            WhatsappCallRequestSession self = new WhatsappCallRequestSession();
            return TeaModel.build(map, self);
        }

        public WhatsappCallRequestSession setSdp(String sdp) {
            this.sdp = sdp;
            return this;
        }
        public String getSdp() {
            return this.sdp;
        }

        public WhatsappCallRequestSession setSdpType(String sdpType) {
            this.sdpType = sdpType;
            return this;
        }
        public String getSdpType() {
            return this.sdpType;
        }

    }

}
