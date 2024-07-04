// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the Network Address Translation (NAT) gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The name of the SNAT entry. The name must be 1 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>The elastic IP address (EIP) in the SNAT entry. Separate multiple EIPs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120.XXX.XXX.71</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The CIDR block. You can specify the CIDR block of a network, a vSwitch, or an instance. You can also specify a custom CIDR block. All instances within the CIDR block can access the Internet or external networks by using SNAT.</p>
     * <blockquote>
     * <p> If you specify <strong>SourceVSwitchId</strong> and <strong>SourceCIDR</strong>, <strong>SourceVSwitchId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The ID of the network. This parameter specifies that all ENS instances in the network can use the SNAT entry to access the Internet.</p>
     * <blockquote>
     * <p> If you specify <strong>SourceNetworkId</strong> and <strong>SourceVSwitchId</strong> or <strong>SourceCIDR</strong>, <strong>SourceNetworkId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence. Priority: <strong>SourceCIDR</strong> &gt; <strong>SourceVSwitchId</strong> &gt; <strong>SourceNetworkId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>n-2zeuphj08tt7q3brd****</p>
     */
    @NameInMap("SourceNetworkId")
    public String sourceNetworkId;

    /**
     * <p>The ID of the vSwitch that you need to access over the Internet. This parameter specifies that Edge Node Service (ENS) instances in the vSwitch can use the SNAT entry to access the Internet.</p>
     * <blockquote>
     * <p> If you specify <strong>SourceVSwitchId</strong> and <strong>SourceCIDR</strong>, <strong>SourceVSwitchId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1hwx7gi495q260p****</p>
     */
    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    /**
     * <p>The secondary EIP in the SNAT entry. Separate multiple secondary EIPs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>101.XXX.XXX.7</p>
     */
    @NameInMap("StandbySnatIp")
    public String standbySnatIp;

    public static CreateSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryRequest self = new CreateSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateSnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public CreateSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public CreateSnatEntryRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public CreateSnatEntryRequest setSourceNetworkId(String sourceNetworkId) {
        this.sourceNetworkId = sourceNetworkId;
        return this;
    }
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    public CreateSnatEntryRequest setSourceVSwitchId(String sourceVSwitchId) {
        this.sourceVSwitchId = sourceVSwitchId;
        return this;
    }
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    public CreateSnatEntryRequest setStandbySnatIp(String standbySnatIp) {
        this.standbySnatIp = standbySnatIp;
        return this;
    }
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

}
