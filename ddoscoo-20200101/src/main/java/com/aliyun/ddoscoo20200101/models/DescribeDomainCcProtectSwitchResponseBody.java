// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainCcProtectSwitchResponseBody extends TeaModel {
    @NameInMap("ProtectSwitchList")
    public java.util.List<DescribeDomainCcProtectSwitchResponseBodyProtectSwitchList> protectSwitchList;

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

        @NameInMap("CcGlobalSwitch")
        public String ccGlobalSwitch;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("PreciseRuleEnable")
        public Integer preciseRuleEnable;

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
