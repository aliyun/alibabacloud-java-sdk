// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInternetDnsLogsResponseBody extends TeaModel {
    @NameInMap("Complete")
    public Boolean complete;

    @NameInMap("CurPage")
    public Integer curPage;

    @NameInMap("Logs")
    public DescribeInternetDnsLogsResponseBodyLogs logs;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribeInternetDnsLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetDnsLogsResponseBody self = new DescribeInternetDnsLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetDnsLogsResponseBody setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public DescribeInternetDnsLogsResponseBody setCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }
    public Integer getCurPage() {
        return this.curPage;
    }

    public DescribeInternetDnsLogsResponseBody setLogs(DescribeInternetDnsLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public DescribeInternetDnsLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public DescribeInternetDnsLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetDnsLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInternetDnsLogsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeInternetDnsLogsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeInternetDnsLogsResponseBodyLogsLogValue extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeInternetDnsLogsResponseBodyLogsLogValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetDnsLogsResponseBodyLogsLogValue self = new DescribeInternetDnsLogsResponseBodyLogsLogValue();
            return TeaModel.build(map, self);
        }

        public DescribeInternetDnsLogsResponseBodyLogsLogValue setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeInternetDnsLogsResponseBodyLogsLog extends TeaModel {
        @NameInMap("DnsMsgId")
        public String dnsMsgId;

        @NameInMap("LogTime")
        public Long logTime;

        @NameInMap("QueryName")
        public String queryName;

        @NameInMap("QueryType")
        public String queryType;

        @NameInMap("Rt")
        public Integer rt;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetIp")
        public String subnetIp;

        @NameInMap("Value")
        public DescribeInternetDnsLogsResponseBodyLogsLogValue value;

        public static DescribeInternetDnsLogsResponseBodyLogsLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetDnsLogsResponseBodyLogsLog self = new DescribeInternetDnsLogsResponseBodyLogsLog();
            return TeaModel.build(map, self);
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setDnsMsgId(String dnsMsgId) {
            this.dnsMsgId = dnsMsgId;
            return this;
        }
        public String getDnsMsgId() {
            return this.dnsMsgId;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setLogTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }
        public Long getLogTime() {
            return this.logTime;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setQueryName(String queryName) {
            this.queryName = queryName;
            return this;
        }
        public String getQueryName() {
            return this.queryName;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setQueryType(String queryType) {
            this.queryType = queryType;
            return this;
        }
        public String getQueryType() {
            return this.queryType;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setRt(Integer rt) {
            this.rt = rt;
            return this;
        }
        public Integer getRt() {
            return this.rt;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setSubnetIp(String subnetIp) {
            this.subnetIp = subnetIp;
            return this;
        }
        public String getSubnetIp() {
            return this.subnetIp;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setValue(DescribeInternetDnsLogsResponseBodyLogsLogValue value) {
            this.value = value;
            return this;
        }
        public DescribeInternetDnsLogsResponseBodyLogsLogValue getValue() {
            return this.value;
        }

    }

    public static class DescribeInternetDnsLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Log")
        public java.util.List<DescribeInternetDnsLogsResponseBodyLogsLog> log;

        public static DescribeInternetDnsLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetDnsLogsResponseBodyLogs self = new DescribeInternetDnsLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeInternetDnsLogsResponseBodyLogs setLog(java.util.List<DescribeInternetDnsLogsResponseBodyLogsLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<DescribeInternetDnsLogsResponseBodyLogsLog> getLog() {
            return this.log;
        }

    }

}
