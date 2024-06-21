// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusMonitoringResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusMonitoringResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D80ADAAC-8C32-5479-BD14-C28CF832****</p>
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
         * <p>Prometheus Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The monitoring configuration. The value is a YAML string.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The name of the monitoring configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>podMonitor1</p>
         */
        @NameInMap("MonitoringName")
        public String monitoringName;

        /**
         * <p>The status of the monitoring configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the monitoring configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>podMonitor</p>
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
