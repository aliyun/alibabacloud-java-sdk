// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListConnectLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Logs")
    public ListConnectLogsResponseBodyLogs logs;

    public static ListConnectLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectLogsResponseBody self = new ListConnectLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectLogsResponseBody setLogs(ListConnectLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public ListConnectLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public static class ListConnectLogsResponseBodyLogsList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("Terminal")
        public String terminal;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("NetWorking")
        public String netWorking;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Status")
        public String status;

        @NameInMap("Sid")
        public String sid;

        public static ListConnectLogsResponseBodyLogsList build(java.util.Map<String, ?> map) throws Exception {
            ListConnectLogsResponseBodyLogsList self = new ListConnectLogsResponseBodyLogsList();
            return TeaModel.build(map, self);
        }

        public ListConnectLogsResponseBodyLogsList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListConnectLogsResponseBodyLogsList setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public ListConnectLogsResponseBodyLogsList setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

        public ListConnectLogsResponseBodyLogsList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListConnectLogsResponseBodyLogsList setNetWorking(String netWorking) {
            this.netWorking = netWorking;
            return this;
        }
        public String getNetWorking() {
            return this.netWorking;
        }

        public ListConnectLogsResponseBodyLogsList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListConnectLogsResponseBodyLogsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConnectLogsResponseBodyLogsList setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

    public static class ListConnectLogsResponseBodyLogsPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListConnectLogsResponseBodyLogsPagination build(java.util.Map<String, ?> map) throws Exception {
            ListConnectLogsResponseBodyLogsPagination self = new ListConnectLogsResponseBodyLogsPagination();
            return TeaModel.build(map, self);
        }

        public ListConnectLogsResponseBodyLogsPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListConnectLogsResponseBodyLogsPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListConnectLogsResponseBodyLogsPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListConnectLogsResponseBodyLogsPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListConnectLogsResponseBodyLogs extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListConnectLogsResponseBodyLogsList> list;

        @NameInMap("Pagination")
        public ListConnectLogsResponseBodyLogsPagination pagination;

        public static ListConnectLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListConnectLogsResponseBodyLogs self = new ListConnectLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListConnectLogsResponseBodyLogs setList(java.util.List<ListConnectLogsResponseBodyLogsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListConnectLogsResponseBodyLogsList> getList() {
            return this.list;
        }

        public ListConnectLogsResponseBodyLogs setPagination(ListConnectLogsResponseBodyLogsPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListConnectLogsResponseBodyLogsPagination getPagination() {
            return this.pagination;
        }

    }

}
