// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormInstanceRequest extends TeaModel {
    @NameInMap("ColdStorage")
    public Integer coldStorage;

    @NameInMap("CoreSpec")
    public String coreSpec;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("FilestoreNum")
    public Integer filestoreNum;

    @NameInMap("FilestoreSpec")
    public String filestoreSpec;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceStorage")
    public String instanceStorage;

    @NameInMap("LindormNum")
    public Integer lindormNum;

    @NameInMap("LindormSpec")
    public String lindormSpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

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

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLindormInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLindormInstanceRequest self = new CreateLindormInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLindormInstanceRequest setColdStorage(Integer coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    public CreateLindormInstanceRequest setCoreSpec(String coreSpec) {
        this.coreSpec = coreSpec;
        return this;
    }
    public String getCoreSpec() {
        return this.coreSpec;
    }

    public CreateLindormInstanceRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CreateLindormInstanceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateLindormInstanceRequest setFilestoreNum(Integer filestoreNum) {
        this.filestoreNum = filestoreNum;
        return this;
    }
    public Integer getFilestoreNum() {
        return this.filestoreNum;
    }

    public CreateLindormInstanceRequest setFilestoreSpec(String filestoreSpec) {
        this.filestoreSpec = filestoreSpec;
        return this;
    }
    public String getFilestoreSpec() {
        return this.filestoreSpec;
    }

    public CreateLindormInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public CreateLindormInstanceRequest setInstanceStorage(String instanceStorage) {
        this.instanceStorage = instanceStorage;
        return this;
    }
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    public CreateLindormInstanceRequest setLindormNum(Integer lindormNum) {
        this.lindormNum = lindormNum;
        return this;
    }
    public Integer getLindormNum() {
        return this.lindormNum;
    }

    public CreateLindormInstanceRequest setLindormSpec(String lindormSpec) {
        this.lindormSpec = lindormSpec;
        return this;
    }
    public String getLindormSpec() {
        return this.lindormSpec;
    }

    public CreateLindormInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLindormInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLindormInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateLindormInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateLindormInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLindormInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLindormInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLindormInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateLindormInstanceRequest setSolrNum(Integer solrNum) {
        this.solrNum = solrNum;
        return this;
    }
    public Integer getSolrNum() {
        return this.solrNum;
    }

    public CreateLindormInstanceRequest setSolrSpec(String solrSpec) {
        this.solrSpec = solrSpec;
        return this;
    }
    public String getSolrSpec() {
        return this.solrSpec;
    }

    public CreateLindormInstanceRequest setTsdbNum(Integer tsdbNum) {
        this.tsdbNum = tsdbNum;
        return this;
    }
    public Integer getTsdbNum() {
        return this.tsdbNum;
    }

    public CreateLindormInstanceRequest setTsdbSpec(String tsdbSpec) {
        this.tsdbSpec = tsdbSpec;
        return this;
    }
    public String getTsdbSpec() {
        return this.tsdbSpec;
    }

    public CreateLindormInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateLindormInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLindormInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
