// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationSampleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB66****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sample.</p>
     */
    @NameInMap("Sample")
    public GetResourceConfigurationSampleResponseBodySample sample;

    public static GetResourceConfigurationSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationSampleResponseBody self = new GetResourceConfigurationSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceConfigurationSampleResponseBody setSample(GetResourceConfigurationSampleResponseBodySample sample) {
        this.sample = sample;
        return this;
    }
    public GetResourceConfigurationSampleResponseBodySample getSample() {
        return this.sample;
    }

    public static class GetResourceConfigurationSampleResponseBodySample extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101339776561****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The complete configuration information of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;:\&quot;Running\&quot;,\&quot;HibernationOptions\&quot;:{\&quot;Configured\&quot;:\&quot;false\&quot;},\&quot;ResourceGroupId\&quot;:\&quot;rg-bp67acfmxazb4p****\&quot;,\&quot;MetadataOptions\&quot;:{\&quot;HttpPutResponseHopLimit\&quot;:\&quot;0\&quot;,\&quot;HttpTokens\&quot;:\&quot;optional\&quot;,\&quot;HttpEndpoint\&quot;:\&quot;enabled\&quot;},\&quot;InstanceId\&quot;:\&quot;i-bp67acfmxazb4p****\&quot;,\&quot;InstanceChargeType\&quot;:\&quot;PostPaid\&quot;,\&quot;Memory\&quot;:\&quot;16384\&quot;,\&quot;StoppedMode\&quot;:\&quot;KeepCharging\&quot;,\&quot;CpuOptions\&quot;:{\&quot;ThreadsPerCore\&quot;:\&quot;4\&quot;,\&quot;Numa\&quot;:\&quot;2\&quot;,\&quot;CoreCount\&quot;:\&quot;2\&quot;},\&quot;StartTime\&quot;:\&quot;2017-12-10T04:04Z\&quot;,\&quot;Cpu\&quot;:\&quot;8\&quot;,\&quot;OSName\&quot;:\&quot;CentOS 7.4 64 bit\&quot;,\&quot;DeletionProtection\&quot;:\&quot;false\&quot;,\&quot;SecurityGroupIds\&quot;:{\&quot;SecurityGroupId\&quot;:[null]},\&quot;InstanceNetworkType\&quot;:\&quot;vpc\&quot;,\&quot;InnerIpAddress\&quot;:{\&quot;IpAddress\&quot;:[\&quot;<code>42.112.**.**</code>\&quot;]},\&quot;ExpiredTime\&quot;:\&quot;2017-12-10T04:04Z\&quot;,\&quot;EipAddress\&quot;:{\&quot;AllocationId\&quot;:\&quot;eip-2ze88m67qx5z****\&quot;,\&quot;Bandwidth\&quot;:\&quot;5\&quot;,\&quot;IpAddress\&quot;:\&quot;<code>42.112.**.**</code>\&quot;,\&quot;IsSupportUnassociate\&quot;:\&quot;true\&quot;,\&quot;InternetChargeType\&quot;:\&quot;PayByTraffic\&quot;},\&quot;ImageId\&quot;:\&quot;m-bp67acfmxazb4p****\&quot;,\&quot;ImageOptions\&quot;:{\&quot;LoginAsNonRoot\&quot;:\&quot;false\&quot;},\&quot;HostName\&quot;:\&quot;testHostName\&quot;,\&quot;Tags\&quot;:{\&quot;Tag\&quot;:[null]},\&quot;VlanId\&quot;:\&quot;10\&quot;}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1646362560000</p>
         */
        @NameInMap("ResourceCreationTime")
        public String resourceCreationTime;

        /**
         * <p>The deletion status of the resource. Valid values:</p>
         * <ul>
         * <li><p>1: The resource is retained.</p>
         * </li>
         * <li><p>0: The resource is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDeleted")
        public String resourceDeleted;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1aaegapahkh880****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-ecs</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;:\&quot;value\&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetResourceConfigurationSampleResponseBodySample build(java.util.Map<String, ?> map) throws Exception {
            GetResourceConfigurationSampleResponseBodySample self = new GetResourceConfigurationSampleResponseBodySample();
            return TeaModel.build(map, self);
        }

        public GetResourceConfigurationSampleResponseBodySample setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetResourceConfigurationSampleResponseBodySample setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetResourceConfigurationSampleResponseBodySample setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetResourceConfigurationSampleResponseBodySample setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceCreationTime(String resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public String getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceDeleted(String resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public String getResourceDeleted() {
            return this.resourceDeleted;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetResourceConfigurationSampleResponseBodySample setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceConfigurationSampleResponseBodySample setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetResourceConfigurationSampleResponseBodySample setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
