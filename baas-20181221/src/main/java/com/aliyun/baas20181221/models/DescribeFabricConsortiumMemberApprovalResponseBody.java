// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMemberApprovalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> result;

    public static DescribeFabricConsortiumMemberApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMemberApprovalResponseBody self = new DescribeFabricConsortiumMemberApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumMemberApprovalResponseBody setResult(java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumMemberApprovalResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumMemberApprovalResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("State")
        public String state;

        @NameInMap("ChannelCreatePolicy")
        public String channelCreatePolicy;

        @NameInMap("ConfirmTime")
        public String confirmTime;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static DescribeFabricConsortiumMemberApprovalResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumMemberApprovalResponseBodyResult self = new DescribeFabricConsortiumMemberApprovalResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public DescribeFabricConsortiumMemberApprovalResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
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

    }

}
