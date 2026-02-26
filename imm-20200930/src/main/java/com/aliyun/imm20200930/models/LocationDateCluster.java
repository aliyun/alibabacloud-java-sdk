// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class LocationDateCluster extends TeaModel {
    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    /**
     * <p>The time when the spatiotemporal cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-16T13:14:34.882523669+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user-01</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;User&quot;: &quot;Jane&quot;
     * }</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The end time of the spatiotemporal cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-02T23:59:59.999999999+08:00</p>
     */
    @NameInMap("LocationDateClusterEndTime")
    public String locationDateClusterEndTime;

    /**
     * <p>The administrative level of the spatiotemporal cluster.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>country</li>
     * <li>province</li>
     * <li>city</li>
     * <li>district</li>
     * <li>township</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>province</p>
     */
    @NameInMap("LocationDateClusterLevel")
    public String locationDateClusterLevel;

    /**
     * <p>The start time of the spatiotemporal cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-01T00:00:00+08:00</p>
     */
    @NameInMap("LocationDateClusterStartTime")
    public String locationDateClusterStartTime;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>location-date-cluster-14f48cb3-079d-4595-80c4-5735284b****</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The custom title.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The time when the spatiotemporal cluster was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-16T13:15:05.65746784+08:00</p>
     */
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
