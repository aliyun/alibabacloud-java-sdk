// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInviterResponseBody extends TeaModel {
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
    public DescribeInviterResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInviterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInviterResponseBody self = new DescribeInviterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInviterResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeInviterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInviterResponseBody setResult(DescribeInviterResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeInviterResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeInviterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInviterResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ConsortiumName")
        public String consortiumName;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>3524234</p>
         */
        @NameInMap("InviterId")
        public Long inviterId;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("InviterName")
        public String inviterName;

        public static DescribeInviterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInviterResponseBodyResult self = new DescribeInviterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeInviterResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeInviterResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeInviterResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInviterResponseBodyResult setInviterId(Long inviterId) {
            this.inviterId = inviterId;
            return this;
        }
        public Long getInviterId() {
            return this.inviterId;
        }

        public DescribeInviterResponseBodyResult setInviterName(String inviterName) {
            this.inviterName = inviterName;
            return this;
        }
        public String getInviterName() {
            return this.inviterName;
        }

    }

}
