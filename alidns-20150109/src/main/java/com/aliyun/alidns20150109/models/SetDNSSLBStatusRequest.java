// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the content within the request and response. Default: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The DNS resolution line. The line can be the default line, China Telecom, and China Mobile.</p>
     * 
     * <strong>example:</strong>
     * <p>China Mobile.</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>Specifies whether to enable or disable weighted round-robin. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables weighted round-robin.</li>
     * <li><strong>false</strong>: disables weighted round-robin.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Open")
    public Boolean open;

    /**
     * <p>The subdomain name for which you want to enable weighted round-robin. Set the parameter to @.example.com instead of example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The type of the Domain Name System (DNS) record. Valid values: A and AAAA. Default value: A.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SetDNSSLBStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDNSSLBStatusRequest self = new SetDNSSLBStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDNSSLBStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDNSSLBStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDNSSLBStatusRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public SetDNSSLBStatusRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public SetDNSSLBStatusRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public SetDNSSLBStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SetDNSSLBStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
