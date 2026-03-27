// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleDataSource extends TeaModel {
    /**
     * <p>Applicable data source type: APM_DS.
     * Application type: </p>
     * <ul>
     * <li>apm.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("appType")
    public String appType;

    /**
     * <p>Applicable data source type: SLS_MULTI_DS.
     * List of sub-data sources.</p>
     */
    @NameInMap("dsList")
    public java.util.List<AlertRuleDataSourceDsList> dsList;

    /**
     * <p>Applicable data source type: PROMETHEUS_DS.
     * Prometheus instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-bbe8961b4a59be0</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>Applicable data source type: ENTERPRISE_DS.
     * Name of the enterprise cloud monitoring metric repository.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Applicable data source types: APM_DS, PROMETHEUS_DS.
     * The regionId to which the data source belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Data source type.
     * Valid values:</p>
     * <ul>
     * <li>PROMETHEUS_DS: Prometheus data source.</li>
     * <li>SLS_MULTI_DS: SLS data source.</li>
     * <li>APM_DS: Application monitoring data source.</li>
     * <li>CMS_BASIC_DS: Basic cloud monitoring data source.</li>
     * <li>ENTERPRISE_DS: Enterprise cloud monitoring data source.</li>
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

    public AlertRuleDataSource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AlertRuleDataSourceDsList extends TeaModel {
        /**
         * <p>SLS project</p>
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
         * <p>LogStore/MetricStore name.</p>
         * 
         * <strong>example:</strong>
         * <p>mySlsLogStore</p>
         */
        @NameInMap("store")
        public String store;

        /**
         * <p>Type of SLS data sub-source:</p>
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
