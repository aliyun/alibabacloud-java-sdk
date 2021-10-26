// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsResponseBody extends TeaModel {
    @NameInMap("MetricLogs")
    public GetCloudMetricLogsResponseBodyMetricLogs metricLogs;

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
        @NameInMap("DiskDevice")
        public String diskDevice;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MetricData")
        public String metricData;

        @NameInMap("NetworkInterface")
        public String networkInterface;

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
