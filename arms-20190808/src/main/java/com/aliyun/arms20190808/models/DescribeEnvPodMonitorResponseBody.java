// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvPodMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
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
    public DescribeEnvPodMonitorResponseBodyData data;

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
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnvPodMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvPodMonitorResponseBody self = new DescribeEnvPodMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvPodMonitorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvPodMonitorResponseBody setData(DescribeEnvPodMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvPodMonitorResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvPodMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvPodMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnvPodMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The YAML configuration string of the PodMonitor.</p>
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
         * <p>The name of the PodMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>podMonitor1</p>
         */
        @NameInMap("PodMonitorName")
        public String podMonitorName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the PodMonitor. Valid values: run and stop.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEnvPodMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvPodMonitorResponseBodyData self = new DescribeEnvPodMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvPodMonitorResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public DescribeEnvPodMonitorResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeEnvPodMonitorResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeEnvPodMonitorResponseBodyData setPodMonitorName(String podMonitorName) {
            this.podMonitorName = podMonitorName;
            return this;
        }
        public String getPodMonitorName() {
            return this.podMonitorName;
        }

        public DescribeEnvPodMonitorResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEnvPodMonitorResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
