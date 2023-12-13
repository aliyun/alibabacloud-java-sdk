// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateDataCacheRequest extends TeaModel {
    /**
     * <p>The bucket in which the data cache is stored. Default value: default.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The data cache ID.</p>
     */
    @NameInMap("DataCacheId")
    public String dataCacheId;

    /**
     * <p>The information about the data source.</p>
     */
    @NameInMap("DataSource")
    public UpdateDataCacheRequestDataSource dataSource;

    /**
     * <p>The elastic IP address (EIP) to be created and associated. If no NAT gateway is configured for the virtual private cloud (VPC), you can associate an EIP to pull data from the Internet.</p>
     */
    @NameInMap("EipCreateParam")
    public UpdateDataCacheRequestEipCreateParam eipCreateParam;

    /**
     * <p>The ID of the elastic IP address (EIP). If no NAT gateway is configured for the virtual private cloud (VPC), you can bind an EIP to the elastic container instance to pull data from the Internet.</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>The data cache name.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period for the data cache. The data cache is deleted after the retention period expires. By default, the data cache does not expire.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The data cache size.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The tags that are added to the data cache.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateDataCacheRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static UpdateDataCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCacheRequest self = new UpdateDataCacheRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataCacheRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public UpdateDataCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDataCacheRequest setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        return this;
    }
    public String getDataCacheId() {
        return this.dataCacheId;
    }

    public UpdateDataCacheRequest setDataSource(UpdateDataCacheRequestDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public UpdateDataCacheRequestDataSource getDataSource() {
        return this.dataSource;
    }

    public UpdateDataCacheRequest setEipCreateParam(UpdateDataCacheRequestEipCreateParam eipCreateParam) {
        this.eipCreateParam = eipCreateParam;
        return this;
    }
    public UpdateDataCacheRequestEipCreateParam getEipCreateParam() {
        return this.eipCreateParam;
    }

    public UpdateDataCacheRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public UpdateDataCacheRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateDataCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDataCacheRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataCacheRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateDataCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateDataCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateDataCacheRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public UpdateDataCacheRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateDataCacheRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public UpdateDataCacheRequest setTag(java.util.List<UpdateDataCacheRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateDataCacheRequestTag> getTag() {
        return this.tag;
    }

    public UpdateDataCacheRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class UpdateDataCacheRequestDataSource extends TeaModel {
        /**
         * <p>The parameters that are configured for the data source.</p>
         */
        @NameInMap("Options")
        public java.util.Map<String, String> options;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   URL</p>
         * <p>*   NAS</p>
         * <p>*   OSS</p>
         * <p>*   SNAPSHOT</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataCacheRequestDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCacheRequestDataSource self = new UpdateDataCacheRequestDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateDataCacheRequestDataSource setOptions(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }
        public java.util.Map<String, String> getOptions() {
            return this.options;
        }

        public UpdateDataCacheRequestDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataCacheRequestEipCreateParam extends TeaModel {
        /**
         * <p>The bandwidth of the EIP. Unit: Mbit/s. Default value: 5.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The EIP bandwidth plan to be associated.</p>
         */
        @NameInMap("CommonBandwidthPackage")
        public String commonBandwidthPackage;

        /**
         * <p>The line type of the EIP. Valid values:</p>
         * <br>
         * <p>*   BGP (default): BGP (Multi-ISP) line</p>
         * <p>*   BGP_PRO: BGP (Multi-ISP) Pro line</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-data-transfer</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The ID of the IP address pool. The EIP is allocated from the IP address pool. You cannot use the IP address pool feature by default. To use this feature, you must apply for the privilege in the Quota Center console.</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        public static UpdateDataCacheRequestEipCreateParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCacheRequestEipCreateParam self = new UpdateDataCacheRequestEipCreateParam();
            return TeaModel.build(map, self);
        }

        public UpdateDataCacheRequestEipCreateParam setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public UpdateDataCacheRequestEipCreateParam setCommonBandwidthPackage(String commonBandwidthPackage) {
            this.commonBandwidthPackage = commonBandwidthPackage;
            return this;
        }
        public String getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

        public UpdateDataCacheRequestEipCreateParam setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public UpdateDataCacheRequestEipCreateParam setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public UpdateDataCacheRequestEipCreateParam setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

    }

    public static class UpdateDataCacheRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataCacheRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCacheRequestTag self = new UpdateDataCacheRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateDataCacheRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDataCacheRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
