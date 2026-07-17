// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormInstanceRequest extends TeaModel {
    /**
     * <p>The new storage capacity of the instance. Unit: GB. Valid values: <strong>480</strong> to <strong>1017600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>480</p>
     */
    @NameInMap("ClusterStorage")
    public Integer clusterStorage;

    /**
     * <p>The new cold storage capacity of the instance. Unit: GB. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    /**
     * <p>The new storage capacity of a single core node in a multi-zone instance. Unit: GB. Valid values: 400 to 64000. <strong>This parameter is optional.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400GB</p>
     */
    @NameInMap("CoreSingleStorage")
    public Integer coreSingleStorage;

    /**
     * <p>The new number of file engine nodes. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    /**
     * <p>The new specification of the file engine nodes. Valid value:</p>
     * <p><strong>lindorm.c.xlarge</strong>: 4 CPU cores, 8 GB of memory (standard specification).</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/426069.html">GetLindormInstanceList</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1o3y0yme2i2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new number of wide table engine nodes. Valid values: <strong>0</strong> to <strong>90</strong>.</p>
     * <blockquote>
     * <p>If you specify this parameter, the LindormSpec parameter is also required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LindormNum")
    public Integer lindormNum;

    /**
     * <p>The new specification of the wide table engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.c.xlarge</strong>: 4 CPU cores, 8 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 CPU cores, 32 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 CPU cores, 64 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.c.xlarge</p>
     */
    @NameInMap("LindormSpec")
    public String lindormSpec;

    /**
     * <p>The new number of log nodes for a multi-zone instance. Valid values: 4 to 400. <strong>This parameter is optional.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNum")
    public Integer logNum;

    /**
     * <p>The new disk capacity of a single log node for a multi-zone instance. Unit: GB. Valid values: 400 to 64000. <strong>This parameter is optional.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>400GB</p>
     */
    @NameInMap("LogSingleStorage")
    public Integer logSingleStorage;

    /**
     * <p>The new specification of the log nodes for a multi-zone instance. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.sn1.large</strong>: 4 CPU cores, 8 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.sn1.2xlarge</strong>: 8 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * <p><strong>This parameter is optional.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>lindorm.sn1.large</p>
     */
    @NameInMap("LogSpec")
    public String logSpec;

    /**
     * <p>The new number of LTS nodes. Valid values: <strong>0</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LtsCoreNum")
    public Integer ltsCoreNum;

    /**
     * <p>The new specification of the LTS nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 CPU cores, 32 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("LtsCoreSpec")
    public String ltsCoreSpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the instance is located. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to obtain the latest region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The new number of search engine nodes. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SolrNum")
    public Integer solrNum;

    /**
     * <p>The new specification of the search engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 CPU cores, 32 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 CPU cores, 64 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarg</strong>e: 32 CPU cores, 128 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("SolrSpec")
    public String solrSpec;

    /**
     * <p>The new number of stream engine nodes. Valid values: <strong>0</strong> to <strong>90</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StreamNum")
    public Integer streamNum;

    /**
     * <p>The new specification of the stream engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.c.2xlarge</strong>: 8 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.c.4xlarge</strong>: 16 CPU cores, 32 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.c.8xlarge</strong>: 32 CPU cores, 64 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("StreamSpec")
    public String streamSpec;

    /**
     * <p>The new number of time series engine nodes. Valid values: <strong>0</strong> to <strong>24</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TsdbNum")
    public Integer tsdbNum;

    /**
     * <p>The new specification of the time series engine nodes. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm.g.xlarge</strong>: 4 CPU cores, 16 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.2xlarge</strong>: 8 CPU cores, 32 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.4xlarge</strong>: 16 CPU cores, 64 GB of memory (dedicated specification).</p>
     * </li>
     * <li><p><strong>lindorm.g.8xlarge</strong>: 32 CPU cores, 128 GB of memory (dedicated specification).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm.g.xlarge</p>
     */
    @NameInMap("TsdbSpec")
    public String tsdbSpec;

    /**
     * <p>The type of the upgrade. For details about the supported types, see the description of the UpgradeType parameter in the &quot;Additional information about request parameters&quot; section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>upgrade-cold-storage</p>
     */
    @NameInMap("UpgradeType")
    public String upgradeType;

    /**
     * <p>The ID of the availability zone. You can call the <a href="https://help.aliyun.com/document_detail/426067.html">GetLindormInstance</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
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

    public UpgradeLindormInstanceRequest setCoreSingleStorage(Integer coreSingleStorage) {
        this.coreSingleStorage = coreSingleStorage;
        return this;
    }
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
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

    public UpgradeLindormInstanceRequest setLogNum(Integer logNum) {
        this.logNum = logNum;
        return this;
    }
    public Integer getLogNum() {
        return this.logNum;
    }

    public UpgradeLindormInstanceRequest setLogSingleStorage(Integer logSingleStorage) {
        this.logSingleStorage = logSingleStorage;
        return this;
    }
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    public UpgradeLindormInstanceRequest setLogSpec(String logSpec) {
        this.logSpec = logSpec;
        return this;
    }
    public String getLogSpec() {
        return this.logSpec;
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

    public UpgradeLindormInstanceRequest setStreamNum(Integer streamNum) {
        this.streamNum = streamNum;
        return this;
    }
    public Integer getStreamNum() {
        return this.streamNum;
    }

    public UpgradeLindormInstanceRequest setStreamSpec(String streamSpec) {
        this.streamSpec = streamSpec;
        return this;
    }
    public String getStreamSpec() {
        return this.streamSpec;
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
