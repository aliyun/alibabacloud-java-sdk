// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyDomainResolveRequest extends TeaModel {
    /**
     * <p>The domain name. This parameter is required and must be specified when you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The type of the cloud firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The IP address version. Valid values: <strong>4</strong> (IPv4) and <strong>6</strong> (IPv6).</p>
     * <blockquote>
     * <p>This parameter is unconditionally required and has no dependency on RegionNo. If this parameter is not specified, the error MissingParameter.IpVersion is returned (-200157). If the value is invalid, the error ErrorParameterIpVersion is returned (-200135).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public Integer ipVersion;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID. This parameter is required. If this parameter is not specified, the error MissingParameter.RegionNo is returned (-200155, The required parameter \&quot;RegionNo\&quot; is not provided.).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static DescribeControlPolicyDomainResolveRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyDomainResolveRequest self = new DescribeControlPolicyDomainResolveRequest();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyDomainResolveRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeControlPolicyDomainResolveRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeControlPolicyDomainResolveRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public DescribeControlPolicyDomainResolveRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeControlPolicyDomainResolveRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
