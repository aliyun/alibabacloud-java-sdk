// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Remediations")
    public java.util.List<ListAggregateRemediationsResponseBodyRemediations> remediations;

    public static ListAggregateRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsResponseBody self = new ListAggregateRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAggregateRemediationsResponseBody setRemediations(java.util.List<ListAggregateRemediationsResponseBodyRemediations> remediations) {
        this.remediations = remediations;
        return this;
    }
    public java.util.List<ListAggregateRemediationsResponseBodyRemediations> getRemediations() {
        return this.remediations;
    }

    public static class ListAggregateRemediationsResponseBodyRemediations extends TeaModel {
        @NameInMap("RemediationTemplateId")
        public String remediationTemplateId;

        @NameInMap("RemediationDynamicParams")
        public String remediationDynamicParams;

        @NameInMap("RemediationSourceType")
        public String remediationSourceType;

        @NameInMap("RemediationType")
        public String remediationType;

        @NameInMap("LastSuccessfulInvocationId")
        public String lastSuccessfulInvocationId;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        @NameInMap("RemediationId")
        public String remediationId;

        @NameInMap("InvokeType")
        public String invokeType;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        public static ListAggregateRemediationsResponseBodyRemediations build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRemediationsResponseBodyRemediations self = new ListAggregateRemediationsResponseBodyRemediations();
            return TeaModel.build(map, self);
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationTemplateId(String remediationTemplateId) {
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }
        public String getRemediationTemplateId() {
            return this.remediationTemplateId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationDynamicParams(String remediationDynamicParams) {
            this.remediationDynamicParams = remediationDynamicParams;
            return this;
        }
        public String getRemediationDynamicParams() {
            return this.remediationDynamicParams;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationSourceType(String remediationSourceType) {
            this.remediationSourceType = remediationSourceType;
            return this;
        }
        public String getRemediationSourceType() {
            return this.remediationSourceType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationId(String lastSuccessfulInvocationId) {
            this.lastSuccessfulInvocationId = lastSuccessfulInvocationId;
            return this;
        }
        public String getLastSuccessfulInvocationId() {
            return this.lastSuccessfulInvocationId;
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

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationType(String lastSuccessfulInvocationType) {
            this.lastSuccessfulInvocationType = lastSuccessfulInvocationType;
            return this;
        }
        public String getLastSuccessfulInvocationType() {
            return this.lastSuccessfulInvocationType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setInvokeType(String invokeType) {
            this.invokeType = invokeType;
            return this;
        }
        public String getInvokeType() {
            return this.invokeType;
        }

        public ListAggregateRemediationsResponseBodyRemediations setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListAggregateRemediationsResponseBodyRemediations setLastSuccessfulInvocationTime(Long lastSuccessfulInvocationTime) {
            this.lastSuccessfulInvocationTime = lastSuccessfulInvocationTime;
            return this;
        }
        public Long getLastSuccessfulInvocationTime() {
            return this.lastSuccessfulInvocationTime;
        }

    }

}
