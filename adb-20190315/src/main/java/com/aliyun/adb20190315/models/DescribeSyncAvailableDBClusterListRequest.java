// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncAvailableDBClusterListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The query type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Target</li>
     * <li>Source</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Source</p>
     */
    @NameInMap("QueryType")
    public String queryType;

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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source instances or clusters.</p>
     */
    @NameInMap("SourceDBCluster")
    public java.util.List<DescribeSyncAvailableDBClusterListRequestSourceDBCluster> sourceDBCluster;

    /**
     * <p>The synchronization platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB-CDC</p>
     */
    @NameInMap("SyncPlatform")
    public String syncPlatform;

    public static DescribeSyncAvailableDBClusterListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAvailableDBClusterListRequest self = new DescribeSyncAvailableDBClusterListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAvailableDBClusterListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSyncAvailableDBClusterListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSyncAvailableDBClusterListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeSyncAvailableDBClusterListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSyncAvailableDBClusterListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSyncAvailableDBClusterListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSyncAvailableDBClusterListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSyncAvailableDBClusterListRequest setSourceDBCluster(java.util.List<DescribeSyncAvailableDBClusterListRequestSourceDBCluster> sourceDBCluster) {
        this.sourceDBCluster = sourceDBCluster;
        return this;
    }
    public java.util.List<DescribeSyncAvailableDBClusterListRequestSourceDBCluster> getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    public DescribeSyncAvailableDBClusterListRequest setSyncPlatform(String syncPlatform) {
        this.syncPlatform = syncPlatform;
        return this;
    }
    public String getSyncPlatform() {
        return this.syncPlatform;
    }

    public static class DescribeSyncAvailableDBClusterListRequestSourceDBCluster extends TeaModel {
        /**
         * <p>The ID of the source instance or cluster. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1l3yh04y7us147n</p>
         */
        @NameInMap("ClusterIds")
        public String clusterIds;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The database type of the source instance or cluster.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rds: ApsaraDB RDS.</li>
         * <li>sls: Simple Log Service.</li>
         * <li>polardb: PolarDB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSyncAvailableDBClusterListRequestSourceDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAvailableDBClusterListRequestSourceDBCluster self = new DescribeSyncAvailableDBClusterListRequestSourceDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAvailableDBClusterListRequestSourceDBCluster setClusterIds(String clusterIds) {
            this.clusterIds = clusterIds;
            return this;
        }
        public String getClusterIds() {
            return this.clusterIds;
        }

        public DescribeSyncAvailableDBClusterListRequestSourceDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSyncAvailableDBClusterListRequestSourceDBCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
