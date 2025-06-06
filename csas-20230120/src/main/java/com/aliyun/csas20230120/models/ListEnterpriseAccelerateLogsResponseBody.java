// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<ListEnterpriseAccelerateLogsResponseBodyLogs> logs;

    /**
     * <strong>example:</strong>
     * <p>43F07A6A-294D-56FB-85EB-6AD00C5B60FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static ListEnterpriseAccelerateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateLogsResponseBody self = new ListEnterpriseAccelerateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateLogsResponseBody setLogs(java.util.List<ListEnterpriseAccelerateLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListEnterpriseAccelerateLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListEnterpriseAccelerateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseAccelerateLogsResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class ListEnterpriseAccelerateLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.bing.com:443">www.bing.com:443</a></p>
         */
        @NameInMap("DstAddr")
        public String dstAddr;

        /**
         * <strong>example:</strong>
         * <p>12299</p>
         */
        @NameInMap("InBytes")
        public String inBytes;

        /**
         * <strong>example:</strong>
         * <p>2603</p>
         */
        @NameInMap("OutBytes")
        public String outBytes;

        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>8.222.179.xxx:10015</p>
         */
        @NameInMap("ProxyAddr")
        public String proxyAddr;

        /**
         * <strong>example:</strong>
         * <p>1748422797</p>
         */
        @NameInMap("UnixTime")
        public String unixTime;

        @NameInMap("Username")
        public String username;

        public static ListEnterpriseAccelerateLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseAccelerateLogsResponseBodyLogs self = new ListEnterpriseAccelerateLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setDstAddr(String dstAddr) {
            this.dstAddr = dstAddr;
            return this;
        }
        public String getDstAddr() {
            return this.dstAddr;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setInBytes(String inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public String getInBytes() {
            return this.inBytes;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setOutBytes(String outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public String getOutBytes() {
            return this.outBytes;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setProxyAddr(String proxyAddr) {
            this.proxyAddr = proxyAddr;
            return this;
        }
        public String getProxyAddr() {
            return this.proxyAddr;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setUnixTime(String unixTime) {
            this.unixTime = unixTime;
            return this;
        }
        public String getUnixTime() {
            return this.unixTime;
        }

        public ListEnterpriseAccelerateLogsResponseBodyLogs setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
