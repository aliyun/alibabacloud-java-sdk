// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the VPC for which the VPC firewall is created.</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <br>
     * <p>> You can call the [DescribeVpcFirewallCenList](https://help.aliyun.com/document_detail/345777.html) operation to query the instance IDs of VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
