// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedRequest extends TeaModel {
    // The direction of the traffic to which the access control policy applies.
    // 
    // Valid values:
    // 
    // *   **in**: inbound traffic
    // *   **out**: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The IP version of the asset that is protected by Cloud Firewall.
    // 
    // Valid values:
    // 
    // *   **4**: IPv4 (default)
    // *   **6**: IPv6
    @NameInMap("IpVersion")
    public String ipVersion;

    // The natural language of the request and response.
    // 
    // Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribePolicyPriorUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyPriorUsedRequest self = new DescribePolicyPriorUsedRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyPriorUsedRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribePolicyPriorUsedRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribePolicyPriorUsedRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePolicyPriorUsedRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
