// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <p>The information about the resource.</p>
     */
    @NameInMap("DiscoveredResourceDetail")
    public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceResponseBody self = new GetDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceResponseBody setDiscoveredResourceDetail(GetDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail) {
        this.discoveredResourceDetail = discoveredResourceDetail;
        return this;
    }
    public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    public GetDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiscoveredResourceResponseBodyDiscoveredResourceDetail extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The configuration of the resource.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The ID of the region in which the resource resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created.</p>
         */
        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        /**
         * <p>Indicates whether the resource is deleted. Valid values:</p>
         * <br>
         * <p>*   1: The resource is retained.</p>
         * <p>*   0: The resource is deleted.</p>
         */
        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty. Examples:</p>
         * <br>
         * <p>*   If the value of the ResourceType parameter is ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</p>
         * <p>*   If the value of the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that does not have a specific state. In this case, this parameter is left empty.</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static GetDiscoveredResourceResponseBodyDiscoveredResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceResponseBodyDiscoveredResourceDetail self = new GetDiscoveredResourceResponseBodyDiscoveredResourceDetail();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
