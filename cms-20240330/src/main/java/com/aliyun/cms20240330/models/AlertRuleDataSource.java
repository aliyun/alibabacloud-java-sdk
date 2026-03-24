// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleDataSource extends TeaModel {
    @NameInMap("appType")
    public String appType;

    @NameInMap("dsList")
    public java.util.List<AlertRuleDataSourceDsList> dsList;

    /**
     * <p>实例id，当type=PROMETHEUS_DS/ENTERPRISE_DS时必填，为prometheus实例的clusterId或指标仓库名称</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>数据源类型</p>
     * <p>This parameter is required.</p>
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
        @NameInMap("project")
        public String project;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("store")
        public String store;

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
