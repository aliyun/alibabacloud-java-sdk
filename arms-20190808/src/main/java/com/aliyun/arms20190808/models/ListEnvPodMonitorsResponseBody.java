// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvPodMonitorsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEnvPodMonitorsResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvPodMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvPodMonitorsResponseBody self = new ListEnvPodMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvPodMonitorsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvPodMonitorsResponseBody setData(java.util.List<ListEnvPodMonitorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnvPodMonitorsResponseBodyData> getData() {
        return this.data;
    }

    public ListEnvPodMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvPodMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvPodMonitorsResponseBodyDataEndpoints extends TeaModel {
        /**
         * <p>The collection interval.</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The number of pods that match the PodMonitor endpoint.</p>
         */
        @NameInMap("MatchedTargetCount")
        public Integer matchedTargetCount;

        /**
         * <p>The collection path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The external port.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The destination port.</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static ListEnvPodMonitorsResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListEnvPodMonitorsResponseBodyDataEndpoints self = new ListEnvPodMonitorsResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public ListEnvPodMonitorsResponseBodyDataEndpoints setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListEnvPodMonitorsResponseBodyDataEndpoints setMatchedTargetCount(Integer matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public Integer getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public ListEnvPodMonitorsResponseBodyDataEndpoints setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListEnvPodMonitorsResponseBodyDataEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListEnvPodMonitorsResponseBodyDataEndpoints setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class ListEnvPodMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the component to which the PodMonitor belongs.</p>
         */
        @NameInMap("AddonName")
        public String addonName;

        /**
         * <p>The instance name of the component.</p>
         */
        @NameInMap("AddonReleaseName")
        public String addonReleaseName;

        /**
         * <p>The version of the component.</p>
         */
        @NameInMap("AddonVersion")
        public String addonVersion;

        /**
         * <p>The YAML configuration string.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The time when the PodMonitor was created. The value of this parameter is a timestamp.</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>The endpoints of the PodMonitor.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<ListEnvPodMonitorsResponseBodyDataEndpoints> endpoints;

        /**
         * <p>The environment ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the PodMonitor.</p>
         */
        @NameInMap("PodMonitorName")
        public String podMonitorName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the PodMonitor.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEnvPodMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvPodMonitorsResponseBodyData self = new ListEnvPodMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvPodMonitorsResponseBodyData setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListEnvPodMonitorsResponseBodyData setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListEnvPodMonitorsResponseBodyData setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListEnvPodMonitorsResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListEnvPodMonitorsResponseBodyData setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public ListEnvPodMonitorsResponseBodyData setEndpoints(java.util.List<ListEnvPodMonitorsResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListEnvPodMonitorsResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListEnvPodMonitorsResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListEnvPodMonitorsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListEnvPodMonitorsResponseBodyData setPodMonitorName(String podMonitorName) {
            this.podMonitorName = podMonitorName;
            return this;
        }
        public String getPodMonitorName() {
            return this.podMonitorName;
        }

        public ListEnvPodMonitorsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEnvPodMonitorsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
