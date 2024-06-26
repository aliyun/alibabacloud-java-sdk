// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInvitationListResponseBody extends TeaModel {
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
    public java.util.List<DescribeInvitationListResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInvitationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvitationListResponseBody self = new DescribeInvitationListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvitationListResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeInvitationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvitationListResponseBody setResult(java.util.List<DescribeInvitationListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeInvitationListResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeInvitationListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInvitationListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p><a href="mailto:abc@alibaba.com">abc@alibaba.com</a></p>
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
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        public static DescribeInvitationListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvitationListResponseBodyResult self = new DescribeInvitationListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvitationListResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInvitationListResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeInvitationListResponseBodyResult setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeInvitationListResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInvitationListResponseBodyResult setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

    }

}
