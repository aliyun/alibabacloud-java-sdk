// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTopRiskyResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTopRiskyResourcesResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArchiveDataSize")
        public Long archiveDataSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckFailedCount")
        public Long checkFailedCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ColdArchiveDataSize")
        public Long coldArchiveDataSize;

        /**
         * <strong>example:</strong>
         * <p>1697798340</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCheck")
        public Boolean enableCheck;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IaDataSize")
        public Long iaDataSize;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ProtectionScore")
        public Integer protectionScore;

        /**
         * <strong>example:</strong>
         * <p>1726036498</p>
         */
        @NameInMap("ProtectionScoreUpdatedTime")
        public Long protectionScoreUpdatedTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>acs:ecs:cn-hangzhou:xxxxxxxx:instance/xxxxx</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>test-server</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StandardDataSize")
        public Long standardDataSize;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalDataSize")
        public Long totalDataSize;

        /**
         * <p>vSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>vpc ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
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
        @NameInMap("Content")
        public java.util.List<DescribeTopRiskyResourcesResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>e557bc9a65fe22cb5e2a3b240f06b0de</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
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
