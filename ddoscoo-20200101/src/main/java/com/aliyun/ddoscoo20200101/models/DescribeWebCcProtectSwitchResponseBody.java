// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCcProtectSwitchResponseBody extends TeaModel {
    @NameInMap("ProtectSwitchList")
    public java.util.List<DescribeWebCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList;

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
        @NameInMap("AiMode")
        public String aiMode;

        @NameInMap("AiRuleEnable")
        public Integer aiRuleEnable;

        @NameInMap("AiTemplate")
        public String aiTemplate;

        @NameInMap("BlackWhiteListEnable")
        public Integer blackWhiteListEnable;

        @NameInMap("CcCustomRuleEnable")
        public Integer ccCustomRuleEnable;

        @NameInMap("CcEnable")
        public Integer ccEnable;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

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
