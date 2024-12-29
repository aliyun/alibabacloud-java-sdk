// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsHiveWorkloadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ApsWorkload")
    public DescribeApsHiveWorkloadResponseBodyApsWorkload apsWorkload;

    /**
     * <strong>example:</strong>
     * <p>86F92D26-B774-5FA1-8E53-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApsHiveWorkloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsHiveWorkloadResponseBody self = new DescribeApsHiveWorkloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsHiveWorkloadResponseBody setApsWorkload(DescribeApsHiveWorkloadResponseBodyApsWorkload apsWorkload) {
        this.apsWorkload = apsWorkload;
        return this;
    }
    public DescribeApsHiveWorkloadResponseBodyApsWorkload getApsWorkload() {
        return this.apsWorkload;
    }

    public DescribeApsHiveWorkloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApsHiveWorkloadResponseBodyApsWorkload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test.adv.config=value</p>
         */
        @NameInMap("AdvancedConfig")
        public String advancedConfig;

        /**
         * <strong>example:</strong>
         * <p>Intercept</p>
         */
        @NameInMap("ConflictStrategy")
        public String conflictStrategy;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>amv-*******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <strong>example:</strong>
         * <p>sls-******</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("EmrClusterId")
        public String emrClusterId;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("FullComputeUnit")
        public String fullComputeUnit;

        /**
         * <p>hive meta store url。</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MetaStoreUri")
        public String metaStoreUri;

        /**
         * <strong>example:</strong>
         * <p>oss://******</p>
         */
        @NameInMap("OssLocation")
        public String ossLocation;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Parallelism")
        public Long parallelism;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SyncAllowExpression")
        public String syncAllowExpression;

        /**
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("SyncDenyExpression")
        public String syncDenyExpression;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <strong>example:</strong>
         * <p>vsw-******</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        /**
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        @NameInMap("WorkloadId")
        public String workloadId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadTypeName")
        public String workloadTypeName;

        public static DescribeApsHiveWorkloadResponseBodyApsWorkload build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsHiveWorkloadResponseBodyApsWorkload self = new DescribeApsHiveWorkloadResponseBodyApsWorkload();
            return TeaModel.build(map, self);
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setAdvancedConfig(String advancedConfig) {
            this.advancedConfig = advancedConfig;
            return this;
        }
        public String getAdvancedConfig() {
            return this.advancedConfig;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setConflictStrategy(String conflictStrategy) {
            this.conflictStrategy = conflictStrategy;
            return this;
        }
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setEmrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setFullComputeUnit(String fullComputeUnit) {
            this.fullComputeUnit = fullComputeUnit;
            return this;
        }
        public String getFullComputeUnit() {
            return this.fullComputeUnit;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setMetaStoreUri(String metaStoreUri) {
            this.metaStoreUri = metaStoreUri;
            return this;
        }
        public String getMetaStoreUri() {
            return this.metaStoreUri;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setOssLocation(String ossLocation) {
            this.ossLocation = ossLocation;
            return this;
        }
        public String getOssLocation() {
            return this.ossLocation;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setParallelism(Long parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Long getParallelism() {
            return this.parallelism;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setSyncAllowExpression(String syncAllowExpression) {
            this.syncAllowExpression = syncAllowExpression;
            return this;
        }
        public String getSyncAllowExpression() {
            return this.syncAllowExpression;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setSyncDenyExpression(String syncDenyExpression) {
            this.syncDenyExpression = syncDenyExpression;
            return this;
        }
        public String getSyncDenyExpression() {
            return this.syncDenyExpression;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setWorkloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public String getWorkloadId() {
            return this.workloadId;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

        public DescribeApsHiveWorkloadResponseBodyApsWorkload setWorkloadTypeName(String workloadTypeName) {
            this.workloadTypeName = workloadTypeName;
            return this;
        }
        public String getWorkloadTypeName() {
            return this.workloadTypeName;
        }

    }

}
