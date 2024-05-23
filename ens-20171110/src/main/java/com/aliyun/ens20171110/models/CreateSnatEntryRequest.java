// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the Network Address Translation (NAT) gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The name of the SNAT entry. The name must be 1 to 128 characters in length. The name cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>The elastic IP address (EIP) in the SNAT entry. Separate multiple EIPs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The CIDR block. You can specify the CIDR block of a network, a vSwitch, or an instance. You can also specify a custom CIDR block. All instances within the CIDR block can access the Internet or external networks by using SNAT.</p>
     * <br>
     * <p>>  If you specify **SourceVSwitchId** and **SourceCIDR**, **SourceVSwitchId** does not take effect. The value that you specified for **SourceCIDR** takes precedence.</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    /**
     * <p>The ID of the network. This parameter specifies that all ENS instances in the network can use the SNAT entry to access the Internet.</p>
     * <br>
     * <p>>  If you specify **SourceNetworkId** and **SourceVSwitchId** or **SourceCIDR**, **SourceNetworkId** does not take effect. The value that you specified for **SourceCIDR** takes precedence. Priority: **SourceCIDR** > **SourceVSwitchId** > **SourceNetworkId**.</p>
     */
    @NameInMap("SourceNetworkId")
    public String sourceNetworkId;

    /**
     * <p>The ID of the vSwitch that you need to access over the Internet. This parameter specifies that Edge Node Service (ENS) instances in the vSwitch can use the SNAT entry to access the Internet.</p>
     * <br>
     * <p>>  If you specify **SourceVSwitchId** and **SourceCIDR**, **SourceVSwitchId** does not take effect. The value that you specified for **SourceCIDR** takes precedence.</p>
     */
    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    /**
     * <p>The secondary EIP in the SNAT entry. Separate multiple secondary EIPs with commas (,).</p>
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
