// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkCidrBlockRequest extends TeaModel {
    /**
     * <p>The secondary IPv6 CIDR block to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/110</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

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
     * <p>The secondary IPv4 CIDR block to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XX.XX.0/24</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    public static UnassociateNetworkCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkCidrBlockRequest self = new UnassociateNetworkCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkCidrBlockRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public UnassociateNetworkCidrBlockRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public UnassociateNetworkCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

}
