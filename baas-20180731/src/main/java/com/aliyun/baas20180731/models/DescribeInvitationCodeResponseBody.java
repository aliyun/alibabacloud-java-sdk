// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInvitationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeInvitationCodeResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInvitationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvitationCodeResponseBody self = new DescribeInvitationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvitationCodeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeInvitationCodeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeInvitationCodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeInvitationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvitationCodeResponseBody setResult(DescribeInvitationCodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInvitationCodeResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeInvitationCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInvitationCodeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Accepted")
        public Boolean accepted;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@126.com">abc@126.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        /**
         * <strong>example:</strong>
         * <p>27534</p>
         */
        @NameInMap("SenderBid")
        public String senderBid;

        /**
         * <strong>example:</strong>
         * <p>26345345</p>
         */
        @NameInMap("SenderId")
        public Long senderId;

        /**
         * <strong>example:</strong>
         * <p>uid-35324</p>
         */
        @NameInMap("SenderName")
        public String senderName;

        /**
         * <p>URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://baas.console.aliyun.test/invite?code=92e7ef1934892">http://baas.console.aliyun.test/invite?code=92e7ef1934892</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeInvitationCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvitationCodeResponseBodyResult self = new DescribeInvitationCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvitationCodeResponseBodyResult setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

        public DescribeInvitationCodeResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInvitationCodeResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeInvitationCodeResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeInvitationCodeResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInvitationCodeResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeInvitationCodeResponseBodyResult setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public DescribeInvitationCodeResponseBodyResult setSenderBid(String senderBid) {
            this.senderBid = senderBid;
            return this;
        }
        public String getSenderBid() {
            return this.senderBid;
        }

        public DescribeInvitationCodeResponseBodyResult setSenderId(Long senderId) {
            this.senderId = senderId;
            return this;
        }
        public Long getSenderId() {
            return this.senderId;
        }

        public DescribeInvitationCodeResponseBodyResult setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public DescribeInvitationCodeResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
