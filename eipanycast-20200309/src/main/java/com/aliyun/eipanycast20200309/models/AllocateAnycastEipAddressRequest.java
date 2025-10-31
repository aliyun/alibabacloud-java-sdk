// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AllocateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>200</strong> to <strong>1000</strong>.</p>
     * <p>Default value: <strong>1000</strong>.</p>
     * <blockquote>
     * <p>The maximum bandwidth is not a guaranteed service and is for reference only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Anycast EIP.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>docdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The billing method of the Anycast EIP.</p>
     * <p>Set the value to <strong>PostPaid</strong>, which specifies the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Anycast EIP.</p>
     * <p>Set the value to <strong>PayByTraffic</strong>, which specifies the pay-by-data-transfer metering method.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the Anycast EIP.</p>
     * <p>The name must be 0 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3obzjukv53a</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The access area of the Anycast EIP.</p>
     * <p>Set the value to <strong>international</strong>, which specifies the areas outside the Chinese mainland.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>international</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    @NameInMap("Tag")
    public java.util.List<AllocateAnycastEipAddressRequestTag> tag;

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

    public AllocateAnycastEipAddressRequest setTag(java.util.List<AllocateAnycastEipAddressRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AllocateAnycastEipAddressRequestTag> getTag() {
        return this.tag;
    }

    public static class AllocateAnycastEipAddressRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AllocateAnycastEipAddressRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateAnycastEipAddressRequestTag self = new AllocateAnycastEipAddressRequestTag();
            return TeaModel.build(map, self);
        }

        public AllocateAnycastEipAddressRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AllocateAnycastEipAddressRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
