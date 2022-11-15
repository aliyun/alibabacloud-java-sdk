// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class LocationDateCluster extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("LocationDateClusterEndTime")
    public String locationDateClusterEndTime;

    @NameInMap("LocationDateClusterLevel")
    public String locationDateClusterLevel;

    @NameInMap("LocationDateClusterStartTime")
    public String locationDateClusterStartTime;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static LocationDateCluster build(java.util.Map<String, ?> map) throws Exception {
        LocationDateCluster self = new LocationDateCluster();
        return TeaModel.build(map, self);
    }

    public LocationDateCluster setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public LocationDateCluster setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public LocationDateCluster setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public LocationDateCluster setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public LocationDateCluster setLocationDateClusterEndTime(String locationDateClusterEndTime) {
        this.locationDateClusterEndTime = locationDateClusterEndTime;
        return this;
    }
    public String getLocationDateClusterEndTime() {
        return this.locationDateClusterEndTime;
    }

    public LocationDateCluster setLocationDateClusterLevel(String locationDateClusterLevel) {
        this.locationDateClusterLevel = locationDateClusterLevel;
        return this;
    }
    public String getLocationDateClusterLevel() {
        return this.locationDateClusterLevel;
    }

    public LocationDateCluster setLocationDateClusterStartTime(String locationDateClusterStartTime) {
        this.locationDateClusterStartTime = locationDateClusterStartTime;
        return this;
    }
    public String getLocationDateClusterStartTime() {
        return this.locationDateClusterStartTime;
    }

    public LocationDateCluster setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public LocationDateCluster setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public LocationDateCluster setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
