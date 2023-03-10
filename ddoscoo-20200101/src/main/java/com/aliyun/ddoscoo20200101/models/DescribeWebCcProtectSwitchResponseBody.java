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
         * <br>
         * <p>*   **watch**: the Warning mode</p>
         * <p>*   **defense**: the Defense mode</p>
         */
        @NameInMap("AiMode")
        public String aiMode;

        /**
         * <p>The status of the Intelligent Protection policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("AiRuleEnable")
        public Integer aiRuleEnable;

        /**
         * <p>The level of the Intelligent Protection policy. Valid values:</p>
         * <br>
         * <p>*   **level30**: the Low level</p>
         * <p>*   **level60**: the Normal level</p>
         * <p>*   **level90**: the Strict level</p>
         */
        @NameInMap("AiTemplate")
        public String aiTemplate;

        /**
         * <p>The status of the Black Lists and White Lists (Domain Names) policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("BlackWhiteListEnable")
        public Integer blackWhiteListEnable;

        /**
         * <p>The status of the Custom Rule switch for the Frequency Control policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("CcCustomRuleEnable")
        public Integer ccCustomRuleEnable;

        /**
         * <p>The status of the Frequency Control policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("CcEnable")
        public Integer ccEnable;

        /**
         * <p>The mode of the Frequency Control policy. Valid values:</p>
         * <br>
         * <p>*   **default**: Normal</p>
         * <p>*   **gf_under_attack**: Emergency</p>
         * <p>*   **gf_sos_verify**: Strict</p>
         * <p>*   **gf_sos_enhance**: Super Strict</p>
         */
        @NameInMap("CcTemplate")
        public String ccTemplate;

        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The status of the Accurate Access Control policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

        /**
         * <p>The status of the Location Blacklist (Domain Names) policy. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
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
