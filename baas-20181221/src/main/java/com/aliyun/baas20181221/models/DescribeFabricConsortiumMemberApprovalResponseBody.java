// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMemberApprovalResponseBody extends TeaModel {
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
    public java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumMemberApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMemberApprovalResponseBody self = new DescribeFabricConsortiumMemberApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setResult(java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricConsortiumMemberApprovalResponseBodyResult extends TeaModel {
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

        public static DescribeFabricConsortiumMemberApprovalResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumMemberApprovalResponseBodyResult self = new DescribeFabricConsortiumMemberApprovalResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setChannelCreatePolicy(String channelCreatePolicy) {
            this.channelCreatePolicy = channelCreatePolicy;
            return this;
        }
        public String getChannelCreatePolicy() {
            return this.channelCreatePolicy;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setConfirmTime(String confirmTime) {
            this.confirmTime = confirmTime;
            return this;
        }
        public String getConfirmTime() {
            return this.confirmTime;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
