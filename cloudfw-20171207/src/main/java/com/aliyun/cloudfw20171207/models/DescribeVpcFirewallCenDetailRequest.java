// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallCenDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenDetailRequest self = new DescribeVpcFirewallCenDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallCenDetailRequest setNetworkInstanceId(String networkInstanceId) {
        this.networkInstanceId = networkInstanceId;
        return this;
    }
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    public DescribeVpcFirewallCenDetailRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
