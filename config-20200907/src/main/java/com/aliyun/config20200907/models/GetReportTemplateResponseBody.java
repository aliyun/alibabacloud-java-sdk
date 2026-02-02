// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetReportTemplateResponseBody extends TeaModel {
    @NameInMap("ReportTemplate")
    public GetReportTemplateResponseBodyReportTemplate reportTemplate;

    /**
     * <strong>example:</strong>
     * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDF3F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetReportTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateResponseBody self = new GetReportTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateResponseBody setReportTemplate(GetReportTemplateResponseBodyReportTemplate reportTemplate) {
        this.reportTemplate = reportTemplate;
        return this;
    }
    public GetReportTemplateResponseBodyReportTemplate getReportTemplate() {
        return this.reportTemplate;
    }

    public GetReportTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetReportTemplateResponseBodyReportTemplateReportScope extends TeaModel {
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

        public static GetReportTemplateResponseBodyReportTemplateReportScope build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateResponseBodyReportTemplateReportScope self = new GetReportTemplateResponseBodyReportTemplateReportScope();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetReportTemplateResponseBodyReportTemplateReportScope setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetReportTemplateResponseBodyReportTemplate extends TeaModel {
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
        public java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> reportScope;

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
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("SubscriptionFrequency")
        public String subscriptionFrequency;

        public static GetReportTemplateResponseBodyReportTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateResponseBodyReportTemplate self = new GetReportTemplateResponseBodyReportTemplate();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateResponseBodyReportTemplate setReportFileFormats(String reportFileFormats) {
            this.reportFileFormats = reportFileFormats;
            return this;
        }
        public String getReportFileFormats() {
            return this.reportFileFormats;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportGranularity(String reportGranularity) {
            this.reportGranularity = reportGranularity;
            return this;
        }
        public String getReportGranularity() {
            return this.reportGranularity;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportScope(java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> reportScope) {
            this.reportScope = reportScope;
            return this;
        }
        public java.util.List<GetReportTemplateResponseBodyReportTemplateReportScope> getReportScope() {
            return this.reportScope;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateDescription(String reportTemplateDescription) {
            this.reportTemplateDescription = reportTemplateDescription;
            return this;
        }
        public String getReportTemplateDescription() {
            return this.reportTemplateDescription;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateId(String reportTemplateId) {
            this.reportTemplateId = reportTemplateId;
            return this;
        }
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        public GetReportTemplateResponseBodyReportTemplate setReportTemplateName(String reportTemplateName) {
            this.reportTemplateName = reportTemplateName;
            return this;
        }
        public String getReportTemplateName() {
            return this.reportTemplateName;
        }

        public GetReportTemplateResponseBodyReportTemplate setSubscriptionFrequency(String subscriptionFrequency) {
            this.subscriptionFrequency = subscriptionFrequency;
            return this;
        }
        public String getSubscriptionFrequency() {
            return this.subscriptionFrequency;
        }

    }

}
