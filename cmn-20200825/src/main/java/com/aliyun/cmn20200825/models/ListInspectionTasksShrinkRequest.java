// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksShrinkRequest extends TeaModel {
    @NameInMap("AlarmStatus")
    public String alarmStatusShrink;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("IP")
    public String IP;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Model")
    public String model;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Role")
    public String role;

    @NameInMap("Space")
    public String space;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("Vendor")
    public String vendor;

    public static ListInspectionTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksShrinkRequest self = new ListInspectionTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksShrinkRequest setAlarmStatusShrink(String alarmStatusShrink) {
        this.alarmStatusShrink = alarmStatusShrink;
        return this;
    }
    public String getAlarmStatusShrink() {
        return this.alarmStatusShrink;
    }

    public ListInspectionTasksShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ListInspectionTasksShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListInspectionTasksShrinkRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ListInspectionTasksShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionTasksShrinkRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListInspectionTasksShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionTasksShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListInspectionTasksShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTasksShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListInspectionTasksShrinkRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListInspectionTasksShrinkRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ListInspectionTasksShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
