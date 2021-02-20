// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProtectSwitchList")
    public java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList;

    public static DescribeWebCcProtectSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCcProtectSwitchResponseBody self = new DescribeWebCcProtectSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCcProtectSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCcProtectSwitchResponseBody setProtectSwitchList(java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList) {
        this.protectSwitchList = protectSwitchList;
        return this;
    }
    public java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> getProtectSwitchList() {
        return this.protectSwitchList;
    }

    public static class DescribeWebCcProtectSwitchResponseBodyProtectSwitchList extends TeaModel {
        @NameInMap("BlackWhiteListEnable")
        public Integer blackWhiteListEnable;

        @NameInMap("AiTemplate")
        public String aiTemplate;

        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("AiMode")
        public String aiMode;

        @NameInMap("AiRuleEnable")
        public Integer aiRuleEnable;

        @NameInMap("RegionBlockEnable")
        public Integer regionBlockEnable;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("CcCustomRuleEnable")
        public Integer ccCustomRuleEnable;

        @NameInMap("CcEnable")
        public Integer ccEnable;

        public static DescribeWebCcProtectSwitchResponseBodyProtectSwitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCcProtectSwitchResponseBodyProtectSwitchList self = new DescribeWebCcProtectSwitchResponseBodyProtectSwitchList();
            return TeaModel.build(map, self);
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setBlackWhiteListEnable(Integer blackWhiteListEnable) {
            this.blackWhiteListEnable = blackWhiteListEnable;
            return this;
        }
        public Integer getBlackWhiteListEnable() {
            return this.blackWhiteListEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setAiTemplate(String aiTemplate) {
            this.aiTemplate = aiTemplate;
            return this;
        }
        public String getAiTemplate() {
            return this.aiTemplate;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setPreciseRuleEnable(Integer preciseRuleEnable) {
            this.preciseRuleEnable = preciseRuleEnable;
            return this;
        }
        public Integer getPreciseRuleEnable() {
            return this.preciseRuleEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
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

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setRegionBlockEnable(Integer regionBlockEnable) {
            this.regionBlockEnable = regionBlockEnable;
            return this;
        }
        public Integer getRegionBlockEnable() {
            return this.regionBlockEnable;
        }

        public DescribeWebCcProtectSwitchResponseBodyProtectSwitchList setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
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

    }

}
