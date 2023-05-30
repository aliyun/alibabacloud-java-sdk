// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveRequest extends TeaModel {
    /**
     * <p>The domain name whose DNS record you want to query.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **4**: IPv4 (default)</p>
     * <p>*   **6**: IPv6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The natural language of the response.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    public static DescribeDomainResolveRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveRequest self = new DescribeDomainResolveRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainResolveRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeDomainResolveRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainResolveRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
