// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListReportTemplatesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 50. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the response is truncated, use NextToken to send another request and get results after the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>aVCjqNaSy0Ps7zSMGu25****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of report templates.</p>
     */
    @NameInMap("ReportTemplateList")
    public java.util.List<ListReportTemplatesResponseBodyReportTemplateList> reportTemplateList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8195B664-9565-4685-89AC-8B5F04B44B92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of templates.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListReportTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReportTemplatesResponseBody self = new ListReportTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReportTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReportTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReportTemplatesResponseBody setReportTemplateList(java.util.List<ListReportTemplatesResponseBodyReportTemplateList> reportTemplateList) {
        this.reportTemplateList = reportTemplateList;
        return this;
    }
    public java.util.List<ListReportTemplatesResponseBodyReportTemplateList> getReportTemplateList() {
        return this.reportTemplateList;
    }

    public ListReportTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReportTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListReportTemplatesResponseBodyReportTemplateListReportScope extends TeaModel {
        /**
         * <p>The key for the report scope. Supported values:</p>
         * <ul>
         * <li><p>AggregatorId</p>
         * </li>
         * <li><p>CompliancePackId</p>
         * </li>
         * <li><p>RuleId</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RuleId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching logic. Only In is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value for the report scope. For multiple values of the same type — such as multiple rule IDs — separate them with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-1,cr-2</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListReportTemplatesResponseBodyReportTemplateListReportScope build(java.util.Map<String, ?> map) throws Exception {
            ListReportTemplatesResponseBodyReportTemplateListReportScope self = new ListReportTemplatesResponseBodyReportTemplateListReportScope();
            return TeaModel.build(map, self);
        }

        public ListReportTemplatesResponseBodyReportTemplateListReportScope setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListReportTemplatesResponseBodyReportTemplateListReportScope setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListReportTemplatesResponseBodyReportTemplateListReportScope setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListReportTemplatesResponseBodyReportTemplateList extends TeaModel {
        /**
         * <p>The format of the report. Only Excel is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>excel</p>
         */
        @NameInMap("ReportFileFormats")
        public String reportFileFormats;

        /**
         * <p>The aggregation granularity of the report.</p>
         * <p>From the management account perspective, the following options are supported:</p>
         * <ul>
         * <li><p>AllInOne: Aggregate all accounts in the template scope into one report.</p>
         * </li>
         * <li><p>GroupByAggregator: Generate reports by aggregator group. Output as one compressed file.</p>
         * </li>
         * <li><p>GroupByAccount: Generate separate reports for each account (default). Output as one compressed file.</p>
         * </li>
         * </ul>
         * <p>Member accounts support only GroupByAccount.</p>
         * 
         * <strong>example:</strong>
         * <p>AllInOne</p>
         */
        @NameInMap("ReportGranularity")
        public String reportGranularity;

        /**
         * <p>The language of the report. Valid values: zh-CN and en-US. Default value: en-US.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>An array that defines which rules appear in the audit report. Each ReportScope object uses OR logic (additive logic).</p>
         * <blockquote>
         * <p>For example, if the array has two items — the first specifies RuleId cr-1 and the second specifies RuleId cr-2 — then the report covers both cr-1 and cr-2.</p>
         * </blockquote>
         */
        @NameInMap("ReportScope")
        public java.util.List<ListReportTemplatesResponseBodyReportTemplateListReportScope> reportScope;

        /**
         * <p>The description of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-description</p>
         */
        @NameInMap("ReportTemplateDescription")
        public String reportTemplateDescription;

        /**
         * <p>The ID of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        @NameInMap("ReportTemplateId")
        public String reportTemplateId;

        /**
         * <p>The name of the report template.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ReportTemplateName")
        public String reportTemplateName;

        /**
         * <p>The subscription frequency of the report. If this parameter is specified, it must be a Quartz-formatted cron expression.</p>
         * <p>The format is: second minute hour day month weekday. Common examples:</p>
         * <ul>
         * <li><p>Run daily at 00:00: 0 0 0 \* \* ?</p>
         * </li>
         * <li><p>Run every Monday at 15:30: 0 30 15 ? \* MON</p>
         * </li>
         * <li><p>Run on the first day of each month at 02:00: 0 0 2 1 \* ?</p>
         * </li>
         * </ul>
         * <p>Where:</p>
         * <ul>
         * <li><p>&quot;\*&quot; means any value.</p>
         * </li>
         * <li><p>&quot;?&quot; means no specific value for day or weekday.</p>
         * </li>
         * <li><p>&quot;MON&quot; means Monday.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Times are in UTC+8. Adjust your cron expression based on your local time zone.</p>
         * </blockquote>
         * <blockquote>
         * <p>The system tries to run reports at the scheduled time, but delays may occur due to report generation. Each template can trigger at most one notification per day.</p>
         * </blockquote>
         * <blockquote>
         * <p>In Quartz, weekdays are numbered starting from Sunday: 1 = Sunday, 2 = Monday, 3 = Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday, 7 = Saturday.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0 0 13 * * ?</p>
         */
        @NameInMap("SubscriptionFrequency")
        public String subscriptionFrequency;

        public static ListReportTemplatesResponseBodyReportTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListReportTemplatesResponseBodyReportTemplateList self = new ListReportTemplatesResponseBodyReportTemplateList();
            return TeaModel.build(map, self);
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportFileFormats(String reportFileFormats) {
            this.reportFileFormats = reportFileFormats;
            return this;
        }
        public String getReportFileFormats() {
            return this.reportFileFormats;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportGranularity(String reportGranularity) {
            this.reportGranularity = reportGranularity;
            return this;
        }
        public String getReportGranularity() {
            return this.reportGranularity;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportScope(java.util.List<ListReportTemplatesResponseBodyReportTemplateListReportScope> reportScope) {
            this.reportScope = reportScope;
            return this;
        }
        public java.util.List<ListReportTemplatesResponseBodyReportTemplateListReportScope> getReportScope() {
            return this.reportScope;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportTemplateDescription(String reportTemplateDescription) {
            this.reportTemplateDescription = reportTemplateDescription;
            return this;
        }
        public String getReportTemplateDescription() {
            return this.reportTemplateDescription;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportTemplateId(String reportTemplateId) {
            this.reportTemplateId = reportTemplateId;
            return this;
        }
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setReportTemplateName(String reportTemplateName) {
            this.reportTemplateName = reportTemplateName;
            return this;
        }
        public String getReportTemplateName() {
            return this.reportTemplateName;
        }

        public ListReportTemplatesResponseBodyReportTemplateList setSubscriptionFrequency(String subscriptionFrequency) {
            this.subscriptionFrequency = subscriptionFrequency;
            return this;
        }
        public String getSubscriptionFrequency() {
            return this.subscriptionFrequency;
        }

    }

}
