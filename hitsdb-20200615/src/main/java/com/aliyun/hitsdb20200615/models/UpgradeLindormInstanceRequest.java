// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormInstanceRequest extends TeaModel {
    @NameInMap("ClusterStorage")
    public Integer clusterStorage;

    @NameInMap("ColdStorage")
    public Integer coldStorage;

    @NameInMap("CoreNum")
    public Integer coreNum;

    @NameInMap("CoreSpec")
    public String coreSpec;

    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LindormNum")
    public Integer lindormNum;

    @NameInMap("LindormSpec")
    public String lindormSpec;

    @NameInMap("LtsCoreNum")
    public Integer ltsCoreNum;

    @NameInMap("LtsCoreSpec")
    public String ltsCoreSpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoenixCoreNum")
    public Integer phoenixCoreNum;

    @NameInMap("PhoenixCoreSpec")
    public String phoenixCoreSpec;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SolrNum")
    public Integer solrNum;

    @NameInMap("SolrSpec")
    public String solrSpec;

    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    @NameInMap("UpgradeType")
    public String upgradeType;

    @NameInMap("ZoneId")
    public String zoneId;

    public static UpgradeLindormInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormInstanceRequest self = new UpgradeLindormInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormInstanceRequest setClusterStorage(Integer clusterStorage) {
        this.clusterStorage = clusterStorage;
        return this;
    }
    public Integer getClusterStorage() {
        return this.clusterStorage;
    }

    public UpgradeLindormInstanceRequest setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public UpgradeLindormInstanceRequest setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }
    public Integer getCoreNum() {
        return this.coreNum;
    }

    public UpgradeLindormInstanceRequest setCoreSpec(String coreSpec) {
        this.coreSpec = coreSpec;
        return this;
    }
    public String getCoreSpec() {
        return this.coreSpec;
    }

    public UpgradeLindormInstanceRequest setFilestoreNum(Integer filestoreNum) {
        this.filestoreNum = filestoreNum;
        return this;
    }
    public Integer getFilestoreNum() {
        return this.filestoreNum;
    }

    public UpgradeLindormInstanceRequest setFilestoreSpec(String filestoreSpec) {
        this.filestoreSpec = filestoreSpec;
        return this;
    }
    public String getFilestoreSpec() {
        return this.filestoreSpec;
    }

    public UpgradeLindormInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeLindormInstanceRequest setLindormNum(Integer lindormNum) {
        this.lindormNum = lindormNum;
        return this;
    }
    public Integer getLindormNum() {
        return this.lindormNum;
    }

    public UpgradeLindormInstanceRequest setLindormSpec(String lindormSpec) {
        this.lindormSpec = lindormSpec;
        return this;
    }
    public String getLindormSpec() {
        return this.lindormSpec;
    }

    public UpgradeLindormInstanceRequest setLtsCoreNum(Integer ltsCoreNum) {
        this.ltsCoreNum = ltsCoreNum;
        return this;
    }
    public Integer getLtsCoreNum() {
        return this.ltsCoreNum;
    }

    public UpgradeLindormInstanceRequest setLtsCoreSpec(String ltsCoreSpec) {
        this.ltsCoreSpec = ltsCoreSpec;
        return this;
    }
    public String getLtsCoreSpec() {
        return this.ltsCoreSpec;
    }

    public UpgradeLindormInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeLindormInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeLindormInstanceRequest setPhoenixCoreNum(Integer phoenixCoreNum) {
        this.phoenixCoreNum = phoenixCoreNum;
        return this;
    }
    public Integer getPhoenixCoreNum() {
        return this.phoenixCoreNum;
    }

    public UpgradeLindormInstanceRequest setPhoenixCoreSpec(String phoenixCoreSpec) {
        this.phoenixCoreSpec = phoenixCoreSpec;
        return this;
    }
    public String getPhoenixCoreSpec() {
        return this.phoenixCoreSpec;
    }

    public UpgradeLindormInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeLindormInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeLindormInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeLindormInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpgradeLindormInstanceRequest setSolrNum(Integer solrNum) {
        this.solrNum = solrNum;
        return this;
    }
    public Integer getSolrNum() {
        return this.solrNum;
    }

    public UpgradeLindormInstanceRequest setSolrSpec(String solrSpec) {
        this.solrSpec = solrSpec;
        return this;
    }
    public String getSolrSpec() {
        return this.solrSpec;
    }

    public UpgradeLindormInstanceRequest setTsdbNum(Integer tsdbNum) {
        this.tsdbNum = tsdbNum;
        return this;
    }
    public Integer getTsdbNum() {
        return this.tsdbNum;
    }

    public UpgradeLindormInstanceRequest setTsdbSpec(String tsdbSpec) {
        this.tsdbSpec = tsdbSpec;
        return this;
    }
    public String getTsdbSpec() {
        return this.tsdbSpec;
    }

    public UpgradeLindormInstanceRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public UpgradeLindormInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
