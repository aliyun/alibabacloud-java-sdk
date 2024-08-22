// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried add-ons.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAddonsResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the alert rule was deleted. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The alert rule was deleted.</li>
     * <li><code>false</code>: The alert rule failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsResponseBody self = new ListAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAddonsResponseBody setData(java.util.List<ListAddonsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAddonsResponseBodyData> getData() {
        return this.data;
    }

    public ListAddonsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddonsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAddonsResponseBodyDataDashboards extends TeaModel {
        /**
         * <p>The description of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL monitors the market information, monitoring the connection information, usage information and other indicators</p>
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

        public static ListAddonsResponseBodyDataDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataDashboards self = new ListAddonsResponseBodyDataDashboards();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyDataDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyDataDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAddonsResponseBodyDataEnvironmentsDependencies extends TeaModel {
        /**
         * <p>The supported cluster types.</p>
         */
        @NameInMap("ClusterTypes")
        public java.util.List<String> clusterTypes;

        /**
         * <p>The feature on which the environment depends.</p>
         */
        @NameInMap("Features")
        public java.util.Map<String, Boolean> features;

        /**
         * <p>The services.</p>
         */
        @NameInMap("Services")
        public java.util.List<String> services;

        public static ListAddonsResponseBodyDataEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataEnvironmentsDependencies self = new ListAddonsResponseBodyDataEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public ListAddonsResponseBodyDataEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public ListAddonsResponseBodyDataEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        /**
         * <p>The PromQL statements.</p>
         */
        @NameInMap("PromQL")
        public java.util.List<String> promQL;

        public static ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule self = new ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule setPromQL(java.util.List<String> promQL) {
            this.promQL = promQL;
            return this;
        }
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

    }

    public static class ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols extends TeaModel {
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

        public static ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols self = new ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAddonsResponseBodyDataEnvironmentsPolicies extends TeaModel {
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

        /**
         * <p>Indicates whether a service account is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false.</p>
         */
        @NameInMap("EnableServiceAccount")
        public Boolean enableServiceAccount;

        /**
         * <p>The metric check rule.</p>
         */
        @NameInMap("MetricCheckRule")
        public ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        /**
         * <p>Indicates whether a restart is required after the installation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        /**
         * <p>The supported protocols.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols> protocols;

        /**
         * <p>The target name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-rds-mysql</p>
         */
        @NameInMap("TargetAddonName")
        public String targetAddonName;

        public static ListAddonsResponseBodyDataEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataEnvironmentsPolicies self = new ListAddonsResponseBodyDataEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setMetricCheckRule(ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public ListAddonsResponseBodyDataEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setProtocols(java.util.List<ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyDataEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public ListAddonsResponseBodyDataEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class ListAddonsResponseBodyDataEnvironments extends TeaModel {
        /**
         * <p>The dependencies of the environment.</p>
         */
        @NameInMap("Dependencies")
        public ListAddonsResponseBodyDataEnvironmentsDependencies dependencies;

        /**
         * <p>The description of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>The MySQL service is deployed in a Kubernetes cluster.</p>
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
         * 
         * <strong>example:</strong>
         * <p>Container</p>
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
        public ListAddonsResponseBodyDataEnvironmentsPolicies policies;

        public static ListAddonsResponseBodyDataEnvironments build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyDataEnvironments self = new ListAddonsResponseBodyDataEnvironments();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyDataEnvironments setDependencies(ListAddonsResponseBodyDataEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public ListAddonsResponseBodyDataEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public ListAddonsResponseBodyDataEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyDataEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAddonsResponseBodyDataEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAddonsResponseBodyDataEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyDataEnvironments setPolicies(ListAddonsResponseBodyDataEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public ListAddonsResponseBodyDataEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

    }

    public static class ListAddonsResponseBodyData extends TeaModel {
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
        public java.util.List<ListAddonsResponseBodyDataDashboards> dashboards;

        /**
         * <p>The description of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>Monitor database indicators with MySQL Exporter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The supported environments.</p>
         */
        @NameInMap("Environments")
        public java.util.List<ListAddonsResponseBodyDataEnvironments> environments;

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

        public static ListAddonsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyData self = new ListAddonsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListAddonsResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListAddonsResponseBodyData setDashboards(java.util.List<ListAddonsResponseBodyDataDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyDataDashboards> getDashboards() {
            return this.dashboards;
        }

        public ListAddonsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonsResponseBodyData setEnvironments(java.util.List<ListAddonsResponseBodyDataEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyDataEnvironments> getEnvironments() {
            return this.environments;
        }

        public ListAddonsResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAddonsResponseBodyData setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListAddonsResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAddonsResponseBodyData setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public ListAddonsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyData setOnce(Boolean once) {
            this.once = once;
            return this;
        }
        public Boolean getOnce() {
            return this.once;
        }

        public ListAddonsResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListAddonsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListAddonsResponseBodyData setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

}
