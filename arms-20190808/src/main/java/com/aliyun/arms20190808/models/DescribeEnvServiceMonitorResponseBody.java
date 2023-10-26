// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvServiceMonitorResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
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
         * <p>ServiceMonitor\"s yaml configuration string.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>Environment instance ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>ServiceMonitor name.</p>
         */
        @NameInMap("ServiceMonitorName")
        public String serviceMonitorName;

        /**
         * <p>Status: run, stop.</p>
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
