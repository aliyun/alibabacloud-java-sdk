// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLogsResponseBody extends TeaModel {
    // 日志列表
    @NameInMap("Logs")
    public java.util.List<ListLogsResponseBodyLogs> logs;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
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
        // 日志内容
        @NameInMap("Log")
        public String log;

        @NameInMap("ResourceDevice")
        public ListLogsResponseBodyLogsResourceDevice resourceDevice;

        // 日志时间戳
        @NameInMap("Time")
        public String time;

        public static ListLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListLogsResponseBodyLogs self = new ListLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListLogsResponseBodyLogs setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
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
