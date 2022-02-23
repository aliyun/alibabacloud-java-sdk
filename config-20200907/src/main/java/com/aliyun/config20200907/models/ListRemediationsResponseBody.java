// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationsResponseBody extends TeaModel {
    @NameInMap("Remediations")
    public java.util.List<ListRemediationsResponseBodyRemediations> remediations;

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

        @NameInMap("RemediationDynamicParams")
        public String remediationDynamicParams;

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

        public ListRemediationsResponseBodyRemediations setRemediationDynamicParams(String remediationDynamicParams) {
            this.remediationDynamicParams = remediationDynamicParams;
            return this;
        }
        public String getRemediationDynamicParams() {
            return this.remediationDynamicParams;
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
