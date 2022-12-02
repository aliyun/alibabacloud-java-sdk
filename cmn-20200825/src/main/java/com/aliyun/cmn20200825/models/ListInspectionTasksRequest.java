// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksRequest extends TeaModel {
    @NameInMap("AlarmStatus")
    public java.util.List<String> alarmStatus;

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

    public static ListInspectionTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksRequest self = new ListInspectionTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksRequest setAlarmStatus(java.util.List<String> alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public java.util.List<String> getAlarmStatus() {
        return this.alarmStatus;
    }

    public ListInspectionTasksRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ListInspectionTasksRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListInspectionTasksRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ListInspectionTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionTasksRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListInspectionTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionTasksRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListInspectionTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTasksRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListInspectionTasksRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListInspectionTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ListInspectionTasksRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
