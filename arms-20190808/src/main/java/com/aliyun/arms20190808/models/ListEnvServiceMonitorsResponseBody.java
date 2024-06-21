// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvServiceMonitorsResponseBody extends TeaModel {
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
    public java.util.List<ListEnvServiceMonitorsResponseBodyData> data;

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
     * <p>1A474FF8-7861-4D00-81B5-5BC3DA4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvServiceMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvServiceMonitorsResponseBody self = new ListEnvServiceMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvServiceMonitorsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvServiceMonitorsResponseBody setData(java.util.List<ListEnvServiceMonitorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnvServiceMonitorsResponseBodyData> getData() {
        return this.data;
    }

    public ListEnvServiceMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvServiceMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvServiceMonitorsResponseBodyDataEndpoints extends TeaModel {
        /**
         * <p>The collection interval.</p>
         * 
         * <strong>example:</strong>
         * <p>30s</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The number of pods that match the ServiceMonitor endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchedTargetCount")
        public Integer matchedTargetCount;

        /**
         * <p>The collection path.</p>
         * 
         * <strong>example:</strong>
         * <p>/metrics</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The external port.</p>
         * 
         * <strong>example:</strong>
         * <p>9101</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static ListEnvServiceMonitorsResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListEnvServiceMonitorsResponseBodyDataEndpoints self = new ListEnvServiceMonitorsResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public ListEnvServiceMonitorsResponseBodyDataEndpoints setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListEnvServiceMonitorsResponseBodyDataEndpoints setMatchedTargetCount(Integer matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public Integer getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public ListEnvServiceMonitorsResponseBodyDataEndpoints setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListEnvServiceMonitorsResponseBodyDataEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListEnvServiceMonitorsResponseBodyDataEndpoints setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class ListEnvServiceMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the component to which the ServiceMonitor belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("AddonName")
        public String addonName;

        /**
         * <p>The instance name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql1</p>
         */
        @NameInMap("AddonReleaseName")
        public String addonReleaseName;

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        @NameInMap("AddonVersion")
        public String addonVersion;

        /**
         * <p>The YAML configuration string.</p>
         * 
         * <strong>example:</strong>
         * <p>Refer to supplementary instructions.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The time when the ServiceMonitor was created. The value of this parameter is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-10-11T22:32:11Z</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>The endpoints of the ServiceMonitor.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<ListEnvServiceMonitorsResponseBodyDataEndpoints> endpoints;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The number of matched services.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchedServiceCount")
        public Integer matchedServiceCount;

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
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the ServiceMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>sm1</p>
         */
        @NameInMap("ServiceMonitorName")
        public String serviceMonitorName;

        /**
         * <p>The status of the ServiceMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEnvServiceMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvServiceMonitorsResponseBodyData self = new ListEnvServiceMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvServiceMonitorsResponseBodyData setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListEnvServiceMonitorsResponseBodyData setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListEnvServiceMonitorsResponseBodyData setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListEnvServiceMonitorsResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListEnvServiceMonitorsResponseBodyData setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public ListEnvServiceMonitorsResponseBodyData setEndpoints(java.util.List<ListEnvServiceMonitorsResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListEnvServiceMonitorsResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListEnvServiceMonitorsResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListEnvServiceMonitorsResponseBodyData setMatchedServiceCount(Integer matchedServiceCount) {
            this.matchedServiceCount = matchedServiceCount;
            return this;
        }
        public Integer getMatchedServiceCount() {
            return this.matchedServiceCount;
        }

        public ListEnvServiceMonitorsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEnvServiceMonitorsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEnvServiceMonitorsResponseBodyData setServiceMonitorName(String serviceMonitorName) {
            this.serviceMonitorName = serviceMonitorName;
            return this;
        }
        public String getServiceMonitorName() {
            return this.serviceMonitorName;
        }

        public ListEnvServiceMonitorsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
