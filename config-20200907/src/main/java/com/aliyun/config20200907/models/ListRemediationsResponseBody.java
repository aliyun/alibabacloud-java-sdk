// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationsResponseBody extends TeaModel {
    /**
     * <p>The remediation settings returned.</p>
     */
    @NameInMap("Remediations")
    public java.util.List<ListRemediationsResponseBodyRemediations> remediations;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationsResponseBody self = new ListRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemediationsResponseBody setRemediations(java.util.List<ListRemediationsResponseBodyRemediations> remediations) {
        this.remediations = remediations;
        return this;
    }
    public java.util.List<ListRemediationsResponseBodyRemediations> getRemediations() {
        return this.remediations;
    }

    public ListRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRemediationsResponseBodyRemediations extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account involved.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The execution mode of the remediation template. Valid values:</p>
         * <br>
         * <p>*   NON_EXECUTION: no execution.</p>
         * <p>*   AUTO_EXECUTION: automatic execution.</p>
         * <p>*   MANUAL_EXECUTION: manual execution.</p>
         * <p>*   NOT_CONFIG: not specified.</p>
         */
        @NameInMap("InvokeType")
        public String invokeType;

        /**
         * <p>The ID of the last successful execution of the remediation template.</p>
         */
        @NameInMap("LastSuccessfulInvocationId")
        public String lastSuccessfulInvocationId;

        /**
         * <p>The timestamp of the last successful execution of the remediation template Unit: milliseconds.</p>
         */
        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        /**
         * <p>The mode of the last successful execution of the remediation template. Valid values:</p>
         * <br>
         * <p>*   NON_EXECUTION: no execution.</p>
         * <p>*   AUTO_EXECUTION: automatic execution.</p>
         * <p>*   MANUAL_EXECUTION: manual execution.</p>
         * <p>*   NOT_CONFIG: not specified.</p>
         */
        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        /**
         * <p>The ID of the remediation setting.</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
         */
        @NameInMap("RemediationOriginParams")
        public String remediationOriginParams;

        /**
         * <p>The source of remediation. Valid values:</p>
         * <br>
         * <p>*   ALIYUN: official template.</p>
         * <p>*   CUSTOM: custom template.</p>
         * <p>*   NONE: none.</p>
         */
        @NameInMap("RemediationSourceType")
        public String remediationSourceType;

        /**
         * <p>The identifier of the remediation template.</p>
         */
        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        /**
         * <p>The type of remediation to perform. Valid values:</p>
         * <br>
         * <p>*   OOS: stands for Operation Orchestration Service and indicates official remediation.</p>
         * <p>*   FC: stands for Function Compute and indicates custom remediation.</p>
         */
        @NameInMap("RemediationType")
        public String remediationType;

        public static ListRemediationsResponseBodyRemediations build(java.util.Map<String, ?> map) throws Exception {
            ListRemediationsResponseBodyRemediations self = new ListRemediationsResponseBodyRemediations();
            return TeaModel.build(map, self);
        }

        public ListRemediationsResponseBodyRemediations setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListRemediationsResponseBodyRemediations setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListRemediationsResponseBodyRemediations setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public ListRemediationsResponseBodyRemediations setLastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
            this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
            return this;
        }
        public String getLastSuccessfulInvocationId() {
            return this.lastSuccessfulInvocationId;
        }

        public ListRemediationsResponseBodyRemediations setLastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
            this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
            return this;
        }
        public Long getLastSuccessfulInvocationTime() {
            return this.lastSuccessfulInvocationTime;
        }

        public ListRemediationsResponseBodyRemediations setLastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
            this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
            return this;
        }
        public String getLastSuccessfulInvocationType() {
            return this.lastSuccessfulInvocationType;
        }

        public ListRemediationsResponseBodyRemediations setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public ListRemediationsResponseBodyRemediations setRemediationOriginParams(String remediationOriginParams) {
            this.remediationOriginParams = remediationOriginParams;
            return this;
        }
        public String getRemediationOriginParams() {
            return this.remediationOriginParams;
        }

        public ListRemediationsResponseBodyRemediations setRemediationSourceType(String remediationSourceType) {
            this.remediationSourceType = remediationSourceType;
            return this;
        }
        public String getRemediationSourceType() {
            return this.remediationSourceType;
        }

        public ListRemediationsResponseBodyRemediations setRemediationTemplateId(String remediationTemplateId) {
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

        public ListRemediationsResponseBodyRemediations setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

    }

}
