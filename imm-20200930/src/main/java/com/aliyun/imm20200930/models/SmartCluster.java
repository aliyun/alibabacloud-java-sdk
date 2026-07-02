// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SmartCluster extends TeaModel {
    /**
     * <p>The category of the grouping.</p>
     * 
     * <strong>example:</strong>
     * <p>figure</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The time when the grouping was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The description of the grouping.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个智能分组的描述示例，它用于展示记录的格式。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The grouping name.</p>
     * 
     * <strong>example:</strong>
     * <p>MySmartCluster1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The intelligent grouping ID.</p>
     * 
     * <strong>example:</strong>
     * <p>SmartCluster-12cd1645-deae-4b5e-9434-613747b75f6d</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The status of the grouping.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("ObjectStatus")
    public String objectStatus;

    /**
     * <p>The grouping type.</p>
     * 
     * <strong>example:</strong>
     * <p>smart-cluster</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1023210024677934</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyProject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The reason why the grouping failed.</p>
     * 
     * <strong>example:</strong>
     * <p>[InvalidArgument.BaseURIs] Each BaseURI must contain exactly one figure</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The grouping rule. This parameter is deprecated. Use the Rules parameter instead.</p>
     */
    @NameInMap("Rule")
    public SmartClusterRule rule;

    /**
     * <p>The list of grouping rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<SmartClusterRule> rules;

    /**
     * <p>The time when the grouping was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static SmartCluster build(java.util.Map<String, ?> map) throws Exception {
        SmartCluster self = new SmartCluster();
        return TeaModel.build(map, self);
    }

    public SmartCluster setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public SmartCluster setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SmartCluster setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SmartCluster setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SmartCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SmartCluster setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public SmartCluster setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
        return this;
    }
    public String getObjectStatus() {
        return this.objectStatus;
    }

    public SmartCluster setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SmartCluster setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SmartCluster setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SmartCluster setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SmartCluster setRule(SmartClusterRule rule) {
        this.rule = rule;
        return this;
    }
    public SmartClusterRule getRule() {
        return this.rule;
    }

    public SmartCluster setRules(java.util.List<SmartClusterRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<SmartClusterRule> getRules() {
        return this.rules;
    }

    public SmartCluster setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
