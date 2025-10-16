// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>113.132.26.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeNatFirewallQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallQuotaRequest self = new DescribeNatFirewallQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallQuotaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallQuotaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
