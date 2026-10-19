// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateMultiModelKnowledgeBaseRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AdbInstanceName")
    public String adbInstanceName;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of ACUs for the AnalyticDB for MySQL instance resources.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("DbClusterAcu")
    public Integer dbClusterAcu;

    /**
     * <p>The description of the multimodal knowledge base instance.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
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

    /**
     * <p>The maximum number of ACUs for the multimodal knowledge base resources.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("ResourceAcuMax")
    public Integer resourceAcuMax;

    /**
     * <p>The minimum number of ACUs for the multimodal knowledge base resources.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ResourceAcuMin")
    public Integer resourceAcuMin;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1ak7shaq72ywiah****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66oesmrqge1t2gs****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
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

    public CreateMultiModelKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
