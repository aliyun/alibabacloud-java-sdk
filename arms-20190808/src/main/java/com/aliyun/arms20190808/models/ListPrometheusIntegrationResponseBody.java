// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusIntegrationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListPrometheusIntegrationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusIntegrationResponseBody self = new ListPrometheusIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPrometheusIntegrationResponseBody setData(java.util.List<ListPrometheusIntegrationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrometheusIntegrationResponseBodyData> getData() {
        return this.data;
    }

    public ListPrometheusIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusIntegrationResponseBodyData extends TeaModel {
        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CanEditor")
        public Boolean canEditor;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Describe")
        public String describe;

        @NameInMap("ExporterType")
        public String exporterType;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IntegrationType")
        public String integrationType;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        @NameInMap("Param")
        public String param;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("ShowDescribe")
        public Boolean showDescribe;

        @NameInMap("ShowLog")
        public Boolean showLog;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        @NameInMap("Version")
        public String version;

        public static ListPrometheusIntegrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusIntegrationResponseBodyData self = new ListPrometheusIntegrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrometheusIntegrationResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListPrometheusIntegrationResponseBodyData setCanEditor(Boolean canEditor) {
            this.canEditor = canEditor;
            return this;
        }
        public Boolean getCanEditor() {
            return this.canEditor;
        }

        public ListPrometheusIntegrationResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPrometheusIntegrationResponseBodyData setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public ListPrometheusIntegrationResponseBodyData setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public ListPrometheusIntegrationResponseBodyData setExporterType(String exporterType) {
            this.exporterType = exporterType;
            return this;
        }
        public String getExporterType() {
            return this.exporterType;
        }

        public ListPrometheusIntegrationResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListPrometheusIntegrationResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListPrometheusIntegrationResponseBodyData setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListPrometheusIntegrationResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListPrometheusIntegrationResponseBodyData setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public ListPrometheusIntegrationResponseBodyData setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public ListPrometheusIntegrationResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public ListPrometheusIntegrationResponseBodyData setShowDescribe(Boolean showDescribe) {
            this.showDescribe = showDescribe;
            return this;
        }
        public Boolean getShowDescribe() {
            return this.showDescribe;
        }

        public ListPrometheusIntegrationResponseBodyData setShowLog(Boolean showLog) {
            this.showLog = showLog;
            return this;
        }
        public Boolean getShowLog() {
            return this.showLog;
        }

        public ListPrometheusIntegrationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrometheusIntegrationResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListPrometheusIntegrationResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
