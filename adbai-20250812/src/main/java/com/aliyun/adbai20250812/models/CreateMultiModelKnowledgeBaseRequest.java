// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateMultiModelKnowledgeBaseRequest extends TeaModel {
    @NameInMap("AdbInstanceName")
    public String adbInstanceName;

    /**
     * <p>The instance cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DbClusterAcu")
    public Integer dbClusterAcu;

    @NameInMap("LakeStorageBucketName")
    public String lakeStorageBucketName;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceAcuMax")
    public Integer resourceAcuMax;

    @NameInMap("ResourceAcuMin")
    public Integer resourceAcuMin;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateMultiModelKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModelKnowledgeBaseRequest self = new CreateMultiModelKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiModelKnowledgeBaseRequest setAdbInstanceName(String adbInstanceName) {
        this.adbInstanceName = adbInstanceName;
        return this;
    }
    public String getAdbInstanceName() {
        return this.adbInstanceName;
    }

    public CreateMultiModelKnowledgeBaseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultiModelKnowledgeBaseRequest setDbClusterAcu(Integer dbClusterAcu) {
        this.dbClusterAcu = dbClusterAcu;
        return this;
    }
    public Integer getDbClusterAcu() {
        return this.dbClusterAcu;
    }

    public CreateMultiModelKnowledgeBaseRequest setLakeStorageBucketName(String lakeStorageBucketName) {
        this.lakeStorageBucketName = lakeStorageBucketName;
        return this;
    }
    public String getLakeStorageBucketName() {
        return this.lakeStorageBucketName;
    }

    public CreateMultiModelKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMultiModelKnowledgeBaseRequest setResourceAcuMax(Integer resourceAcuMax) {
        this.resourceAcuMax = resourceAcuMax;
        return this;
    }
    public Integer getResourceAcuMax() {
        return this.resourceAcuMax;
    }

    public CreateMultiModelKnowledgeBaseRequest setResourceAcuMin(Integer resourceAcuMin) {
        this.resourceAcuMin = resourceAcuMin;
        return this;
    }
    public Integer getResourceAcuMin() {
        return this.resourceAcuMin;
    }

    public CreateMultiModelKnowledgeBaseRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateMultiModelKnowledgeBaseRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateMultiModelKnowledgeBaseRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
