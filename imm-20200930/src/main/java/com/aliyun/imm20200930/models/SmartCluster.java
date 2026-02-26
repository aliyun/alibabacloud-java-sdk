// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SmartCluster extends TeaModel {
    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:17:18.102700407+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The description of the cluster.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>MySmartCluster1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>SmartCluster-12cd1645-deae-4b5e-9434-613747b75f6d</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The status of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("ObjectStatus")
    public String objectStatus;

    /**
     * <p>The type of the cluster.</p>
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
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>MyProject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The clustering rule.</p>
     */
    @NameInMap("Rule")
    public SmartClusterRule rule;

    /**
     * <p>The time when the cluster was updated.</p>
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

    public SmartCluster setRule(SmartClusterRule rule) {
        this.rule = rule;
        return this;
    }
    public SmartClusterRule getRule() {
        return this.rule;
    }

    public SmartCluster setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
