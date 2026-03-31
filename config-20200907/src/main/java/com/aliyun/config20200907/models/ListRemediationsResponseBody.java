// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationsResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The converted configuration of the remediation template. This parameter is returned only for an OOS remediation template.</p>
     */
    @NameInMap("Remediations")
    public java.util.List<ListRemediationsResponseBodyRemediations> remediations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0146963A-20C0-4E75-B93A-7D622B5FD7C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of remediation settings.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationsResponseBody self = new ListRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemediationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRemediationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
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

    public ListRemediationsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRemediationsResponseBodyRemediations extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

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
         * <li>NON_EXECUTION: The remediation template was not executed.</li>
         * <li>AUTO_EXECUTION: The remediation template was automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation template was manually executed.</li>
         * <li>NOT_CONFIG: The execution mode was not specified.</li>
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
         * <p>The timestamp of the last successful execution of the remediation template Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625451393589</p>
         */
        @NameInMap("LastSuccessfulInvocationTime")
        public Long lastSuccessfulInvocationTime;

        /**
         * <p>The mode of the last successful execution of the remediation template. Valid values:</p>
         * <ul>
         * <li>NON_EXECUTION: The remediation template was not executed.</li>
         * <li>AUTO_EXECUTION: The remediation template was automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation template was manually executed.</li>
         * <li>NOT_CONFIG: The execution mode was not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO_EXECUTION</p>
         */
        @NameInMap("LastSuccessfulInvocationType")
        public String lastSuccessfulInvocationType;

        /**
         * <p>The ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-6b7c626622af0026****</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>The converted configuration of the remediation template. This parameter is available only for an OOS remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
         */
        @NameInMap("RemediationOriginParams")
        public String remediationOriginParams;

        /**
         * <p>The source of remediation. Valid values:</p>
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
         * <li>OOS: Operation Orchestration Service (official remediation)</li>
         * <li>FC: Function Compute (custom remediation)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
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
