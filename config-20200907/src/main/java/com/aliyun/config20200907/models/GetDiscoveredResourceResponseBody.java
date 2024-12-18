// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <p>The details of the resource.</p>
     */
    @NameInMap("DiscoveredResourceDetail")
    public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4D71ACE-6B0A-46E0-8352-56952378CC7F</p>
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
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the zone in which the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The compliance evaluation result of the resource. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resource is evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resource is evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
         * <li>INSUFFICIENT_DATA: No data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The configuration of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;AccessControlList\&quot;:{\&quot;Grant\&quot;:\&quot;private\&quot;},\&quot;ServerSideEncryptionRule\&quot;:{\&quot;SSEAlgorithm\&quot;:\&quot;None\&quot;},\&quot;Comment\&quot;:\&quot;\&quot;,\&quot;CreationDate\&quot;:\&quot;2021-06-29T10:05:12.000Z\&quot;,\&quot;Owner\&quot;:{\&quot;DisplayName\&quot;:\&quot;100931896542****\&quot;,\&quot;ID\&quot;:\&quot;100931896542****\&quot;},\&quot;StorageClass\&quot;:\&quot;Standard\&quot;,\&quot;DataRedundancyType\&quot;:\&quot;LRS\&quot;,\&quot;AllowEmptyReferer\&quot;:\&quot;true\&quot;,\&quot;Name\&quot;:\&quot;new-bucket\&quot;,\&quot;BucketPolicy\&quot;:{\&quot;LogPrefix\&quot;:\&quot;\&quot;,\&quot;LogBucket\&quot;:\&quot;\&quot;},\&quot;ExtranetEndpoint\&quot;:\&quot;oss-cn-hangzhou.aliyuncs.com\&quot;,\&quot;IntranetEndpoint\&quot;:\&quot;oss-cn-hangzhou-internal.aliyuncs.com\&quot;,\&quot;Location\&quot;:\&quot;oss-cn-hangzhou\&quot;}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        /**
         * <p>Indicates whether the resource was deleted. Valid values:</p>
         * <ul>
         * <li>1: The resource was not deleted.</li>
         * <li>0: The resource was deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>new-bucket</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>new-bucket</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The status of the resource. The value of this parameter varies based on the resource type and may be empty.</p>
         * <ul>
         * <li>If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an ECS instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
         * <li>If the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is left empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>offline</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OSS::BucketACS::CDN::Domain</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;\&quot;hc\&quot;\&quot;:[\&quot;\&quot;value2\&quot;\&quot;]}</p>
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

        public GetDiscoveredResourceResponseBodyDiscoveredResourceDetail setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
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
