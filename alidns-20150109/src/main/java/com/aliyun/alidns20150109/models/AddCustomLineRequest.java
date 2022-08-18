// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("IpSegment")
    public java.util.List<AddCustomLineRequestIpSegment> ipSegment;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LineName")
    public String lineName;

    public static AddCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineRequest self = new AddCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomLineRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddCustomLineRequest setIpSegment(java.util.List<AddCustomLineRequestIpSegment> ipSegment) {
        this.ipSegment = ipSegment;
        return this;
    }
    public java.util.List<AddCustomLineRequestIpSegment> getIpSegment() {
        return this.ipSegment;
    }

    public AddCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddCustomLineRequest setLineName(String lineName) {
        this.lineName = lineName;
        return this;
    }
    public String getLineName() {
        return this.lineName;
    }

    public static class AddCustomLineRequestIpSegment extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        public static AddCustomLineRequestIpSegment build(java.util.Map<String, ?> map) throws Exception {
            AddCustomLineRequestIpSegment self = new AddCustomLineRequestIpSegment();
            return TeaModel.build(map, self);
        }

        public AddCustomLineRequestIpSegment setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public AddCustomLineRequestIpSegment setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

}
