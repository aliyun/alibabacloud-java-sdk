// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusIntegrationResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public GetPrometheusIntegrationResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9BEF2832-9D95-5E3E-9B10-74887CA17B94</p>
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
        /**
         * <p>Indicates whether the exporter can be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanDelete")
        public Boolean canDelete;

        /**
         * <p>Indicates whether the exporter can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanEditor")
        public Boolean canEditor;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-exporter-1</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The description of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{}&quot;</p>
         */
        @NameInMap("Describe")
        public String describe;

        /**
         * <p>The type of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>tidb-exporter</p>
         */
        @NameInMap("ExporterType")
        public String exporterType;

        /**
         * <p>The exporter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2893</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>lpd-skyeye</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the integration.</p>
         * 
         * <strong>example:</strong>
         * <p>tidb</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether an upgrade is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("NeedUpgrade")
        public Boolean needUpgrade;

        /**
         * <p>The configurations of the exporter. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;port&quot;: &quot;5554&quot;,
         *       &quot;name&quot;: &quot;kafka-test12&quot;,
         *       &quot;kafka_instance&quot;: &quot;kafka-test&quot;,
         *       &quot;__label_value&quot;: &quot;kafka-test&quot;,
         *       &quot;scrape_interval&quot;: 33,
         *       &quot;metrics_path&quot;: &quot;/metrics&quot;,
         *       &quot;__label_key&quot;: &quot;kafka-test&quot;
         * }</p>
         */
        @NameInMap("Param")
        public String param;

        /**
         * <p>Indicates whether the description is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowDescribe")
        public Boolean showDescribe;

        /**
         * <p>Indicates whether the exporter logs are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ShowLog")
        public String showLog;

        /**
         * <p>The status of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>installed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The monitored IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1:3422</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
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
