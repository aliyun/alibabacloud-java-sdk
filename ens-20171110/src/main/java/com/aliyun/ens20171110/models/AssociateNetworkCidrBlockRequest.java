// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateNetworkCidrBlockRequest extends TeaModel {
    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li>IPV4: IPv4 address.</li>
     * <li>IPV6: IPv6 address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The ISP of the IPv6 CIDR block. Valid values:</p>
     * <ul>
     * <li>cmcc</li>
     * <li>unicom</li>
     * <li>telecom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Ipv6Isp")
    public String ipv6Isp;

    /**
     * <p>The network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n-257gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The secondary IPv4 CIDR block to be added. The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>The CIDR block must be within the 10.0.0.0/8, 172.16.0.0/12, or 192.168.0.0/16 range.</li>
     * <li>The secondary CIDR block must not overlap with the primary CIDR block or existing secondary CIDR blocks of the network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.XX.XX.0/24</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    public static AssociateNetworkCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkCidrBlockRequest self = new AssociateNetworkCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkCidrBlockRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AssociateNetworkCidrBlockRequest setIpv6Isp(String ipv6Isp) {
        this.ipv6Isp = ipv6Isp;
        return this;
    }
    public String getIpv6Isp() {
        return this.ipv6Isp;
    }

    public AssociateNetworkCidrBlockRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public AssociateNetworkCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

}
