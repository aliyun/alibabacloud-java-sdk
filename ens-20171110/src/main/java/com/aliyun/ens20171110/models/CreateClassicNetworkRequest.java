// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClassicNetworkRequest extends TeaModel {
    /**
     * <p>The CIDR block of the network. You can use one of the following CIDR blocks or their subnets as the CIDR block of the network:</p>
     * <br>
     * <p>*   10.0.0.0/8 (default)</p>
     * <p>*   172.16.0.0/12</p>
     * <p>*   192.168.0.0/16</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the network. The name must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the edge node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The name of the network. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length.</p>
     * <p>*   The name must start with a letter but cannot start with http:// or https://.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    public static CreateClassicNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClassicNetworkRequest self = new CreateClassicNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClassicNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateClassicNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClassicNetworkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateClassicNetworkRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

}
