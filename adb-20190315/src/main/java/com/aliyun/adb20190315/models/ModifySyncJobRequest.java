// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySyncJobRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp12bh6z59nh8497f</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source instances or clusters.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SourceDBCluster")
    public java.util.List<ModifySyncJobRequestSourceDBCluster> sourceDBCluster;

    /**
     * <p>The synchronization platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB-CDC</p>
     */
    @NameInMap("SyncPlatform")
    public String syncPlatform;

    public static ModifySyncJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySyncJobRequest self = new ModifySyncJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifySyncJobRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifySyncJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySyncJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySyncJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySyncJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySyncJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySyncJobRequest setSourceDBCluster(java.util.List<ModifySyncJobRequestSourceDBCluster> sourceDBCluster) {
        this.sourceDBCluster = sourceDBCluster;
        return this;
    }
    public java.util.List<ModifySyncJobRequestSourceDBCluster> getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    public ModifySyncJobRequest setSyncPlatform(String syncPlatform) {
        this.syncPlatform = syncPlatform;
        return this;
    }
    public String getSyncPlatform() {
        return this.syncPlatform;
    }

    public static class ModifySyncJobRequestSourceDBCluster extends TeaModel {
        /**
         * <p>The ID of the source instance or cluster. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zepqn129i9s3l2z3,rm-2zea4dj583129ksp6</p>
         */
        @NameInMap("ClusterIds")
        public String clusterIds;

        /**
         * <p>The ID of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-xxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The operation type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Create</li>
         * <li>Modify</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The source database type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rds: ApsaraDB RDS.</li>
         * <li>sls: Simple Log Service.</li>
         * <li>polardb: PolarDB.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifySyncJobRequestSourceDBCluster build(java.util.Map<String, ?> map) throws Exception {
            ModifySyncJobRequestSourceDBCluster self = new ModifySyncJobRequestSourceDBCluster();
            return TeaModel.build(map, self);
        }

        public ModifySyncJobRequestSourceDBCluster setClusterIds(String clusterIds) {
            this.clusterIds = clusterIds;
            return this;
        }
        public String getClusterIds() {
            return this.clusterIds;
        }

        public ModifySyncJobRequestSourceDBCluster setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ModifySyncJobRequestSourceDBCluster setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ModifySyncJobRequestSourceDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifySyncJobRequestSourceDBCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
