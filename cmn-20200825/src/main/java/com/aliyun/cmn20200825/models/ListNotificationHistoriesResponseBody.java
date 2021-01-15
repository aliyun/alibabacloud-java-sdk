// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    // request Id
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 数据列表
    @NameInMap("NotificationHistories")
    public java.util.List<ListNotificationHistoriesResponseBodyNotificationHistories> notificationHistories;

    public static ListNotificationHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesResponseBody self = new ListNotificationHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNotificationHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotificationHistoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotificationHistoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotificationHistoriesResponseBody setNotificationHistories(java.util.List<ListNotificationHistoriesResponseBodyNotificationHistories> notificationHistories) {
        this.notificationHistories = notificationHistories;
        return this;
    }
    public java.util.List<ListNotificationHistoriesResponseBodyNotificationHistories> getNotificationHistories() {
        return this.notificationHistories;
    }

    public static class ListNotificationHistoriesResponseBodyNotificationHistories extends TeaModel {
        // 发送时间
        @NameInMap("Time")
        public String time;

        // 发送方式
        @NameInMap("NotificationMode")
        public String notificationMode;

        // 发送状态
        @NameInMap("Status")
        public String status;

        // 输出内容
        @NameInMap("Output")
        public String output;

        // 发送内容
        @NameInMap("Message")
        public String message;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 通知组ID
        @NameInMap("NotificationGroupId")
        public String notificationGroupId;

        // 通知组名称
        @NameInMap("NotificationGroupName")
        public String notificationGroupName;

        // 专线ID
        @NameInMap("DedicatedLineId")
        public String dedicatedLineId;

        // 聚合数据ID
        @NameInMap("AggregateDataId")
        public String aggregateDataId;

        public static ListNotificationHistoriesResponseBodyNotificationHistories build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationHistoriesResponseBodyNotificationHistories self = new ListNotificationHistoriesResponseBodyNotificationHistories();
            return TeaModel.build(map, self);
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setNotificationMode(String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }
        public String getNotificationMode() {
            return this.notificationMode;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setNotificationGroupId(String notificationGroupId) {
            this.notificationGroupId = notificationGroupId;
            return this;
        }
        public String getNotificationGroupId() {
            return this.notificationGroupId;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setNotificationGroupName(String notificationGroupName) {
            this.notificationGroupName = notificationGroupName;
            return this;
        }
        public String getNotificationGroupName() {
            return this.notificationGroupName;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setDedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        public ListNotificationHistoriesResponseBodyNotificationHistories setAggregateDataId(String aggregateDataId) {
            this.aggregateDataId = aggregateDataId;
            return this;
        }
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

    }

}
