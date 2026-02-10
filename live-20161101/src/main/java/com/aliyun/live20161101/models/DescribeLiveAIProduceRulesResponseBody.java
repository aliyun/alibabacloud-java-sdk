// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIProduceRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleInfoList")
    public DescribeLiveAIProduceRulesResponseBodyRuleInfoList ruleInfoList;

    public static DescribeLiveAIProduceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIProduceRulesResponseBody self = new DescribeLiveAIProduceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIProduceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAIProduceRulesResponseBody setRuleInfoList(DescribeLiveAIProduceRulesResponseBodyRuleInfoList ruleInfoList) {
        this.ruleInfoList = ruleInfoList;
        return this;
    }
    public DescribeLiveAIProduceRulesResponseBodyRuleInfoList getRuleInfoList() {
        return this.ruleInfoList;
    }

    public static class DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        @NameInMap("IsLazy")
        public Boolean isLazy;

        @NameInMap("LiveTemplate")
        public String liveTemplate;

        @NameInMap("RulesId")
        public String rulesId;

        @NameInMap("StudioName")
        public String studioName;

        @NameInMap("SubtitleName")
        public String subtitleName;

        @NameInMap("SuffixName")
        public String suffixName;

        public static DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo self = new DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setIsLazy(Boolean isLazy) {
            this.isLazy = isLazy;
            return this;
        }
        public Boolean getIsLazy() {
            return this.isLazy;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setLiveTemplate(String liveTemplate) {
            this.liveTemplate = liveTemplate;
            return this;
        }
        public String getLiveTemplate() {
            return this.liveTemplate;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setRulesId(String rulesId) {
            this.rulesId = rulesId;
            return this;
        }
        public String getRulesId() {
            return this.rulesId;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setStudioName(String studioName) {
            this.studioName = studioName;
            return this;
        }
        public String getStudioName() {
            return this.studioName;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setSubtitleName(String subtitleName) {
            this.subtitleName = subtitleName;
            return this;
        }
        public String getSubtitleName() {
            return this.subtitleName;
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo setSuffixName(String suffixName) {
            this.suffixName = suffixName;
            return this;
        }
        public String getSuffixName() {
            return this.suffixName;
        }

    }

    public static class DescribeLiveAIProduceRulesResponseBodyRuleInfoList extends TeaModel {
        @NameInMap("RuleInfo")
        public java.util.List<DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo> ruleInfo;

        public static DescribeLiveAIProduceRulesResponseBodyRuleInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAIProduceRulesResponseBodyRuleInfoList self = new DescribeLiveAIProduceRulesResponseBodyRuleInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAIProduceRulesResponseBodyRuleInfoList setRuleInfo(java.util.List<DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<DescribeLiveAIProduceRulesResponseBodyRuleInfoListRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

    }

}
