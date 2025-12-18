// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationSampleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>10093xxxx</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        @NameInMap("Configuration")
        public String configuration;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1646362560000</p>
         */
        @NameInMap("ResourceCreationTime")
        public String resourceCreationTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDeleted")
        public String resourceDeleted;

        /**
         * <strong>example:</strong>
         * <p>i-bp1aaegapahkh880x4wq</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>my-ecs</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;:\&quot;value\&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
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
