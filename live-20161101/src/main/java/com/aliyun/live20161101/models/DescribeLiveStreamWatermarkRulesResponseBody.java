// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamWatermarkRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleInfoList")
    public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList ruleInfoList;

    public static DescribeLiveStreamWatermarkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamWatermarkRulesResponseBody self = new DescribeLiveStreamWatermarkRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamWatermarkRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamWatermarkRulesResponseBody setRuleInfoList(DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList ruleInfoList) {
        this.ruleInfoList = ruleInfoList;
        return this;
    }
    public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList getRuleInfoList() {
        return this.ruleInfoList;
    }

    public static class DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Stream")
        public String stream;

        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo self = new DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList extends TeaModel {
        @NameInMap("RuleInfo")
        public java.util.List<DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo> ruleInfo;

        public static DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList self = new DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList setRuleInfo(java.util.List<DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

    }

}
