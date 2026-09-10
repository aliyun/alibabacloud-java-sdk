// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleDataSource extends TeaModel {
    /**
     * <p>Applicable data source type: APM_DS.</p>
     * <p>The application type. Valid values:</p>
     * <ul>
     * <li>apm</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("appType")
    public String appType;

    /**
     * <p>Applicable data source type: SLS_MULTI_DS.</p>
     * <p>The list of sub-data sources.</p>
     */
    @NameInMap("dsList")
    public java.util.List<AlertRuleDataSourceDsList> dsList;

    /**
     * <p>Applicable data source type: PROMETHEUS_DS.</p>
     * <p>The Prometheus instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-bbe8961b4a59be0</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>Applicable data source type: ENTERPRISE_DS.</p>
     * <p>The name of the Hybrid Cloud Monitoring metric repository.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Applicable data source types: APM_DS and PROMETHEUS_DS.</p>
     * <p>The region ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Applicable data source type: ENTERPRISE_DS.</p>
     * <p>The tenant ID of the Hybrid Cloud Monitoring data source. Identifies the tenant in the Hybrid Cloud Monitoring environment.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The data source type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PROMETHEUS_DS: Prometheus data source.</li>
     * <li>SLS_MULTI_DS: SLS data source.</li>
     * <li>APM_DS: Application monitoring data source.</li>
     * <li>CMS_BASIC_DS: CloudMonitor Basic data source.</li>
     * <li>ENTERPRISE_DS: Hybrid Cloud Monitoring data source.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS_DS</p>
     */
    @NameInMap("type")
    public String type;

    public static AlertRuleDataSource build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleDataSource self = new AlertRuleDataSource();
        return TeaModel.build(map, self);
    }

    public AlertRuleDataSource setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public AlertRuleDataSource setDsList(java.util.List<AlertRuleDataSourceDsList> dsList) {
        this.dsList = dsList;
        return this;
    }
    public java.util.List<AlertRuleDataSourceDsList> getDsList() {
        return this.dsList;
    }

    public AlertRuleDataSource setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AlertRuleDataSource setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AlertRuleDataSource setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AlertRuleDataSource setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AlertRuleDataSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AlertRuleDataSourceDsList extends TeaModel {
        /**
         * <p>The name of the Simple Log Service (SLS) project. Specifies the project where the logs or metrics reside.</p>
         * 
         * <strong>example:</strong>
         * <p>mySlsProject</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The region where the SLS project resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The name of the LogStore or MetricStore.</p>
         * 
         * <strong>example:</strong>
         * <p>mySlsLogStore</p>
         */
        @NameInMap("store")
        public String store;

        /**
         * <p>The type of the SLS sub-data source. Valid values:</p>
         * <ul>
         * <li>SLS_LOG_DS: LogStore data source.</li>
         * <li>SLS_METRIC_DS: MetricStore data source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLS_LOG_DS</p>
         */
        @NameInMap("type")
        public String type;

        public static AlertRuleDataSourceDsList build(java.util.Map<String, ?> map) throws Exception {
            AlertRuleDataSourceDsList self = new AlertRuleDataSourceDsList();
            return TeaModel.build(map, self);
        }

        public AlertRuleDataSourceDsList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public AlertRuleDataSourceDsList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AlertRuleDataSourceDsList setStore(String store) {
            this.store = store;
            return this;
        }
        public String getStore() {
            return this.store;
        }

        public AlertRuleDataSourceDsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
