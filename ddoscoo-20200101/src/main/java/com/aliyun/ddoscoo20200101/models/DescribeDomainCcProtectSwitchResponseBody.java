// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainCcProtectSwitchResponseBody extends TeaModel {
    /**
     * <p>The status of each protection feature for the website.</p>
     */
    @NameInMap("ProtectSwitchList")
    public java.util.List<DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList;

    /**
     * <p>The ID of the request. This ID is unique to the request. Use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainCcProtectSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcProtectSwitchResponseBody self = new DescribeDomainCcProtectSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcProtectSwitchResponseBody setProtectSwitchList(java.util.List<DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList) {
        this.protectSwitchList = protectSwitchList;
        return this;
    }
    public java.util.List<DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList> getProtectSwitchList() {
        return this.protectSwitchList;
    }

    public DescribeDomainCcProtectSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList extends TeaModel {
        /**
         * <p>The mode of AI-powered protection. Valid values:</p>
         * <ul>
         * <li><p><strong>watch</strong>: Warning mode</p>
         * </li>
         * <li><p><strong>defense</strong>: Defense mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        @NameInMap("AiMode")
        public String aiMode;

        /**
         * <p>The status of the AI-powered protection feature. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AiRuleEnable")
        public Integer aiRuleEnable;

        /**
         * <p>The level of AI-powered protection. Valid values:</p>
         * <ul>
         * <li><p><strong>level30</strong>: Loose</p>
         * </li>
         * <li><p><strong>level60</strong>: Normal</p>
         * </li>
         * <li><p><strong>level90</strong>: Strict</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level60</p>
         */
        @NameInMap("AiTemplate")
        public String aiTemplate;

        /**
         * <p>The status of the blacklists and whitelists feature. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BlackWhiteListEnable")
        public Integer blackWhiteListEnable;

        /**
         * <p>The status of custom CC rules. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CcCustomRuleEnable")
        public Integer ccCustomRuleEnable;

        /**
         * <p>The status of the rate limiting (CC protection) feature. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CcEnable")
        public Integer ccEnable;

        /**
         * <p>The status of the global switch for custom and precise CC protection. Valid values:</p>
         * <ul>
         * <li><p><strong>open</strong>: Enabled</p>
         * </li>
         * <li><p><strong>close</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("CcGlobalSwitch")
        public String ccGlobalSwitch;

        /**
         * <p>The CC protection mode. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: Normal</p>
         * </li>
         * <li><p><strong>gf_under_attack</strong>: Emergency</p>
         * </li>
         * <li><p><strong>gf_sos_verify</strong>: Strict</p>
         * </li>
         * <li><p><strong>gf_sos_enhance</strong>: Very Strict</p>
         * </li>
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
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The status of the precise access control feature. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

        /**
         * <p>The status of the Location Blacklist (Domain Names) feature. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegionBlockEnable")
        public Integer regionBlockEnable;

        public static DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList self = new DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setAiMode(String aiMode) {
            this.aiMode = aiMode;
            return this;
        }
        public String getAiMode() {
            return this.aiMode;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setAiRuleEnable(Integer aiRuleEnable) {
            this.aiRuleEnable = aiRuleEnable;
            return this;
        }
        public Integer getAiRuleEnable() {
            return this.aiRuleEnable;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setAiTemplate(String aiTemplate) {
            this.aiTemplate = aiTemplate;
            return this;
        }
        public String getAiTemplate() {
            return this.aiTemplate;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setBlackWhiteListEnable(Integer blackWhiteListEnable) {
            this.blackWhiteListEnable = blackWhiteListEnable;
            return this;
        }
        public Integer getBlackWhiteListEnable() {
            return this.blackWhiteListEnable;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setCcCustomRuleEnable(Integer ccCustomRuleEnable) {
            this.ccCustomRuleEnable = ccCustomRuleEnable;
            return this;
        }
        public Integer getCcCustomRuleEnable() {
            return this.ccCustomRuleEnable;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setCcEnable(Integer ccEnable) {
            this.ccEnable = ccEnable;
            return this;
        }
        public Integer getCcEnable() {
            return this.ccEnable;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setCcGlobalSwitch(String ccGlobalSwitch) {
            this.ccGlobalSwitch = ccGlobalSwitch;
            return this;
        }
        public String getCcGlobalSwitch() {
            return this.ccGlobalSwitch;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setPreciseRuleEnable(Integer preciseRuleEnable) {
            this.preciseRuleEnable = preciseRuleEnable;
            return this;
        }
        public Integer getPreciseRuleEnable() {
            return this.preciseRuleEnable;
        }

        public DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList setRegionBlockEnable(Integer regionBlockEnable) {
            this.regionBlockEnable = regionBlockEnable;
            return this;
        }
        public Integer getRegionBlockEnable() {
            return this.regionBlockEnable;
        }

    }

}
