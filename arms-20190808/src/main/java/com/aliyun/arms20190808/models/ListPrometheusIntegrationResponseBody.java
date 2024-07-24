// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusIntegrationResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried exporters.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusIntegrationResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1F1D8840-5330-5804-A8DB-C3C5C5CED6BB</p>
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
        /**
         * <p>Indicates whether the exporter can be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanDelete")
        public Boolean canDelete;

        /**
         * <p>Indicates whether the exporter can be edited.</p>
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
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>container-1</p>
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
         * <p>kafka-exporter</p>
         */
        @NameInMap("ExporterType")
        public String exporterType;

        /**
         * <p>The ID of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>29374</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>inet</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The integration type. Valid values: kafka, mysql, redis, snmp, emr, nubela, and tidb.</p>
         * 
         * <strong>example:</strong>
         * <p>Kafka, mysql, redis, snmp, emr, nubela, and tidb</p>
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
         * <p>true</p>
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
         * <p>The pod name of the exporter.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-exporter-1</p>
         */
        @NameInMap("PodName")
        public String podName;

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
        public Boolean showLog;

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
         * <p>121.40.62.240:3342</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
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
