// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentAddonsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public ListEnvironmentAddonsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>32940175-181B-4B93-966E-4BB69176****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentAddonsResponseBody self = new ListEnvironmentAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentAddonsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentAddonsResponseBody setData(ListEnvironmentAddonsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentAddonsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentAddonsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentAddonsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsDashboards extends TeaModel {
        /**
         * <p>The description of the dashboard.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-overview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The URL of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListEnvironmentAddonsResponseBodyDataAddonsDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsDashboards self = new ListEnvironmentAddonsResponseBodyDataAddonsDashboards();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies extends TeaModel {
        @NameInMap("ClusterTypes")
        public java.util.List<String> clusterTypes;

        /**
         * <p>The feature that can be installed in the environment.</p>
         */
        @NameInMap("Features")
        public java.util.Map<String, Boolean> features;

        /**
         * <p>The services.</p>
         */
        @NameInMap("Services")
        public java.util.List<String> services;

        public static ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies self = new ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        @NameInMap("PromQL")
        public java.util.List<String> promQL;

        public static ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule self = new ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule setPromQL(java.util.List<String> promQL) {
            this.promQL = promQL;
            return this;
        }
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols extends TeaModel {
        /**
         * <p>The description of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ARMS</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the protocol icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxx">http://xxxxxxx</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The tag of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ARMS</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The name of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>arms</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols self = new ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies extends TeaModel {
        /**
         * <p>The default alert status.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AlertDefaultStatus")
        public String alertDefaultStatus;

        /**
         * <p>The default installation status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultInstall")
        public Boolean defaultInstall;

        @NameInMap("EnableServiceAccount")
        public Boolean enableServiceAccount;

        @NameInMap("MetricCheckRule")
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        @NameInMap("NeedRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        /**
         * <p>The supported protocols.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols> protocols;

        /**
         * <p>The target name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-rds-mysql</p>
         */
        @NameInMap("TargetAddonName")
        public String targetAddonName;

        public static ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies self = new ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setMetricCheckRule(ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setProtocols(java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddonsEnvironments extends TeaModel {
        /**
         * <p>The dependencies of the environment.</p>
         */
        @NameInMap("Dependencies")
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies dependencies;

        /**
         * <p>The description of the environment.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The tag of the environment.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The name of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The control policies in the environment.</p>
         */
        @NameInMap("Policies")
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies policies;

        public static ListEnvironmentAddonsResponseBodyDataAddonsEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddonsEnvironments self = new ListEnvironmentAddonsResponseBodyDataAddonsEnvironments();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setDependencies(ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironments setPolicies(ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public ListEnvironmentAddonsResponseBodyDataAddonsEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyDataAddons extends TeaModel {
        /**
         * <p>The alias of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The tags of the add-on.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The dashboards.</p>
         */
        @NameInMap("Dashboards")
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsDashboards> dashboards;

        /**
         * <p>The description of the add-on.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The supported environments.</p>
         */
        @NameInMap("Environments")
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironments> environments;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx">http://xxxx</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The collection of keywords.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The time when the instance was last created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-22T16:56:29+08:00</p>
         */
        @NameInMap("LatestReleaseCreateTime")
        public String latestReleaseCreateTime;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the add-on can be installed only once.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Once")
        public Boolean once;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The version of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>857</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static ListEnvironmentAddonsResponseBodyDataAddons build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyDataAddons self = new ListEnvironmentAddonsResponseBodyDataAddons();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setDashboards(java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsDashboards> getDashboards() {
            return this.dashboards;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setEnvironments(java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddonsEnvironments> getEnvironments() {
            return this.environments;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setOnce(Boolean once) {
            this.once = once;
            return this;
        }
        public Boolean getOnce() {
            return this.once;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListEnvironmentAddonsResponseBodyDataAddons setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class ListEnvironmentAddonsResponseBodyData extends TeaModel {
        /**
         * <p>The queried add-ons.</p>
         */
        @NameInMap("Addons")
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddons> addons;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListEnvironmentAddonsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentAddonsResponseBodyData self = new ListEnvironmentAddonsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentAddonsResponseBodyData setAddons(java.util.List<ListEnvironmentAddonsResponseBodyDataAddons> addons) {
            this.addons = addons;
            return this;
        }
        public java.util.List<ListEnvironmentAddonsResponseBodyDataAddons> getAddons() {
            return this.addons;
        }

        public ListEnvironmentAddonsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
