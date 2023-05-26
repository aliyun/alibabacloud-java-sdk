// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusMonitoringResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusMonitoringResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusMonitoringResponseBody self = new ListPrometheusMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusMonitoringResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPrometheusMonitoringResponseBody setData(java.util.List<ListPrometheusMonitoringResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrometheusMonitoringResponseBodyData> getData() {
        return this.data;
    }

    public ListPrometheusMonitoringResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusMonitoringResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The Yaml string of monitoring.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The Monitoring Name.</p>
         */
        @NameInMap("MonitoringName")
        public String monitoringName;

        /**
         * <p>The status of the monitoring.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance support for container service types includes: serviceMonitor, podMonitor, customJob, and probe.</p>
         * <p>ECS type instances support: customJob, probe.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPrometheusMonitoringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusMonitoringResponseBodyData self = new ListPrometheusMonitoringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrometheusMonitoringResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPrometheusMonitoringResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListPrometheusMonitoringResponseBodyData setMonitoringName(String monitoringName) {
            this.monitoringName = monitoringName;
            return this;
        }
        public String getMonitoringName() {
            return this.monitoringName;
        }

        public ListPrometheusMonitoringResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrometheusMonitoringResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
