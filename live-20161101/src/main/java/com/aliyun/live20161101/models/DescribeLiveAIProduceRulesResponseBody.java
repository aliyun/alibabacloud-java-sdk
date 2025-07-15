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

    /**
     * <p>The subtitle rules.</p>
     */
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
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>App Name</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>live AI subtitle template</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The last time when the rule was modified. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1715594344000</p>
         */
        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        /**
         * <p>Indicates whether the rule takes effect when stream pulling starts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLazy")
        public Boolean isLazy;

        /**
         * <p>The specification of the exported subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>lp_ld</p>
         */
        @NameInMap("LiveTemplate")
        public String liveTemplate;

        /**
         * <p>The ID of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>72fba656-2cc2-40fd-923c-2a10c3b9****</p>
         */
        @NameInMap("RulesId")
        public String rulesId;

        /**
         * <p>The name of the virtual background template.</p>
         * 
         * <strong>example:</strong>
         * <p>test0708</p>
         */
        @NameInMap("StudioName")
        public String studioName;

        /**
         * <p>The name of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>sub1</p>
         */
        @NameInMap("SubtitleName")
        public String subtitleName;

        /**
         * <p>The suffix of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test0506</p>
         */
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
