// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamWatermarkRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The watermark rules.</p>
     */
    @NameInMap("RuleInfoList")
    public DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoList ruleInfoList;

    /**
     * <p>The total number of entries that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

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

    public DescribeLiveStreamWatermarkRulesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeLiveStreamWatermarkRulesResponseBodyRuleInfoListRuleInfo extends TeaModel {
        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The description of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>my rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The name of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>WatermarkRule****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the watermark rule.</p>
         * <blockquote>
         * <p> You can obtain the rule ID by checking the value of the RuleId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the live stream. The following matching rules apply:</p>
         * <ul>
         * <li>A stream name can be exactly matched. Example: liveStreamA.</li>
         * <li>Fuzzy match is also supported. The use of an asterisk (<code>*</code>) allows all approximate matches to be found.</li>
         * <li>You can place the asterisk before or after an approximate string.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Fuzzy match: Only one asterisk (<code>*</code>) before or after an approximate string is allowed. The approximate string must be enclosed in <code>()</code>. Separate multiple strings with vertical bars (<code>|</code>).</p>
         * </li>
         * <li><p>For example, <code>*(t1|t2)</code> matches all streams whose name has the <code>t1</code> or <code>t2</code> suffix, and <code>(abc|123)*</code> matches all streams whose name has the <code>abc</code> or <code>123</code> prefix.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveStreamA</p>
         */
        @NameInMap("Stream")
        public String stream;

        /**
         * <p>The ID of the watermark template.</p>
         * <blockquote>
         * <p> You can obtain the template ID by checking the value of the TemplateId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848096.html">AddLiveStreamWatermark</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9 ****</p>
         */
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
