// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>Specifies whether to assign a mac address.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssignMac")
    public Boolean assignMac;

    /**
     * <p>By default, popApi is not ignored and idempotent</p>
     * 
     * <strong>example:</strong>
     * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the network interface controller.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-bp18exxqa2rvfn45e5pz</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The secondary private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.6.194</p>
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

    /**
     * <p>The default value is false. If you set the value to true, the secondary private IP address application process can be accelerated.</p>
     * <blockquote>
     * <p> For more information, submit a ticket.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipConfig")
    public Boolean skipConfig;

    /**
     * <p>It belongs to the Lingjun subnet.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-f3zfzmnc</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    public static AssignPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressRequest self = new AssignPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressRequest setAssignMac(Boolean assignMac) {
        this.assignMac = assignMac;
        return this;
    }
    public Boolean getAssignMac() {
        return this.assignMac;
    }

    public AssignPrivateIpAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssignPrivateIpAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AssignPrivateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignPrivateIpAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AssignPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssignPrivateIpAddressRequest setSkipConfig(Boolean skipConfig) {
        this.skipConfig = skipConfig;
        return this;
    }
    public Boolean getSkipConfig() {
        return this.skipConfig;
    }

    public AssignPrivateIpAddressRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
