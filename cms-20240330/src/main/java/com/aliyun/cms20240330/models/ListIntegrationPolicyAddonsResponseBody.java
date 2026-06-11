// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyAddonsResponseBody extends TeaModel {
    /**
     * <p>A list of add-ons.</p>
     */
    @NameInMap("addons")
    public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddons> addons;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E00EF90-CEF9-57C9-9AE9-5AA937D37C03</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListIntegrationPolicyAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyAddonsResponseBody self = new ListIntegrationPolicyAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyAddonsResponseBody setAddons(java.util.List<ListIntegrationPolicyAddonsResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListIntegrationPolicyAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationPolicyAddonsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsDashboards extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于mysql的监控大盘</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL Overview</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The URL of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsDashboards self = new ListIntegrationPolicyAddonsResponseBodyAddonsDashboards();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies extends TeaModel {
        /**
         * <p>The dependencies on cluster types.</p>
         */
        @NameInMap("clusterTypes")
        public java.util.List<String> clusterTypes;

        /**
         * <p>The dependencies on probes.</p>
         */
        @NameInMap("features")
        public java.util.Map<String, Boolean> features;

        /**
         * <p>The dependencies on product codes.</p>
         */
        @NameInMap("services")
        public java.util.List<String> services;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies self = new ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        /**
         * <p>The PromQL search statements.</p>
         */
        @NameInMap("promQl")
        public java.util.List<String> promQl;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule self = new ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule setPromQl(java.util.List<String> promQl) {
            this.promQl = promQl;
            return this;
        }
        public java.util.List<String> getPromQl() {
            return this.promQl;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alixxxx">https://img.alixxxx</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Golang</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The protocol name.</p>
         * 
         * <strong>example:</strong>
         * <p>golang</p>
         */
        @NameInMap("name")
        public String name;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols self = new ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies extends TeaModel {
        /**
         * <p>The default status of the alert rule policy.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("alertDefaultStatus")
        public String alertDefaultStatus;

        /**
         * <p>Indicates whether the add-on is installed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultInstall")
        public Boolean defaultInstall;

        /**
         * <p>Indicates whether to assign a Service Account for communication with the console API.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableServiceAccount")
        public Boolean enableServiceAccount;

        /**
         * <p>The metric check rule.</p>
         */
        @NameInMap("metricCheckRule")
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        /**
         * <p>Indicates whether a pod restart is required after the add-on is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        /**
         * <p>The protocols.</p>
         */
        @NameInMap("protocols")
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> protocols;

        /**
         * <p>The name of the target add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("targetAddonName")
        public String targetAddonName;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies self = new ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setMetricCheckRule(ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setProtocols(java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments extends TeaModel {
        /**
         * <p>The dependencies.</p>
         */
        @NameInMap("dependencies")
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies dependencies;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>o11y-demo-cn-heyuan</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The display name of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The name of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The policy.</p>
         */
        @NameInMap("policies")
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies policies;

        public static ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments self = new ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setDependencies(ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments setPolicies(ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public ListIntegrationPolicyAddonsResponseBodyAddonsEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

    }

    public static class ListIntegrationPolicyAddonsResponseBodyAddons extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The categories.</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <p>A list of dashboards.</p>
         */
        @NameInMap("dashboards")
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsDashboards> dashboards;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Observability integration.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>A list of supported environments.</p>
         */
        @NameInMap("environments")
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments> environments;

        /**
         * <p>The icon of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>asert/mysql.svg</p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <p>The keywords.</p>
         */
        @NameInMap("keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>The time when the latest version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-03T03:15:56Z</p>
         */
        @NameInMap("latestReleaseCreateTime")
        public String latestReleaseCreateTime;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the add-on can be installed only once.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("once")
        public Boolean once;

        /**
         * <p>The scenario of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>container</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The version of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static ListIntegrationPolicyAddonsResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyAddonsResponseBodyAddons self = new ListIntegrationPolicyAddonsResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setDashboards(java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsDashboards> getDashboards() {
            return this.dashboards;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setEnvironments(java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<ListIntegrationPolicyAddonsResponseBodyAddonsEnvironments> getEnvironments() {
            return this.environments;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setOnce(Boolean once) {
            this.once = once;
            return this;
        }
        public Boolean getOnce() {
            return this.once;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListIntegrationPolicyAddonsResponseBodyAddons setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
