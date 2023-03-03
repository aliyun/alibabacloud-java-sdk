// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusIntegrationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetPrometheusIntegrationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrometheusIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusIntegrationResponseBody self = new GetPrometheusIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPrometheusIntegrationResponseBody setData(GetPrometheusIntegrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrometheusIntegrationResponseBodyData getData() {
        return this.data;
    }

    public GetPrometheusIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrometheusIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrometheusIntegrationResponseBodyData extends TeaModel {
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

        @NameInMap("ShowDescribe")
        public Boolean showDescribe;

        @NameInMap("ShowLog")
        public String showLog;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        @NameInMap("Version")
        public String version;

        public static GetPrometheusIntegrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusIntegrationResponseBodyData self = new GetPrometheusIntegrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusIntegrationResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public GetPrometheusIntegrationResponseBodyData setCanEditor(Boolean canEditor) {
            this.canEditor = canEditor;
            return this;
        }
        public Boolean getCanEditor() {
            return this.canEditor;
        }

        public GetPrometheusIntegrationResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetPrometheusIntegrationResponseBodyData setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public GetPrometheusIntegrationResponseBodyData setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public GetPrometheusIntegrationResponseBodyData setExporterType(String exporterType) {
            this.exporterType = exporterType;
            return this;
        }
        public String getExporterType() {
            return this.exporterType;
        }

        public GetPrometheusIntegrationResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetPrometheusIntegrationResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetPrometheusIntegrationResponseBodyData setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public GetPrometheusIntegrationResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetPrometheusIntegrationResponseBodyData setNeedUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }
        public Boolean getNeedUpgrade() {
            return this.needUpgrade;
        }

        public GetPrometheusIntegrationResponseBodyData setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public GetPrometheusIntegrationResponseBodyData setShowDescribe(Boolean showDescribe) {
            this.showDescribe = showDescribe;
            return this;
        }
        public Boolean getShowDescribe() {
            return this.showDescribe;
        }

        public GetPrometheusIntegrationResponseBodyData setShowLog(String showLog) {
            this.showLog = showLog;
            return this;
        }
        public String getShowLog() {
            return this.showLog;
        }

        public GetPrometheusIntegrationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrometheusIntegrationResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetPrometheusIntegrationResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
