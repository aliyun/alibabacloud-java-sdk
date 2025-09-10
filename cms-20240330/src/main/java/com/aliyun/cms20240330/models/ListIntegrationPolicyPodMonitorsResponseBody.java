// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyPodMonitorsResponseBody extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("podMonitors")
    public java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors> podMonitors;

    /**
     * <strong>example:</strong>
     * <p>policy-c9efed2b99c348d49e589c5f780fc074</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListIntegrationPolicyPodMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyPodMonitorsResponseBody self = new ListIntegrationPolicyPodMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyPodMonitorsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListIntegrationPolicyPodMonitorsResponseBody setPodMonitors(java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors> podMonitors) {
        this.podMonitors = podMonitors;
        return this;
    }
    public java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors> getPodMonitors() {
        return this.podMonitors;
    }

    public ListIntegrationPolicyPodMonitorsResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListIntegrationPolicyPodMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30s</p>
         */
        @NameInMap("interval")
        public String interval;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>https</p>
         */
        @NameInMap("targetPort")
        public String targetPort;

        public static ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints self = new ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints setMatchedTargetCount(Long matchedTargetCount) {
            this.matchedTargetCount = matchedTargetCount;
            return this;
        }
        public Long getMatchedTargetCount() {
            return this.matchedTargetCount;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud-ecs</p>
         */
        @NameInMap("addonName")
        public String addonName;

        /**
         * <strong>example:</strong>
         * <p>release-2345678</p>
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
        public java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints> endpoints;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("matchedPodCount")
        public Long matchedPodCount;

        /**
         * <strong>example:</strong>
         * <p>znzmo_entity_test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>sla-ns-d5aeb2b4f91b47</p>
         */
        @NameInMap("namespace")
        public String namespace;

        public static ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors self = new ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setEncryptYaml(Boolean encryptYaml) {
            this.encryptYaml = encryptYaml;
            return this;
        }
        public Boolean getEncryptYaml() {
            return this.encryptYaml;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setEndpoints(java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListIntegrationPolicyPodMonitorsResponseBodyPodMonitorsEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setMatchedPodCount(Long matchedPodCount) {
            this.matchedPodCount = matchedPodCount;
            return this;
        }
        public Long getMatchedPodCount() {
            return this.matchedPodCount;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyPodMonitorsResponseBodyPodMonitors setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
