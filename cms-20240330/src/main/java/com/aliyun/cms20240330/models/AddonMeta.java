// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddonMeta extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("categories")
    public java.util.List<String> categories;

    @NameInMap("dashboards")
    public java.util.List<AddonMetaDashboards> dashboards;

    @NameInMap("description")
    public String description;

    @NameInMap("environments")
    public java.util.List<AddonMetaEnvironments> environments;

    @NameInMap("icon")
    public String icon;

    @NameInMap("keywords")
    public java.util.List<String> keywords;

    @NameInMap("language")
    public String language;

    @NameInMap("latestReleaseCreateTime")
    public String latestReleaseCreateTime;

    @NameInMap("name")
    public String name;

    @NameInMap("once")
    public Boolean once;

    @NameInMap("scene")
    public String scene;

    @NameInMap("version")
    public String version;

    @NameInMap("weight")
    public Integer weight;

    public static AddonMeta build(java.util.Map<String, ?> map) throws Exception {
        AddonMeta self = new AddonMeta();
        return TeaModel.build(map, self);
    }

    public AddonMeta setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddonMeta setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public AddonMeta setDashboards(java.util.List<AddonMetaDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<AddonMetaDashboards> getDashboards() {
        return this.dashboards;
    }

    public AddonMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddonMeta setEnvironments(java.util.List<AddonMetaEnvironments> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<AddonMetaEnvironments> getEnvironments() {
        return this.environments;
    }

    public AddonMeta setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public AddonMeta setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public AddonMeta setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AddonMeta setLatestReleaseCreateTime(String latestReleaseCreateTime) {
        this.latestReleaseCreateTime = latestReleaseCreateTime;
        return this;
    }
    public String getLatestReleaseCreateTime() {
        return this.latestReleaseCreateTime;
    }

    public AddonMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddonMeta setOnce(Boolean once) {
        this.once = once;
        return this;
    }
    public Boolean getOnce() {
        return this.once;
    }

    public AddonMeta setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddonMeta setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AddonMeta setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public static class AddonMetaDashboards extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("url")
        public String url;

        public static AddonMetaDashboards build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaDashboards self = new AddonMetaDashboards();
            return TeaModel.build(map, self);
        }

        public AddonMetaDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddonMetaDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddonMetaDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class AddonMetaEnvironmentsDependencies extends TeaModel {
        @NameInMap("clusterTypes")
        public java.util.List<String> clusterTypes;

        @NameInMap("features")
        public java.util.Map<String, Boolean> features;

        @NameInMap("services")
        public java.util.List<String> services;

        public static AddonMetaEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsDependencies self = new AddonMetaEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public AddonMetaEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public AddonMetaEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class AddonMetaEnvironmentsPoliciesBindEntity extends TeaModel {
        @NameInMap("entityGroupMode")
        public Boolean entityGroupMode;

        @NameInMap("entityType")
        public String entityType;

        @NameInMap("singleEntityMode")
        public Boolean singleEntityMode;

        @NameInMap("vpcIdFieldKey")
        public String vpcIdFieldKey;

        public static AddonMetaEnvironmentsPoliciesBindEntity build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsPoliciesBindEntity self = new AddonMetaEnvironmentsPoliciesBindEntity();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsPoliciesBindEntity setEntityGroupMode(Boolean entityGroupMode) {
            this.entityGroupMode = entityGroupMode;
            return this;
        }
        public Boolean getEntityGroupMode() {
            return this.entityGroupMode;
        }

        public AddonMetaEnvironmentsPoliciesBindEntity setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public AddonMetaEnvironmentsPoliciesBindEntity setSingleEntityMode(Boolean singleEntityMode) {
            this.singleEntityMode = singleEntityMode;
            return this;
        }
        public Boolean getSingleEntityMode() {
            return this.singleEntityMode;
        }

        public AddonMetaEnvironmentsPoliciesBindEntity setVpcIdFieldKey(String vpcIdFieldKey) {
            this.vpcIdFieldKey = vpcIdFieldKey;
            return this;
        }
        public String getVpcIdFieldKey() {
            return this.vpcIdFieldKey;
        }

    }

    public static class AddonMetaEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        @NameInMap("promQL")
        public java.util.List<String> promQL;

        public static AddonMetaEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsPoliciesMetricCheckRule self = new AddonMetaEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsPoliciesMetricCheckRule setPromQL(java.util.List<String> promQL) {
            this.promQL = promQL;
            return this;
        }
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

    }

    public static class AddonMetaEnvironmentsPoliciesProtocols extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("icon")
        public String icon;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        public static AddonMetaEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsPoliciesProtocols self = new AddonMetaEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddonMetaEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public AddonMetaEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public AddonMetaEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AddonMetaEnvironmentsPolicies extends TeaModel {
        @NameInMap("alertDefaultStatus")
        public String alertDefaultStatus;

        @NameInMap("bindDefaultPolicy")
        public Boolean bindDefaultPolicy;

        @NameInMap("bindEntity")
        public AddonMetaEnvironmentsPoliciesBindEntity bindEntity;

        @NameInMap("defaultInstall")
        public Boolean defaultInstall;

        @NameInMap("enableServiceAccount")
        public Boolean enableServiceAccount;

        @NameInMap("metricCheckRule")
        public AddonMetaEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        @NameInMap("needRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        @NameInMap("protocols")
        public java.util.List<AddonMetaEnvironmentsPoliciesProtocols> protocols;

        @NameInMap("targetAddonName")
        public String targetAddonName;

        public static AddonMetaEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsPolicies self = new AddonMetaEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public AddonMetaEnvironmentsPolicies setBindDefaultPolicy(Boolean bindDefaultPolicy) {
            this.bindDefaultPolicy = bindDefaultPolicy;
            return this;
        }
        public Boolean getBindDefaultPolicy() {
            return this.bindDefaultPolicy;
        }

        public AddonMetaEnvironmentsPolicies setBindEntity(AddonMetaEnvironmentsPoliciesBindEntity bindEntity) {
            this.bindEntity = bindEntity;
            return this;
        }
        public AddonMetaEnvironmentsPoliciesBindEntity getBindEntity() {
            return this.bindEntity;
        }

        public AddonMetaEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public AddonMetaEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public AddonMetaEnvironmentsPolicies setMetricCheckRule(AddonMetaEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public AddonMetaEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public AddonMetaEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public AddonMetaEnvironmentsPolicies setProtocols(java.util.List<AddonMetaEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<AddonMetaEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public AddonMetaEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class AddonMetaEnvironments extends TeaModel {
        @NameInMap("dependencies")
        public AddonMetaEnvironmentsDependencies dependencies;

        @NameInMap("description")
        public String description;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        @NameInMap("policies")
        public AddonMetaEnvironmentsPolicies policies;

        @NameInMap("policyType")
        public String policyType;

        public static AddonMetaEnvironments build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironments self = new AddonMetaEnvironments();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironments setDependencies(AddonMetaEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public AddonMetaEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public AddonMetaEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddonMetaEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public AddonMetaEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public AddonMetaEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddonMetaEnvironments setPolicies(AddonMetaEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public AddonMetaEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

        public AddonMetaEnvironments setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
