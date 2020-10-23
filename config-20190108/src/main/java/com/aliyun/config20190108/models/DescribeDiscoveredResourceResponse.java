// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiscoveredResourceDetail")
    @Validation(required = true)
    public DescribeDiscoveredResourceResponseDiscoveredResourceDetail discoveredResourceDetail;

    public static DescribeDiscoveredResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceResponse self = new DescribeDiscoveredResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiscoveredResourceResponse setDiscoveredResourceDetail(DescribeDiscoveredResourceResponseDiscoveredResourceDetail discoveredResourceDetail) {
        this.discoveredResourceDetail = discoveredResourceDetail;
        return this;
    }
    public DescribeDiscoveredResourceResponseDiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    public static class DescribeDiscoveredResourceResponseDiscoveredResourceDetail extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AvailabilityZone")
        @Validation(required = true)
        public String availabilityZone;

        @NameInMap("ResourceCreationTime")
        @Validation(required = true)
        public Long resourceCreationTime;

        @NameInMap("ResourceStatus")
        @Validation(required = true)
        public String resourceStatus;

        @NameInMap("ResourceDeleted")
        @Validation(required = true)
        public Integer resourceDeleted;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Configuration")
        @Validation(required = true)
        public String configuration;

        public static DescribeDiscoveredResourceResponseDiscoveredResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiscoveredResourceResponseDiscoveredResourceDetail self = new DescribeDiscoveredResourceResponseDiscoveredResourceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDiscoveredResourceResponseDiscoveredResourceDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
