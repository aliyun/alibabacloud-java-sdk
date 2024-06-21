// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusMonitoringResponseBody extends TeaModel {
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
    public GetPrometheusMonitoringResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrometheusMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusMonitoringResponseBody self = new GetPrometheusMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusMonitoringResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPrometheusMonitoringResponseBody setData(GetPrometheusMonitoringResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrometheusMonitoringResponseBodyData getData() {
        return this.data;
    }

    public GetPrometheusMonitoringResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrometheusMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrometheusMonitoringResponseBodyData extends TeaModel {
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
         * <p>customJob1</p>
         */
        @NameInMap("MonitoringName")
        public String monitoringName;

        /**
         * <p>The status of the monitoring configuration. Valid values: run and stop.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the monitoring configuration. Valid values: serviceMonitor, podMonitor, customJob, and probe.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceMonitor</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPrometheusMonitoringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusMonitoringResponseBodyData self = new GetPrometheusMonitoringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusMonitoringResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetPrometheusMonitoringResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public GetPrometheusMonitoringResponseBodyData setMonitoringName(String monitoringName) {
            this.monitoringName = monitoringName;
            return this;
        }
        public String getMonitoringName() {
            return this.monitoringName;
        }

        public GetPrometheusMonitoringResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrometheusMonitoringResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
