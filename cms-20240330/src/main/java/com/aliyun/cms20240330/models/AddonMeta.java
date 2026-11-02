// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddonMeta extends TeaModel {
    /**
     * <p>The component alias and display name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS monitoring</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The component category information.</p>
     */
    @NameInMap("categories")
    public java.util.List<String> categories;

    /**
     * <p>The list of component dashboard diagrams.</p>
     */
    @NameInMap("dashboards")
    public java.util.List<AddonMetaDashboards> dashboards;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>The out-of-the-box and comprehensive ECS observe dashboards and alarm rules. Based on AliYun CloudMonitor agentless metrics, exporter agent metrics, host audit logs, host events and other data.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of supported environment types.</p>
     */
    @NameInMap("environments")
    public java.util.List<AddonMetaEnvironments> environments;

    /**
     * <p>The component icon.</p>
     * 
     * <strong>example:</strong>
     * <p>assets/logos/ecs.svg</p>
     */
    @NameInMap("icon")
    public String icon;

    /**
     * <p>The list of keywords.</p>
     */
    @NameInMap("keywords")
    public java.util.List<String> keywords;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh: Chinese (default).</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The last integration time of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-25 09:12:12</p>
     */
    @NameInMap("latestReleaseCreateTime")
    public String latestReleaseCreateTime;

    /**
     * <p>The component name.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud-acs-ecs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether the component can be installed only once under the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("once")
    public Boolean once;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>feature</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The component sorting weight.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The dashboard diagram name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS monitoring overview dashboard</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The dashboard diagram URL.</p>
         * 
         * <strong>example:</strong>
         * <p>assets/dashboards/ecs.png</p>
         */
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

    public static class AddonMetaEnvironmentsCommonSchemaRefs extends TeaModel {
        /**
         * <p>The CommonSchema group name.</p>
         * 
         * <strong>example:</strong>
         * <p>acs-ecs</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The CommonSchema group version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static AddonMetaEnvironmentsCommonSchemaRefs build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironmentsCommonSchemaRefs self = new AddonMetaEnvironmentsCommonSchemaRefs();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironmentsCommonSchemaRefs setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public AddonMetaEnvironmentsCommonSchemaRefs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class AddonMetaEnvironmentsDependencies extends TeaModel {
        /**
         * <p>The supported cluster types.</p>
         */
        @NameInMap("clusterTypes")
        public java.util.List<String> clusterTypes;

        /**
         * <p>The probe dependency description and component name. This field is replaced by the collectors field in the new version.</p>
         */
        @NameInMap("features")
        public java.util.Map<String, Boolean> features;

        /**
         * <p>The list of dependent services.</p>
         */
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
        /**
         * <p>Specifies whether it is in group mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("entityGroupMode")
        public Boolean entityGroupMode;

        /**
         * <p>The entity type.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.ecs.instance</p>
         */
        @NameInMap("entityType")
        public String entityType;

        /**
         * <p>Specifies whether it is in single-entity mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("singleEntityMode")
        public Boolean singleEntityMode;

        /**
         * <p>The field used to extract the VPC ID from the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcId</p>
         */
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
        /**
         * <p>The PromQL for the check rule.</p>
         */
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
        /**
         * <p>The protocol description.</p>
         * 
         * <strong>example:</strong>
         * <p>Writes metric data by using the Prometheus protocol</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The protocol display icon.</p>
         * 
         * <strong>example:</strong>
         * <p>assets/logos/ecs.svg</p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <p>The protocol display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus protocol</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The protocol name.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
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
        /**
         * <p>Specifies whether alert rules are enabled by default after installation.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("alertDefaultStatus")
        public String alertDefaultStatus;

        /**
         * <p>The default mode, which is an integration mode that does not require binding entities.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("bindDefaultPolicy")
        public Boolean bindDefaultPolicy;

        /**
         * <p>The bound target entity information.</p>
         */
        @NameInMap("bindEntity")
        public AddonMetaEnvironmentsPoliciesBindEntity bindEntity;

        /**
         * <p>Specifies whether it is installed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("defaultInstall")
        public Boolean defaultInstall;

        /**
         * <p>Specifies whether internal authorization token allocation is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("enableServiceAccount")
        public Boolean enableServiceAccount;

        /**
         * <p>The data check rule after the component is integrated.</p>
         */
        @NameInMap("metricCheckRule")
        public AddonMetaEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        /**
         * <p>Specifies whether to prompt for a workload restart after integration.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("needRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        /**
         * <p>The list of supported client protocol information.</p>
         */
        @NameInMap("protocols")
        public java.util.List<AddonMetaEnvironmentsPoliciesProtocols> protocols;

        /**
         * <p>The target component name for redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-acs-ecs</p>
         */
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
        /**
         * <p>The list of bound CommonSchemas.</p>
         */
        @NameInMap("commonSchemaRefs")
        public java.util.List<AddonMetaEnvironmentsCommonSchemaRefs> commonSchemaRefs;

        /**
         * <p>The dependency description.</p>
         */
        @NameInMap("dependencies")
        public AddonMetaEnvironmentsDependencies dependencies;

        /**
         * <p>The environment type description.</p>
         * 
         * <strong>example:</strong>
         * <p>Supports workload monitoring for container clusters</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether it is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The environment type display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Container environment</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The environment type name.</p>
         * 
         * <strong>example:</strong>
         * <p>CS/ECS/Cloud/Client</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The control policy combination information for the component.</p>
         */
        @NameInMap("policies")
        public AddonMetaEnvironmentsPolicies policies;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("policyType")
        public String policyType;

        public static AddonMetaEnvironments build(java.util.Map<String, ?> map) throws Exception {
            AddonMetaEnvironments self = new AddonMetaEnvironments();
            return TeaModel.build(map, self);
        }

        public AddonMetaEnvironments setCommonSchemaRefs(java.util.List<AddonMetaEnvironmentsCommonSchemaRefs> commonSchemaRefs) {
            this.commonSchemaRefs = commonSchemaRefs;
            return this;
        }
        public java.util.List<AddonMetaEnvironmentsCommonSchemaRefs> getCommonSchemaRefs() {
            return this.commonSchemaRefs;
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
