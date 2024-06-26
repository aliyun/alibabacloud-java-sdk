// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumMemberApprovalResponseBody extends TeaModel {
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
    public java.util.List<DescribeConsortiumMemberApprovalResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumMemberApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumMemberApprovalResponseBody self = new DescribeConsortiumMemberApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumMemberApprovalResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumMemberApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumMemberApprovalResponseBody setResult(java.util.List<DescribeConsortiumMemberApprovalResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumMemberApprovalResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumMemberApprovalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumMemberApprovalResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Any</p>
         */
        @NameInMap("ChannelCreatePolicy")
        public String channelCreatePolicy;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("ConfirmTime")
        public String confirmTime;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
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
         * <p>domain</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>orgname</p>
         */
        @NameInMap("OrganizationName")
        public String organizationName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeConsortiumMemberApprovalResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumMemberApprovalResponseBodyResult self = new DescribeConsortiumMemberApprovalResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setChannelCreatePolicy(String channelCreatePolicy) {
            this.channelCreatePolicy = channelCreatePolicy;
            return this;
        }
        public String getChannelCreatePolicy() {
            return this.channelCreatePolicy;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setConfirmTime(String confirmTime) {
            this.confirmTime = confirmTime;
            return this;
        }
        public String getConfirmTime() {
            return this.confirmTime;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeConsortiumMemberApprovalResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
