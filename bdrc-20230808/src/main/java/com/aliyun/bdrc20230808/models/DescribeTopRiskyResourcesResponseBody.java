// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTopRiskyResourcesResponseBody extends TeaModel {
    /**
     * <p>The data returned in the response.</p>
     */
    @NameInMap("Data")
    public DescribeTopRiskyResourcesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34081B20-C4C0-514F-93F6-8EEC3D1A587E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTopRiskyResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopRiskyResourcesResponseBody self = new DescribeTopRiskyResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopRiskyResourcesResponseBody setData(DescribeTopRiskyResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTopRiskyResourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeTopRiskyResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTopRiskyResourcesResponseBodyDataContent extends TeaModel {
        /**
         * <p>The size of data in the Archive storage class, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArchiveDataSize")
        public Long archiveDataSize;

        /**
         * <p>The number of checks that failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckFailedCount")
        public Long checkFailedCount;

        /**
         * <p>The size of data in the Cold Archive storage class, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ColdArchiveDataSize")
        public Long coldArchiveDataSize;

        /**
         * <p>The timestamp indicating when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1697798340</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data redundancy type. For example, \&quot;LRS\&quot; (locally redundant storage).</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        /**
         * <p>Indicates whether the data protection score assessment is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCheck")
        public Boolean enableCheck;

        /**
         * <p>The size of data in the Infrequent Access (IA) storage class, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IaDataSize")
        public Long iaDataSize;

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The data protection score of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ProtectionScore")
        public Integer protectionScore;

        /**
         * <p>The timestamp when the protection score was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1726036498</p>
         */
        @NameInMap("ProtectionScoreUpdatedTime")
        public Long protectionScoreUpdatedTime;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:cn-hangzhou:xxxxxxxx:instance/xxxxx</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-server</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The number of identified risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The size of data in the Standard storage class, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StandardDataSize")
        public Long standardDataSize;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the data. For example, \&quot;Standard\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The total data size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalDataSize")
        public Long totalDataSize;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTopRiskyResourcesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopRiskyResourcesResponseBodyDataContent self = new DescribeTopRiskyResourcesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setArchiveDataSize(Long archiveDataSize) {
            this.archiveDataSize = archiveDataSize;
            return this;
        }
        public Long getArchiveDataSize() {
            return this.archiveDataSize;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setCheckFailedCount(Long checkFailedCount) {
            this.checkFailedCount = checkFailedCount;
            return this;
        }
        public Long getCheckFailedCount() {
            return this.checkFailedCount;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setColdArchiveDataSize(Long coldArchiveDataSize) {
            this.coldArchiveDataSize = coldArchiveDataSize;
            return this;
        }
        public Long getColdArchiveDataSize() {
            return this.coldArchiveDataSize;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setEnableCheck(Boolean enableCheck) {
            this.enableCheck = enableCheck;
            return this;
        }
        public Boolean getEnableCheck() {
            return this.enableCheck;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setIaDataSize(Long iaDataSize) {
            this.iaDataSize = iaDataSize;
            return this;
        }
        public Long getIaDataSize() {
            return this.iaDataSize;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setProtectionScore(Integer protectionScore) {
            this.protectionScore = protectionScore;
            return this;
        }
        public Integer getProtectionScore() {
            return this.protectionScore;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setProtectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
            this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
            return this;
        }
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setStandardDataSize(Long standardDataSize) {
            this.standardDataSize = standardDataSize;
            return this;
        }
        public Long getStandardDataSize() {
            return this.standardDataSize;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setTotalDataSize(Long totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTopRiskyResourcesResponseBodyDataContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeTopRiskyResourcesResponseBodyData extends TeaModel {
        /**
         * <p>A list of resource objects.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeTopRiskyResourcesResponseBodyDataContent> content;

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If this parameter is not returned, it indicates that all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>e557bc9a65fe22cb5e2a3b240f06b0de</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of matching entries. This parameter is optional and might not be returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeTopRiskyResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopRiskyResourcesResponseBodyData self = new DescribeTopRiskyResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTopRiskyResourcesResponseBodyData setContent(java.util.List<DescribeTopRiskyResourcesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeTopRiskyResourcesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeTopRiskyResourcesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeTopRiskyResourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeTopRiskyResourcesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
