// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInternetDnsLogsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log query is precise.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Complete")
    public Boolean complete;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurPage")
    public Integer curPage;

    /**
     * <p>The queried logs.</p>
     */
    @NameInMap("Logs")
    public DescribeInternetDnsLogsResponseBodyLogs logs;

    /**
     * <p>Page size for query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <p>Total quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>48</p>
     */
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
        /**
         * <p>Parse log ID (can be duplicated).</p>
         * 
         * <strong>example:</strong>
         * <p>3583</p>
         */
        @NameInMap("DnsMsgId")
        public String dnsMsgId;

        @NameInMap("Flags")
        public String flags;

        /**
         * <p>Parse timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1709196249000</p>
         */
        @NameInMap("LogTime")
        public Long logTime;

        /**
         * <p>The protocol type of the domain name resolution query request:</p>
         * <ul>
         * <li>UDP</li>
         * <li>TCP</li>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * <li>DOH</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("QueryFlags")
        public String queryFlags;

        /**
         * <p>The domain name for which you want to query Domain Name System (DNS) records.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("QueryName")
        public String queryName;

        /**
         * <p>Record type.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("QueryType")
        public String queryType;

        @NameInMap("ResponseTimestamp")
        public String responseTimestamp;

        /**
         * <p>Parse response time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rt")
        public Integer rt;

        /**
         * <p>Parse server IP.</p>
         * 
         * <strong>example:</strong>
         * <p>140.205.XX.XX</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>Source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>59.82.XX.XX</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <p>Response status.</p>
         * 
         * <strong>example:</strong>
         * <p>NOERROR</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The value set for the edns-client-subnet option.</p>
         * 
         * <strong>example:</strong>
         * <p>170.33.XX.XX</p>
         */
        @NameInMap("SubnetIp")
        public String subnetIp;

        /**
         * <p>Array of parsing results.</p>
         */
        @NameInMap("Value")
        public DescribeInternetDnsLogsResponseBodyLogsLogValue value;

        /**
         * <p>The zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

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

        public DescribeInternetDnsLogsResponseBodyLogsLog setFlags(String flags) {
            this.flags = flags;
            return this;
        }
        public String getFlags() {
            return this.flags;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setLogTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }
        public Long getLogTime() {
            return this.logTime;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInternetDnsLogsResponseBodyLogsLog setQueryFlags(String queryFlags) {
            this.queryFlags = queryFlags;
            return this;
        }
        public String getQueryFlags() {
            return this.queryFlags;
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

        public DescribeInternetDnsLogsResponseBodyLogsLog setResponseTimestamp(String responseTimestamp) {
            this.responseTimestamp = responseTimestamp;
            return this;
        }
        public String getResponseTimestamp() {
            return this.responseTimestamp;
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

        public DescribeInternetDnsLogsResponseBodyLogsLog setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
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
