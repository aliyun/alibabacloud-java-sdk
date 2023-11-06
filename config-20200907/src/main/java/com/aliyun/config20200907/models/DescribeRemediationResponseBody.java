// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeRemediationResponseBody extends TeaModel {
    /**
     * <p>The details of the remediation configuration.</p>
     */
    @NameInMap("Remediation")
    public DescribeRemediationResponseBodyRemediation remediation;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The execution mode of the remediation template. Valid values:</p>
         * <br>
         * <p>*   NON_EXECUTION: The remediation template was not executed.</p>
         * <p>*   AUTO_EXECUTION: The remediation template was automatically executed.</p>
         * <p>*   MANUAL_EXECUTION: The remediation template was manually executed.</p>
         * <p>*   NOT_CONFIG: The execution mode was not specified.</p>
         */
        @NameInMap("InvokeType")
        public String invokeType;

        /**
         * <p>The record ID of the last successful execution of the remediation template.</p>
         */
        @NameInMap("LastSuccessfulInvocationId")
        public String lastSuccessfulInvocationId;

        /**
         * <p>The timestamp of the last successful execution of the remediation template. Unit: milliseconds.</p>
         */
        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        /**
         * <p>The mode of the last successful execution of the remediation template. Valid values:</p>
         * <br>
         * <p>*   NON_EXECUTION: The remediation template was not executed.</p>
         * <p>*   AUTO_EXECUTION: The remediation template was automatically executed.</p>
         * <p>*   MANUAL_EXECUTION: The remediation template was manually executed.</p>
         * <p>*   NOT_CONFIG: The execution mode was not specified.</p>
         */
        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        /**
         * <p>The ID of the remediation configuration.</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
         */
        @NameInMap("RemediationOriginParams")
        public String remediationOriginParams;

        /**
         * <p>The source of the remediation template. Valid values:</p>
         * <br>
         * <p>*   ALIYUN: official template</p>
         * <p>*   CUSTOM: custom template</p>
         * <p>*   NONE: none</p>
         */
        @NameInMap("RemediationSourceType")
        public String remediationSourceType;

        /**
         * <p>The ID of the remediation template.</p>
         */
        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        /**
         * <p>The type of the remediation template. Valid values:</p>
         * <br>
         * <p>*   OOS: Operation Orchestration Service (official remediation)</p>
         * <p>*   FC: Function Compute (custom remediation)</p>
         */
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
