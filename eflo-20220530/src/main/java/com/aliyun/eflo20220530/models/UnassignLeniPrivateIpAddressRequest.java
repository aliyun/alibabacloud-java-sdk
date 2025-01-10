// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnassignLeniPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>The idempotent identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>967e77a2-b61d-11ec-a147-0242c0a80504</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Lingjun Elastic Network Interface ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>leni-1234****</p>
     */
    @NameInMap("ElasticNetworkInterfaceId")
    public String elasticNetworkInterfaceId;

    /**
     * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-8ylg****</p>
     */
    @NameInMap("IpName")
    public String ipName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UnassignLeniPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignLeniPrivateIpAddressRequest self = new UnassignLeniPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassignLeniPrivateIpAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnassignLeniPrivateIpAddressRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public UnassignLeniPrivateIpAddressRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public UnassignLeniPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
