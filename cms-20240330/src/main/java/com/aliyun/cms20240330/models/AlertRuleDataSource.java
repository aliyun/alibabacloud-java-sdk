// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleDataSource extends TeaModel {
    /**
     * <p>Applies to the APM_DS data source type.</p>
     * <p>The type of the application. Valid value:</p>
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
     * <p>Applies to the SLS_MULTI_DS data source type.</p>
     * <p>A list of sub-data sources.</p>
     */
    @NameInMap("dsList")
    public java.util.List<AlertRuleDataSourceDsList> dsList;

    /**
     * <p>Applies to the PROMETHEUS_DS data source type.</p>
     * <p>The ID of the Prometheus instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-bbe8961b4a59be0</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>Applies to the ENTERPRISE_DS data source type.</p>
     * <p>The name of the Hybrid Cloud Monitoring metric repository.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Applies to the APM_DS and PROMETHEUS_DS data source types.</p>
     * <p>The ID of the region where the data source is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The data source type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PROMETHEUS_DS: A Prometheus data source.</p>
     * </li>
     * <li><p>SLS_MULTI_DS: An SLS data source.</p>
     * </li>
     * <li><p>APM_DS: An Application Monitoring data source.</p>
     * </li>
     * <li><p>CMS_BASIC_DS: A basic Cloud Monitor data source.</p>
     * </li>
     * <li><p>ENTERPRISE_DS: A Hybrid Cloud Monitoring data source.</p>
     * </li>
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
         * <p>The SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>mySlsProject</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The region where the SLS project is located.</p>
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
         * <li><p>SLS_LOG_DS: A LogStore data source.</p>
         * </li>
         * <li><p>SLS_METRIC_DS: A MetricStore data source.</p>
         * </li>
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
