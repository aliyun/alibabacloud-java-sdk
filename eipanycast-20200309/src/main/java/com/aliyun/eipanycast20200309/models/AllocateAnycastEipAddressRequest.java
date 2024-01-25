// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AllocateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **200** to **1000**.</p>
     * <br>
     * <p>Default value: **1000**.</p>
     * <br>
     * <p>> The maximum bandwidth is not a guaranteed service and is for reference only.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Anycast EIP.</p>
     * <br>
     * <p>The description must be 0 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The billing method of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **PostPaid**, which specifies the pay-as-you-go billing method.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **PayByTraffic**, which specifies the pay-by-data-transfer metering method.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the Anycast EIP.</p>
     * <br>
     * <p>The name must be 0 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The access area of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **international**, which specifies the areas outside the Chinese mainland.</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    public static AllocateAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateAnycastEipAddressRequest self = new AllocateAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateAnycastEipAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateAnycastEipAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AllocateAnycastEipAddressRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AllocateAnycastEipAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateAnycastEipAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AllocateAnycastEipAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateAnycastEipAddressRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

}
