// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyServiceMonitorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ea119prod-ea119blinkcptssd1</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>policy-ac38a7cb02d14ff48bc9f97d0a75063e</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceMonitors")
    public java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors> serviceMonitors;

    public static ListIntegrationPolicyServiceMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyServiceMonitorsResponseBody self = new ListIntegrationPolicyServiceMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyServiceMonitorsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListIntegrationPolicyServiceMonitorsResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListIntegrationPolicyServiceMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationPolicyServiceMonitorsResponseBody setServiceMonitors(java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors> serviceMonitors) {
        this.serviceMonitors = serviceMonitors;
        return this;
    }
    public java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors> getServiceMonitors() {
        return this.serviceMonitors;
    }

    public static class ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30s</p>
         */
        @NameInMap("interval")
        public String interval;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("matchedTargetCount")
        public Long matchedTargetCount;

        /**
         * <strong>example:</strong>
         * <p>/metrics</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>9100</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("targetPort")
        public String targetPort;

        public static ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints self = new ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints setMatchedTargetCount(Long matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public Long getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud-acs-ecs</p>
         */
        @NameInMap("addonName")
        public String addonName;

        /**
         * <strong>example:</strong>
         * <p>release-1234567</p>
         */
        @NameInMap("addonReleaseName")
        public String addonReleaseName;

        /**
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("addonVersion")
        public String addonVersion;

        /**
         * <strong>example:</strong>
         * <p>apiVersion: xxxxx</p>
         */
        @NameInMap("configYaml")
        public String configYaml;

        /**
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("enableStatus")
        public String enableStatus;

        /**
         * <strong>example:</strong>
         * <p>YXBpVmVyc2lvbjogeHh4eHgK</p>
         */
        @NameInMap("encryptYaml")
        public Boolean encryptYaml;

        @NameInMap("endpoints")
        public java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints> endpoints;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("matchedServiceCount")
        public Long matchedServiceCount;

        /**
         * <strong>example:</strong>
         * <p>62a526c5-f6ca-4cfb-b5a4-b76974cffe51</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("namespace")
        public String namespace;

        public static ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors self = new ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setEncryptYaml(Boolean encryptYaml) {
            this.encryptYaml = encryptYaml;
            return this;
        }
        public Boolean getEncryptYaml() {
            return this.encryptYaml;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setEndpoints(java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitorsEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setMatchedServiceCount(Long matchedServiceCount) {
            this.matchedServiceCount = matchedServiceCount;
            return this;
        }
        public Long getMatchedServiceCount() {
            return this.matchedServiceCount;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyServiceMonitorsResponseBodyServiceMonitors setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
