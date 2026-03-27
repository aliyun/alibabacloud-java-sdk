// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    @NameInMap("addons")
    public java.util.List<ListAddonsResponseBodyAddons> addons;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsResponseBody self = new ListAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonsResponseBody setAddons(java.util.List<ListAddonsResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListAddonsResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAddonsResponseBodyAddonsDashboards extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>rum_view_link_rum_api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListAddonsResponseBodyAddonsDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsDashboards self = new ListAddonsResponseBodyAddonsDashboards();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyAddonsDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddonsDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs-ecs</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>0.1.4</p>
         */
        @NameInMap("version")
        public String version;

        public static ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs self = new ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironmentsDependencies extends TeaModel {
        @NameInMap("clusterTypes")
        public java.util.List<String> clusterTypes;

        @NameInMap("features")
        public java.util.Map<String, Boolean> features;

        @NameInMap("services")
        public java.util.List<String> services;

        public static ListAddonsResponseBodyAddonsEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironmentsDependencies self = new ListAddonsResponseBodyAddonsEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        @NameInMap("promQL")
        public java.util.List<String> promQL;

        public static ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule self = new ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule setPromQL(java.util.List<String> promQL) {
            this.promQL = promQL;
            return this;
        }
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Support OpenTelemetry Protocal</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>OpenTelemetry</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>openTelemetry</p>
         */
        @NameInMap("name")
        public String name;

        public static ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols self = new ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironmentsPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("alertDefaultStatus")
        public String alertDefaultStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultInstall")
        public Boolean defaultInstall;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableServiceAccount")
        public Boolean enableServiceAccount;

        @NameInMap("metricCheckRule")
        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        @NameInMap("protocols")
        public java.util.List<ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> protocols;

        /**
         * <strong>example:</strong>
         * <p>cloud-acs-ecs</p>
         */
        @NameInMap("targetAddonName")
        public String targetAddonName;

        public static ListAddonsResponseBodyAddonsEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironmentsPolicies self = new ListAddonsResponseBodyAddonsEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setMetricCheckRule(ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public ListAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setProtocols(java.util.List<ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public ListAddonsResponseBodyAddonsEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class ListAddonsResponseBodyAddonsEnvironments extends TeaModel {
        @NameInMap("commonSchemaRefs")
        public java.util.List<ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs> commonSchemaRefs;

        @NameInMap("dependencies")
        public ListAddonsResponseBodyAddonsEnvironmentsDependencies dependencies;

        /**
         * <strong>example:</strong>
         * <p>o11y-demo-cn-heyuan</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("policies")
        public ListAddonsResponseBodyAddonsEnvironmentsPolicies policies;

        /**
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("policyType")
        public String policyType;

        public static ListAddonsResponseBodyAddonsEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsEnvironments self = new ListAddonsResponseBodyAddonsEnvironments();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsEnvironments setCommonSchemaRefs(java.util.List<ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs> commonSchemaRefs) {
            this.commonSchemaRefs = commonSchemaRefs;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyAddonsEnvironmentsCommonSchemaRefs> getCommonSchemaRefs() {
            return this.commonSchemaRefs;
        }

        public ListAddonsResponseBodyAddonsEnvironments setDependencies(ListAddonsResponseBodyAddonsEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public ListAddonsResponseBodyAddonsEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public ListAddonsResponseBodyAddonsEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyAddonsEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAddonsResponseBodyAddonsEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAddonsResponseBodyAddonsEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddonsEnvironments setPolicies(ListAddonsResponseBodyAddonsEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public ListAddonsResponseBodyAddonsEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

        public ListAddonsResponseBodyAddonsEnvironments setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListAddonsResponseBodyAddons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>resume_vector_alias</p>
         */
        @NameInMap("alias")
        public String alias;

        @NameInMap("categories")
        public java.util.List<String> categories;

        @NameInMap("dashboards")
        public java.util.List<ListAddonsResponseBodyAddonsDashboards> dashboards;

        /**
         * <strong>example:</strong>
         * <p>workspace api monitor test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("environments")
        public java.util.List<ListAddonsResponseBodyAddonsEnvironments> environments;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("icon")
        public String icon;

        @NameInMap("keywords")
        public java.util.List<String> keywords;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>2025-09-03T03:15:56Z</p>
         */
        @NameInMap("latestReleaseCreateTime")
        public String latestReleaseCreateTime;

        /**
         * <strong>example:</strong>
         * <p>rum_api_dashboard_explorer_link_metric_set</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("once")
        public Boolean once;

        /**
         * <strong>example:</strong>
         * <p>middleware</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("weight")
        public String weight;

        public static ListAddonsResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddons self = new ListAddonsResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddons setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListAddonsResponseBodyAddons setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListAddonsResponseBodyAddons setDashboards(java.util.List<ListAddonsResponseBodyAddonsDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyAddonsDashboards> getDashboards() {
            return this.dashboards;
        }

        public ListAddonsResponseBodyAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyAddons setEnvironments(java.util.List<ListAddonsResponseBodyAddonsEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyAddonsEnvironments> getEnvironments() {
            return this.environments;
        }

        public ListAddonsResponseBodyAddons setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAddonsResponseBodyAddons setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListAddonsResponseBodyAddons setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAddonsResponseBodyAddons setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public ListAddonsResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddons setOnce(Boolean once) {
            this.once = once;
            return this;
        }
        public Boolean getOnce() {
            return this.once;
        }

        public ListAddonsResponseBodyAddons setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListAddonsResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListAddonsResponseBodyAddons setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

}
