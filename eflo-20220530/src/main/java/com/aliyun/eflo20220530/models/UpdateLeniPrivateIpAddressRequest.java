// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateLeniPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>The description of the ECS instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

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

    public static UpdateLeniPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLeniPrivateIpAddressRequest self = new UpdateLeniPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLeniPrivateIpAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLeniPrivateIpAddressRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public UpdateLeniPrivateIpAddressRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public UpdateLeniPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
