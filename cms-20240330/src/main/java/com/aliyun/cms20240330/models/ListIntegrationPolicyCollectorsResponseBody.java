// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCollectorsResponseBody extends TeaModel {
    @NameInMap("collectors")
    public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectors> collectors;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListIntegrationPolicyCollectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCollectorsResponseBody self = new ListIntegrationPolicyCollectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCollectorsResponseBody setCollectors(java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectors> collectors) {
        this.collectors = collectors;
        return this;
    }
    public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectors> getCollectors() {
        return this.collectors;
    }

    public ListIntegrationPolicyCollectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-08-27T13:59:23+08:00</p>
         */
        @NameInMap("firstTransitionTime")
        public String firstTransitionTime;

        /**
         * <strong>example:</strong>
         * <p>2024-08-27T13:59:23+08:00</p>
         */
        @NameInMap("lastTransitionTime")
        public String lastTransitionTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Probe</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("type")
        public String type;

        public static ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions self = new ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sg-xxxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vsw-xxxxxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo self = new ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        @NameInMap("hostIp")
        public String hostIp;

        /**
         * <strong>example:</strong>
         * <p>11.193.82.198</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("managed")
        public Boolean managed;

        @NameInMap("managedInfo")
        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo managedInfo;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>exporter-xxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>prod-db</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("ownerReferenceKind")
        public String ownerReferenceKind;

        /**
         * <strong>example:</strong>
         * <p>exporter</p>
         */
        @NameInMap("ownerReferenceName")
        public String ownerReferenceName;

        /**
         * <strong>example:</strong>
         * <p>2024-08-27T13:59:23+08:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>v2.4.4</p>
         */
        @NameInMap("version")
        public String version;

        public static ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads self = new ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setManagedInfo(ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo managedInfo) {
            this.managedInfo = managedInfo;
            return this;
        }
        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloadsManagedInfo getManagedInfo() {
            return this.managedInfo;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setOwnerReferenceKind(String ownerReferenceKind) {
            this.ownerReferenceKind = ownerReferenceKind;
            return this;
        }
        public String getOwnerReferenceKind() {
            return this.ownerReferenceKind;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setOwnerReferenceName(String ownerReferenceName) {
            this.ownerReferenceName = ownerReferenceName;
            return this;
        }
        public String getOwnerReferenceName() {
            return this.ownerReferenceName;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListIntegrationPolicyCollectorsResponseBodyCollectors extends TeaModel {
        @NameInMap("addonMeta")
        public AddonMeta addonMeta;

        /**
         * <strong>example:</strong>
         * <p>collector-kkxx</p>
         */
        @NameInMap("collectorName")
        public String collectorName;

        /**
         * <strong>example:</strong>
         * <p>Exporter</p>
         */
        @NameInMap("collectorType")
        public String collectorType;

        @NameInMap("conditions")
        public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("managed")
        public Boolean managed;

        @NameInMap("releaseName")
        public String releaseName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>2.6.2</p>
         */
        @NameInMap("version")
        public String version;

        @NameInMap("workloads")
        public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads> workloads;

        public static ListIntegrationPolicyCollectorsResponseBodyCollectors build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCollectorsResponseBodyCollectors self = new ListIntegrationPolicyCollectorsResponseBodyCollectors();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setAddonMeta(AddonMeta addonMeta) {
            this.addonMeta = addonMeta;
            return this;
        }
        public AddonMeta getAddonMeta() {
            return this.addonMeta;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setCollectorName(String collectorName) {
            this.collectorName = collectorName;
            return this;
        }
        public String getCollectorName() {
            return this.collectorName;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setCollectorType(String collectorType) {
            this.collectorType = collectorType;
            return this;
        }
        public String getCollectorType() {
            return this.collectorType;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setConditions(java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsConditions> getConditions() {
            return this.conditions;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListIntegrationPolicyCollectorsResponseBodyCollectors setWorkloads(java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads> workloads) {
            this.workloads = workloads;
            return this;
        }
        public java.util.List<ListIntegrationPolicyCollectorsResponseBodyCollectorsWorkloads> getWorkloads() {
            return this.workloads;
        }

    }

}
