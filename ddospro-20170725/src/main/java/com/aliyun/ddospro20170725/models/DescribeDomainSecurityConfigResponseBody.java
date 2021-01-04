// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CcInfo")
    public DescribeDomainSecurityConfigResponseBodyCcInfo ccInfo;

    @NameInMap("CnameEnable")
    public Boolean cnameEnable;

    @NameInMap("WhiteList")
    public String whiteList;

    @NameInMap("BlackList")
    public String blackList;

    @NameInMap("CnameMode")
    public Integer cnameMode;

    public static DescribeDomainSecurityConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityConfigResponseBody self = new DescribeDomainSecurityConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecurityConfigResponseBody setCcInfo(DescribeDomainSecurityConfigResponseBodyCcInfo ccInfo) {
        this.ccInfo = ccInfo;
        return this;
    }
    public DescribeDomainSecurityConfigResponseBodyCcInfo getCcInfo() {
        return this.ccInfo;
    }

    public DescribeDomainSecurityConfigResponseBody setCnameEnable(Boolean cnameEnable) {
        this.cnameEnable = cnameEnable;
        return this;
    }
    public Boolean getCnameEnable() {
        return this.cnameEnable;
    }

    public DescribeDomainSecurityConfigResponseBody setWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public String getWhiteList() {
        return this.whiteList;
    }

    public DescribeDomainSecurityConfigResponseBody setBlackList(String blackList) {
        this.blackList = blackList;
        return this;
    }
    public String getBlackList() {
        return this.blackList;
    }

    public DescribeDomainSecurityConfigResponseBody setCnameMode(Integer cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public Integer getCnameMode() {
        return this.cnameMode;
    }

    public static class DescribeDomainSecurityConfigResponseBodyCcInfo extends TeaModel {
        @NameInMap("CcCustomRuleCount")
        public Integer ccCustomRuleCount;

        @NameInMap("CcSwitch")
        public Boolean ccSwitch;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("CcCustomRuleEnable")
        public Boolean ccCustomRuleEnable;

        public static DescribeDomainSecurityConfigResponseBodyCcInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSecurityConfigResponseBodyCcInfo self = new DescribeDomainSecurityConfigResponseBodyCcInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSecurityConfigResponseBodyCcInfo setCcCustomRuleCount(Integer ccCustomRuleCount) {
            this.ccCustomRuleCount = ccCustomRuleCount;
            return this;
        }
        public Integer getCcCustomRuleCount() {
            return this.ccCustomRuleCount;
        }

        public DescribeDomainSecurityConfigResponseBodyCcInfo setCcSwitch(Boolean ccSwitch) {
            this.ccSwitch = ccSwitch;
            return this;
        }
        public Boolean getCcSwitch() {
            return this.ccSwitch;
        }

        public DescribeDomainSecurityConfigResponseBodyCcInfo setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeDomainSecurityConfigResponseBodyCcInfo setCcCustomRuleEnable(Boolean ccCustomRuleEnable) {
            this.ccCustomRuleEnable = ccCustomRuleEnable;
            return this;
        }
        public Boolean getCcCustomRuleEnable() {
            return this.ccCustomRuleEnable;
        }

    }

}
