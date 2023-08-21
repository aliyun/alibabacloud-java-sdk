// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeRemediationResponseBody extends TeaModel {
    @NameInMap("Remediation")
    public DescribeRemediationResponseBodyRemediation remediation;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRemediationResponseBody self = new DescribeRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRemediationResponseBody setRemediation(DescribeRemediationResponseBodyRemediation remediation) {
        this.remediation = remediation;
        return this;
    }
    public DescribeRemediationResponseBodyRemediation getRemediation() {
        return this.remediation;
    }

    public DescribeRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRemediationResponseBodyRemediation extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("LastSuccessfulInvocationId")
        public String lastSuccessfulInvocationId;

        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        @NameInMap("RemediationId")
        public String remediationId;

        @NameInMap("RemediationOriginParams")
        public String remediationOriginParams;

        @NameInMap("RemediationSourceType")
        public String remediationSourceType;

        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        @NameInMap("RemediationType")
        public String remediationType;

        public static DescribeRemediationResponseBodyRemediation build(java.util.Map<String, ?> map) throws Exception {
            DescribeRemediationResponseBodyRemediation self = new DescribeRemediationResponseBodyRemediation();
            return TeaModel.build(map, self);
        }

        public DescribeRemediationResponseBodyRemediation setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeRemediationResponseBodyRemediation setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DescribeRemediationResponseBodyRemediation setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public DescribeRemediationResponseBodyRemediation setLastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
            this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
            return this;
        }
        public String getLastSuccessfulInvocationId() {
            return this.lastSuccessfulInvocationId;
        }

        public DescribeRemediationResponseBodyRemediation setLastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
            this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
            return this;
        }
        public Long getLastSuccessfulInvocationTime() {
            return this.lastSuccessfulInvocationTime;
        }

        public DescribeRemediationResponseBodyRemediation setLastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
            this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
            return this;
        }
        public String getLastSuccessfulInvocationType() {
            return this.lastSuccessfulInvocationType;
        }

        public DescribeRemediationResponseBodyRemediation setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public DescribeRemediationResponseBodyRemediation setRemediationOriginParams(String remediationOriginParams) {
            this.remediationOriginParams = remediationOriginParams;
            return this;
        }
        public String getRemediationOriginParams() {
            return this.remediationOriginParams;
        }

        public DescribeRemediationResponseBodyRemediation setRemediationSourceType(String remediationSourceType) {
            this.remediationSourceType = remediationSourceType;
            return this;
        }
        public String getRemediationSourceType() {
            return this.remediationSourceType;
        }

        public DescribeRemediationResponseBodyRemediation setRemediationTemplateId(String remediationTemplateId) {
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

        public DescribeRemediationResponseBodyRemediation setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

    }

}
