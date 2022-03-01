// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricInvitationCodeResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricInvitationCodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricInvitationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricInvitationCodeResponseBody self = new DescribeFabricInvitationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricInvitationCodeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeFabricInvitationCodeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeFabricInvitationCodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricInvitationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricInvitationCodeResponseBody setResult(DescribeFabricInvitationCodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricInvitationCodeResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricInvitationCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricInvitationCodeResponseBodyResult extends TeaModel {
        @NameInMap("Accepted")
        public Boolean accepted;

        @NameInMap("Code")
        public String code;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InvitationId")
        public Integer invitationId;

        @NameInMap("SendTime")
        public String sendTime;

        @NameInMap("SenderBid")
        public String senderBid;

        @NameInMap("SenderId")
        public Long senderId;

        @NameInMap("SenderName")
        public String senderName;

        @NameInMap("Url")
        public String url;

        public static DescribeFabricInvitationCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricInvitationCodeResponseBodyResult self = new DescribeFabricInvitationCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricInvitationCodeResponseBodyResult setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setInvitationId(Integer invitationId) {
            this.invitationId = invitationId;
            return this;
        }
        public Integer getInvitationId() {
            return this.invitationId;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setSenderBid(String senderBid) {
            this.senderBid = senderBid;
            return this;
        }
        public String getSenderBid() {
            return this.senderBid;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setSenderId(Long senderId) {
            this.senderId = senderId;
            return this;
        }
        public Long getSenderId() {
            return this.senderId;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public DescribeFabricInvitationCodeResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
