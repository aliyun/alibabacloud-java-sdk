// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeResourcesResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeResourcesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>700683DE-0154-56D4-8D76-3B7A2C2C7DF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesResponseBody self = new DescribeResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesResponseBody setData(DescribeResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourcesResponseBodyDataContent extends TeaModel {
        /**
         * <p>The amount of data in the Archive storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArchiveDataSize")
        public Long archiveDataSize;

        /**
         * <p>The number of failed check items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckFailedCount")
        public Long checkFailedCount;

        /**
         * <p>The amount of data in the Cold Archive storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ColdArchiveDataSize")
        public Long coldArchiveDataSize;

        /**
         * <p>The UNIX timestamp that indicates when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1697798340</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data redundancy type.</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        /**
         * <p>Indicates whether data protection scoring is enabled for the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableCheck")
        public Boolean enableCheck;

        /**
         * <p>The amount of data in the Infrequent Access (IA) storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IaDataSize")
        public Long iaDataSize;

        /**
         * <p>The type of the cloud service.</p>
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
         * <p>0</p>
         */
        @NameInMap("ProtectionScore")
        public Integer protectionScore;

        /**
         * <p>The UNIX timestamp that indicates when the score was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProtectionScoreUpdatedTime")
        public Long protectionScoreUpdatedTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The unique resource ARN.</p>
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
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test server</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource owner ID.</p>
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
         * <p>The number of check items with potential risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The amount of data in the Standard storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StandardDataSize")
        public Long standardDataSize;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The total amount of data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalDataSize")
        public Long totalDataSize;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeResourcesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesResponseBodyDataContent self = new DescribeResourcesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesResponseBodyDataContent setArchiveDataSize(Long archiveDataSize) {
            this.archiveDataSize = archiveDataSize;
            return this;
        }
        public Long getArchiveDataSize() {
            return this.archiveDataSize;
        }

        public DescribeResourcesResponseBodyDataContent setCheckFailedCount(Long checkFailedCount) {
            this.checkFailedCount = checkFailedCount;
            return this;
        }
        public Long getCheckFailedCount() {
            return this.checkFailedCount;
        }

        public DescribeResourcesResponseBodyDataContent setColdArchiveDataSize(Long coldArchiveDataSize) {
            this.coldArchiveDataSize = coldArchiveDataSize;
            return this;
        }
        public Long getColdArchiveDataSize() {
            return this.coldArchiveDataSize;
        }

        public DescribeResourcesResponseBodyDataContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeResourcesResponseBodyDataContent setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public DescribeResourcesResponseBodyDataContent setEnableCheck(Boolean enableCheck) {
            this.enableCheck = enableCheck;
            return this;
        }
        public Boolean getEnableCheck() {
            return this.enableCheck;
        }

        public DescribeResourcesResponseBodyDataContent setIaDataSize(Long iaDataSize) {
            this.iaDataSize = iaDataSize;
            return this;
        }
        public Long getIaDataSize() {
            return this.iaDataSize;
        }

        public DescribeResourcesResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeResourcesResponseBodyDataContent setProtectionScore(Integer protectionScore) {
            this.protectionScore = protectionScore;
            return this;
        }
        public Integer getProtectionScore() {
            return this.protectionScore;
        }

        public DescribeResourcesResponseBodyDataContent setProtectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
            this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
            return this;
        }
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        public DescribeResourcesResponseBodyDataContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourcesResponseBodyDataContent setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public DescribeResourcesResponseBodyDataContent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourcesResponseBodyDataContent setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeResourcesResponseBodyDataContent setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public DescribeResourcesResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeResourcesResponseBodyDataContent setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeResourcesResponseBodyDataContent setStandardDataSize(Long standardDataSize) {
            this.standardDataSize = standardDataSize;
            return this;
        }
        public Long getStandardDataSize() {
            return this.standardDataSize;
        }

        public DescribeResourcesResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcesResponseBodyDataContent setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeResourcesResponseBodyDataContent setTotalDataSize(Long totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        public DescribeResourcesResponseBodyDataContent setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeResourcesResponseBodyDataContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeResourcesResponseBodyDataContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeResourcesResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned resources.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeResourcesResponseBodyDataContent> content;

        /**
         * <p>The maximum number of resources to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>fb836242f4225fa0f0e0257362dfc6dd</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of resources that match the query criteria. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesResponseBodyData self = new DescribeResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesResponseBodyData setContent(java.util.List<DescribeResourcesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeResourcesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeResourcesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeResourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeResourcesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
