// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListReportTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>aVCjqNaSy0Ps7zSMGu25****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ReportTemplateList")
    public java.util.List<ListReportTemplatesResponseBodyReportTemplateList> reportTemplateList;

    /**
     * <strong>example:</strong>
     * <p>8195B664-9565-4685-89AC-8B5F04B44B92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>RuleId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>In</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
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
         * <strong>example:</strong>
         * <p>excel</p>
         */
        @NameInMap("ReportFileFormats")
        public String reportFileFormats;

        /**
         * <strong>example:</strong>
         * <p>AllInOne</p>
         */
        @NameInMap("ReportGranularity")
        public String reportGranularity;

        @NameInMap("ReportLanguage")
        public String reportLanguage;

        @NameInMap("ReportScope")
        public java.util.List<ListReportTemplatesResponseBodyReportTemplateListReportScope> reportScope;

        /**
         * <strong>example:</strong>
         * <p>test-description</p>
         */
        @NameInMap("ReportTemplateDescription")
        public String reportTemplateDescription;

        /**
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        @NameInMap("ReportTemplateId")
        public String reportTemplateId;

        /**
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ReportTemplateName")
        public String reportTemplateName;

        /**
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
