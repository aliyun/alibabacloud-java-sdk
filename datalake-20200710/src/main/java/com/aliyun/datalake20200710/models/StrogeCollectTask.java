// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StrogeCollectTask extends TeaModel {
    @NameInMap("DestinationBucketName")
    public String destinationBucketName;

    @NameInMap("DestinationPrefix")
    public String destinationPrefix;

    @NameInMap("DlfCreated")
    public Boolean dlfCreated;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public String id;

    @NameInMap("InventoryId")
    public String inventoryId;

    @NameInMap("Location")
    public String location;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskType")
    public String taskType;

    public static StrogeCollectTask build(java.util.Map<String, ?> map) throws Exception {
        StrogeCollectTask self = new StrogeCollectTask();
        return TeaModel.build(map, self);
    }

    public StrogeCollectTask setDestinationBucketName(String destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
        return this;
    }
    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    public StrogeCollectTask setDestinationPrefix(String destinationPrefix) {
        this.destinationPrefix = destinationPrefix;
        return this;
    }
    public String getDestinationPrefix() {
        return this.destinationPrefix;
    }

    public StrogeCollectTask setDlfCreated(Boolean dlfCreated) {
        this.dlfCreated = dlfCreated;
        return this;
    }
    public Boolean getDlfCreated() {
        return this.dlfCreated;
    }

    public StrogeCollectTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public StrogeCollectTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public StrogeCollectTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StrogeCollectTask setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }
    public String getInventoryId() {
        return this.inventoryId;
    }

    public StrogeCollectTask setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public StrogeCollectTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StrogeCollectTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
