// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchResponseBody extends TeaModel {
    /**
     * <p>The status of each protection policy for a website.</p>
     */
    @NameInMap("ProtectSwitchList")
    public java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3ADD9EED-CA4B-488C-BC82-01B0B899363D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebCcProtectSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCcProtectSwitchResponseBody self = new DescribeWebCcProtectSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCcProtectSwitchResponseBody setProtectSwitchList(java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList) {
        this.protectSwitchList = protectSwitchList;
        return this;
    }
    public java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> getProtectSwitchList() {
        return this.protectSwitchList;
    }

    public DescribeWebCcProtectSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebCcProtectSwitchResponseBodyProtectSwitchList extends TeaModel {
        /**
         * <p>The mode of the Intelligent Protection policy. Valid values:</p>
         * <ul>
         * <li><strong>watch</strong>: the Warning mode</li>
         * <li><strong>defense</strong>: the Defense mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        @NameInMap("AiMode")
        public String aiMode;

        /**
         * <p>The status of the Intelligent Protection policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiRuleEnable")
        public Integer aiRuleEnable;

        /**
         * <p>The level of the Intelligent Protection policy. Valid values:</p>
         * <ul>
         * <li><strong>level30</strong>: the Low level</li>
         * <li><strong>level60</strong>: the Normal level</li>
         * <li><strong>level90</strong>: the Strict level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level60</p>
         */
        @NameInMap("AiTemplate")
        public String aiTemplate;

        /**
         * <p>The status of the Black Lists and White Lists (Domain Names) policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BlackWhiteListEnable")
        public Integer blackWhiteListEnable;

        /**
         * <p>The status of the Custom Rule switch for the Frequency Control policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CcCustomRuleEnable")
        public Integer ccCustomRuleEnable;

        /**
         * <p>The status of the Frequency Control policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CcEnable")
        public Integer ccEnable;

        @NameInMap("CcGlobalSwitch")
        public String ccGlobalSwitch;

        /**
         * <p>The mode of the Frequency Control policy. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Normal</li>
         * <li><strong>gf_under_attack</strong>: Emergency</li>
         * <li><strong>gf_sos_verify</strong>: Strict</li>
         * <li><strong>gf_sos_enhance</strong>: Super Strict</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("CcTemplate")
        public String ccTemplate;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The status of the Accurate Access Control policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

        /**
         * <p>The status of the Location Blacklist (Domain Names) policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegionBlockEnable")
        public Integer regionBlockEnable;

        public static DescribeWebCcProtectSwitchResponseBodyProtectSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCcProtectSwitchResponseBodyProtectSwitchList self = new DescribeWebCcProtectSwitchResponseBodyProtectSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setAiMode(String aiMode) {
            this.aiMode = aiMode;
            return this;
        }
        public String getAiMode() {
            return this.aiMode;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setAiRuleEnable(Integer aiRuleEnable) {
            this.aiRuleEnable = aiRuleEnable;
            return this;
        }
        public Integer getAiRuleEnable() {
            return this.aiRuleEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setAiTemplate(String aiTemplate) {
            this.aiTemplate = aiTemplate;
            return this;
        }
        public String getAiTemplate() {
            return this.aiTemplate;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setBlackWhiteListEnable(Integer blackWhiteListEnable) {
            this.blackWhiteListEnable = blackWhiteListEnable;
            return this;
        }
        public Integer getBlackWhiteListEnable() {
            return this.blackWhiteListEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setCcCustomRuleEnable(Integer ccCustomRuleEnable) {
            this.ccCustomRuleEnable = ccCustomRuleEnable;
            return this;
        }
        public Integer getCcCustomRuleEnable() {
            return this.ccCustomRuleEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setCcEnable(Integer ccEnable) {
            this.ccEnable = ccEnable;
            return this;
        }
        public Integer getCcEnable() {
            return this.ccEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setCcGlobalSwitch(String ccGlobalSwitch) {
            this.ccGlobalSwitch = ccGlobalSwitch;
            return this;
        }
        public String getCcGlobalSwitch() {
            return this.ccGlobalSwitch;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setPreciseRuleEnable(Integer preciseRuleEnable) {
            this.preciseRuleEnable = preciseRuleEnable;
            return this;
        }
        public Integer getPreciseRuleEnable() {
            return this.preciseRuleEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setRegionBlockEnable(Integer regionBlockEnable) {
            this.regionBlockEnable = regionBlockEnable;
            return this;
        }
        public Integer getRegionBlockEnable() {
            return this.regionBlockEnable;
        }

    }

}
