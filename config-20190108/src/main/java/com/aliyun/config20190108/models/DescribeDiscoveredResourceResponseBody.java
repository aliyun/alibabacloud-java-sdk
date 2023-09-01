// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <p>The information about the resource.</p>
     */
    @NameInMap("DiscoveredResourceDetail")
    public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceResponseBody self = new DescribeDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceResponseBody setDiscoveredResourceDetail(DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail) {
        this.discoveredResourceDetail = discoveredResourceDetail;
        return this;
    }
    public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    public DescribeDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail extends TeaModel {
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The zone where the resource resides.</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The configuration of the resource.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The ID of the region.</p>
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
         * <p>*   1: The resource is not deleted.</p>
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
         * <p>The status of the resource. The parameter value varies with the resource type and may be left empty. Examples:</p>
         * <br>
         * <p>*   If ResourceType is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance which has a specific state. In this case, valid values of this parameter include Running and Stopped.</p>
         * <p>*   If ResourceType is set to ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket which does not have a specific state. In this case, this parameter is left empty.</p>
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

        public static DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail self = new DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiscoveredResourceResponseBodyDiscoveredResourceDetail setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
