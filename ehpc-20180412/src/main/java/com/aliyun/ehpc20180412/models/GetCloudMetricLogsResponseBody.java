// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsResponseBody extends TeaModel {
    /**
     * <p>The queried performance metric data.</p>
     */
    @NameInMap("MetricLogs")
    public GetCloudMetricLogsResponseBodyMetricLogs metricLogs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>015C2C4D-1884-4EB7-BCD3-C5BB8D7E56DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudMetricLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricLogsResponseBody self = new GetCloudMetricLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricLogsResponseBody setMetricLogs(GetCloudMetricLogsResponseBodyMetricLogs metricLogs) {
        this.metricLogs = metricLogs;
        return this;
    }
    public GetCloudMetricLogsResponseBodyMetricLogs getMetricLogs() {
        return this.metricLogs;
    }

    public GetCloudMetricLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudMetricLogsResponseBodyMetricLogsMetricLog extends TeaModel {
        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>vda1</p>
         */
        @NameInMap("DiskDevice")
        public String diskDevice;

        /**
         * <p>The hostname of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>compute000</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp132g97g7zwnvta****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>A JSON-formatted serialized string that contains performance metric data of multiple categories.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;process|cpusage\&quot;:0,\&quot;process|cpuser\&quot;:0,\&quot;process|cpusys\&quot;:0,******}</p>
         */
        @NameInMap("MetricData")
        public String metricData;

        /**
         * <p>The name of the network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>eth1</p>
         */
        @NameInMap("NetworkInterface")
        public String networkInterface;

        /**
         * <p>The timestamp of the log. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1583907780</p>
         */
        @NameInMap("Time")
        public Integer time;

        public static GetCloudMetricLogsResponseBodyMetricLogsMetricLog build(java.util.Map<String, ?> map) throws Exception {
            GetCloudMetricLogsResponseBodyMetricLogsMetricLog self = new GetCloudMetricLogsResponseBodyMetricLogsMetricLog();
            return TeaModel.build(map, self);
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setDiskDevice(String diskDevice) {
            this.diskDevice = diskDevice;
            return this;
        }
        public String getDiskDevice() {
            return this.diskDevice;
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setMetricData(String metricData) {
            this.metricData = metricData;
            return this;
        }
        public String getMetricData() {
            return this.metricData;
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setNetworkInterface(String networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public String getNetworkInterface() {
            return this.networkInterface;
        }

        public GetCloudMetricLogsResponseBodyMetricLogsMetricLog setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

    public static class GetCloudMetricLogsResponseBodyMetricLogs extends TeaModel {
        @NameInMap("MetricLog")
        public java.util.List<GetCloudMetricLogsResponseBodyMetricLogsMetricLog> metricLog;

        public static GetCloudMetricLogsResponseBodyMetricLogs build(java.util.Map<String, ?> map) throws Exception {
            GetCloudMetricLogsResponseBodyMetricLogs self = new GetCloudMetricLogsResponseBodyMetricLogs();
            return TeaModel.build(map, self);
        }

        public GetCloudMetricLogsResponseBodyMetricLogs setMetricLog(java.util.List<GetCloudMetricLogsResponseBodyMetricLogsMetricLog> metricLog) {
            this.metricLog = metricLog;
            return this;
        }
        public java.util.List<GetCloudMetricLogsResponseBodyMetricLogsMetricLog> getMetricLog() {
            return this.metricLog;
        }

    }

}
