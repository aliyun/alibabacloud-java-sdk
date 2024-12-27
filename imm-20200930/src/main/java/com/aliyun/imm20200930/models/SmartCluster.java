// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SmartCluster extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectStatus")
    public String objectStatus;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Rule")
    public SmartClusterRule rule;

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
