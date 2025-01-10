// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignLeniPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>The idempotent identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the response code.</p>
     * 
     * <strong>example:</strong>
     * <p>wuhuaiyu</p>
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
     * <p>Lingjun Elastic Network Interface secondary private network IP (automatically assigned by default).</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.****</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssignLeniPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignLeniPrivateIpAddressRequest self = new AssignLeniPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssignLeniPrivateIpAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssignLeniPrivateIpAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AssignLeniPrivateIpAddressRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public AssignLeniPrivateIpAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AssignLeniPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
