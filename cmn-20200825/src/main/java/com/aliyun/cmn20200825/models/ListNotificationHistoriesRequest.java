// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesRequest extends TeaModel {
    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 监控项ID
    @NameInMap("MonitorItemId")
    public String monitorItemId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 类型
    @NameInMap("Type")
    public String type;

    // 专线ID
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 聚合数据ID
    @NameInMap("AggregateDataId")
    public String aggregateDataId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    public static ListNotificationHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesRequest self = new ListNotificationHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotificationHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotificationHistoriesRequest setMonitorItemId(String monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public ListNotificationHistoriesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListNotificationHistoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListNotificationHistoriesRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public ListNotificationHistoriesRequest setAggregateDataId(String aggregateDataId) {
        this.aggregateDataId = aggregateDataId;
        return this;
    }
    public String getAggregateDataId() {
        return this.aggregateDataId;
    }

    public ListNotificationHistoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNotificationHistoriesRequest setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

}
