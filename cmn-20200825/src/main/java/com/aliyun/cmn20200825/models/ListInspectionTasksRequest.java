// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 主机名
    @NameInMap("HostName")
    public String hostName;

    // 设备IP
    @NameInMap("Ip")
    public String ip;

    // 巡检状态
    @NameInMap("TaskStatus")
    public String taskStatus;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListInspectionTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksRequest self = new ListInspectionTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInspectionTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTasksRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListInspectionTasksRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListInspectionTasksRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListInspectionTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ListInspectionTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
