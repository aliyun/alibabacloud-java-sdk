// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsResponseBody extends TeaModel {
    /**
     * <p>An array that contains remediation templates.</p>
     */
    @NameInMap("Remediations")
    public java.util.List<ListAggregateRemediationsResponseBodyRemediations> remediations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0146963A-20C0-4E75-B93A-7D622B5FD7C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsResponseBody self = new ListAggregateRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsResponseBody setRemediations(java.util.List<ListAggregateRemediationsResponseBodyRemediations> remediations) {
        this.remediations = remediations;
        return this;
    }
    public java.util.List<ListAggregateRemediationsResponseBodyRemediations> getRemediations() {
        return this.remediations;
    }

    public ListAggregateRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateRemediationsResponseBodyRemediations extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-6b4a626622af0012****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-6b7c626622af00b4****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The execution mode of the remediation template. Valid values:</p>
         * <ul>
         * <li>NON_EXECUTION: The remediation template is not executed.</li>
         * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
         * <li>NOT_CONFIG: The execution mode is not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO_EXECUTION</p>
         */
        @NameInMap("InvokeType")
        public String invokeType;

        /**
         * <p>The ID of the last successful execution of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>bd7629fb-cac8-42fe-bcb1-e362c5a6****</p>
         */
        @NameInMap("LastSuccessfulInvocationId")
        public String lastSuccessfulInvocationId;

        /**
         * <p>The timestamp of the last successful execution of the remediation template. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625451393589</p>
         */
        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        /**
         * <p>The mode of the last successful execution of the remediation template. Valid values:</p>
         * <ul>
         * <li>NON_EXECUTION: The remediation template is not executed.</li>
         * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
         * <li>NOT_CONFIG: The execution mode is not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO_EXECUTION</p>
         */
        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        /**
         * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
         */
        @NameInMap("RemediaitonOriginParams")
        public String remediaitonOriginParams;

        /**
         * <p>The ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-6b7c626622af0026****</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>The source of remediation template. Valid values:</p>
         * <ul>
         * <li>ALIYUN: official template.</li>
         * <li>CUSTOM: custom template.</li>
         * <li>NONE: none.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("RemediationSourceType")
        public String remediationSourceType;

        /**
         * <p>The ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-OSS-PutBucketAcl</p>
         */
        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        /**
         * <p>The type of the remediation template. Valid values:</p>
         * <ul>
         * <li>OOS: Operation Orchestration Service (official remediation).</li>
         * <li>FC: Function Compute (custom remediation).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("RemediationType")
        public String remediationType;

        public static ListAggregateRemediationsResponseBodyRemediations build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRemediationsResponseBodyRemediations self = new ListAggregateRemediationsResponseBodyRemediations();
            return TeaModel.build(map, self);
        }

        public ListAggregateRemediationsResponseBodyRemediations setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
            this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
            return this;
        }
        public String getLastSuccessfulInvocationId() {
            return this.lastSuccessfulInvocationId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
            this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
            return this;
        }
        public Long getLastSuccessfulInvocationTime() {
            return this.lastSuccessfulInvocationTime;
        }

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
            this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
            return this;
        }
        public String getLastSuccessfulInvocationType() {
            return this.lastSuccessfulInvocationType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediaitonOriginParams(String remediaitonOriginParams) {
            this.remediaitonOriginParams = remediaitonOriginParams;
            return this;
        }
        public String getRemediaitonOriginParams() {
            return this.remediaitonOriginParams;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationSourceType(String remediationSourceType) {
            this.remediationSourceType = remediationSourceType;
            return this;
        }
        public String getRemediationSourceType() {
            return this.remediationSourceType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationTemplateId(String remediationTemplateId) {
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

    }

}
