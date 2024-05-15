// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyPriorUsedRequest extends TeaModel {
    /**
     * <p>The direction of the traffic to which the access control policy applies.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **in**: inbound traffic</p>
     * <p>*   **out**: outbound traffic</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Direction")
    public String direction;

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
     * <p>The natural language of the request and response.</p>
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
