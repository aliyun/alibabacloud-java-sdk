// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddCustomLineRequest extends TeaModel {
    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt;Call the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.&lt;props=&quot;intl&quot;&gt;Call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The list of IP address segments.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpSegment")
    public java.util.List<AddCustomLineRequestIpSegment> ipSegment;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the custom line.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>北京线路</p>
     */
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
        /**
         * <p>The end IP address of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.254</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The start IP address of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0</p>
         */
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
