// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCreatedNatFirewallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>121.225.255.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCreatedNatFirewallRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatedNatFirewallRequest self = new DescribeCreatedNatFirewallRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreatedNatFirewallRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCreatedNatFirewallRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
