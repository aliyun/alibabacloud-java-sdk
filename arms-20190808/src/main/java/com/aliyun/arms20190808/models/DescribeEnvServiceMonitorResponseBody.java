// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvServiceMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
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
    public DescribeEnvServiceMonitorResponseBodyData data;

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
     * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnvServiceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvServiceMonitorResponseBody self = new DescribeEnvServiceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvServiceMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvServiceMonitorResponseBody setData(DescribeEnvServiceMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvServiceMonitorResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvServiceMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvServiceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnvServiceMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The YAML configuration string of the ServiceMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>Refer to supplementary instructions.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the ServiceMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceMonitor1</p>
         */
        @NameInMap("ServiceMonitorName")
        public String serviceMonitorName;

        /**
         * <p>The status of the ServiceMonitor. Valid values: run and stop.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEnvServiceMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvServiceMonitorResponseBodyData self = new DescribeEnvServiceMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvServiceMonitorResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public DescribeEnvServiceMonitorResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeEnvServiceMonitorResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeEnvServiceMonitorResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEnvServiceMonitorResponseBodyData setServiceMonitorName(String serviceMonitorName) {
            this.serviceMonitorName = serviceMonitorName;
            return this;
        }
        public String getServiceMonitorName() {
            return this.serviceMonitorName;
        }

        public DescribeEnvServiceMonitorResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
