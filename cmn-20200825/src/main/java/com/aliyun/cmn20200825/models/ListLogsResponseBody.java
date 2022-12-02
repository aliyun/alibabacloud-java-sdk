// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<ListLogsResponseBodyLogs> logs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponseBody self = new ListLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogsResponseBody setLogs(java.util.List<ListLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLogsResponseBodyLogsResourceDevice extends TeaModel {
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("PhysicalSpace")
        public String physicalSpace;

        public static ListLogsResponseBodyLogsResourceDevice build(java.util.Map<String, ?> map) throws Exception {
            ListLogsResponseBodyLogsResourceDevice self = new ListLogsResponseBodyLogsResourceDevice();
            return TeaModel.build(map, self);
        }

        public ListLogsResponseBodyLogsResourceDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListLogsResponseBodyLogsResourceDevice setPhysicalSpace(String physicalSpace) {
            this.physicalSpace = physicalSpace;
            return this;
        }
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

    }

    public static class ListLogsResponseBodyLogs extends TeaModel {
        @NameInMap("AlarmObject")
        public String alarmObject;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Log")
        public String log;

        @NameInMap("ReceiveTime")
        public String receiveTime;

        @NameInMap("ResourceDevice")
        public ListLogsResponseBodyLogsResourceDevice resourceDevice;

        @NameInMap("Time")
        public String time;

        public static ListLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListLogsResponseBodyLogs self = new ListLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListLogsResponseBodyLogs setAlarmObject(String alarmObject) {
            this.alarmObject = alarmObject;
            return this;
        }
        public String getAlarmObject() {
            return this.alarmObject;
        }

        public ListLogsResponseBodyLogs setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListLogsResponseBodyLogs setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public ListLogsResponseBodyLogs setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListLogsResponseBodyLogs setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public ListLogsResponseBodyLogs setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public ListLogsResponseBodyLogs setResourceDevice(ListLogsResponseBodyLogsResourceDevice resourceDevice) {
            this.resourceDevice = resourceDevice;
            return this;
        }
        public ListLogsResponseBodyLogsResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public ListLogsResponseBodyLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
