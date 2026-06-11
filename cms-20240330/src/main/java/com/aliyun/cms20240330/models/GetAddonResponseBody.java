// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetAddonResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddonResponseBody self = new GetAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddonResponseBody setData(GetAddonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAddonResponseBodyData getData() {
        return this.data;
    }

    public GetAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAddonResponseBodyDataDashboards extends TeaModel {
        /**
         * <p>The description of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>rum_api_dot_metric_set</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The URL of the preview image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://iac-service-transfer.oss-cn-hangzhou.aliyuncs.com/78c5_288850010070719968_bdcf7cca781844c8ac4add133791713f">http://iac-service-transfer.oss-cn-hangzhou.aliyuncs.com/78c5_288850010070719968_bdcf7cca781844c8ac4add133791713f</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAddonResponseBodyDataDashboards build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataDashboards self = new GetAddonResponseBodyDataDashboards();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataDashboards setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonResponseBodyDataDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonResponseBodyDataDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs extends TeaModel {
        /**
         * <p>The group name of the common schema.</p>
         * 
         * <strong>example:</strong>
         * <p>acs-ecs</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The version of the common schema.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.3</p>
         */
        @NameInMap("version")
        public String version;

        public static GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs self = new GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAddonResponseBodyDataEnvironmentsDependencies extends TeaModel {
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
         * <p>The dependencies on activated services.</p>
         */
        @NameInMap("services")
        public java.util.List<String> services;

        public static GetAddonResponseBodyDataEnvironmentsDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironmentsDependencies self = new GetAddonResponseBodyDataEnvironmentsDependencies();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironmentsDependencies setClusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }
        public java.util.List<String> getClusterTypes() {
            return this.clusterTypes;
        }

        public GetAddonResponseBodyDataEnvironmentsDependencies setFeatures(java.util.Map<String, Boolean> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, Boolean> getFeatures() {
            return this.features;
        }

        public GetAddonResponseBodyDataEnvironmentsDependencies setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

    public static class GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule extends TeaModel {
        /**
         * <p>The data check rule that is used after installation.</p>
         */
        @NameInMap("promQL")
        public java.util.List<String> promQL;

        public static GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule self = new GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule setPromQL(java.util.List<String> promQL) {
            this.promQL = promQL;
            return this;
        }
        public java.util.List<String> getPromQL() {
            return this.promQL;
        }

    }

    public static class GetAddonResponseBodyDataEnvironmentsPoliciesProtocols extends TeaModel {
        /**
         * <p>The description of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>Support OpenTelemetry Protocol</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p>icon URL</p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <p>The display name of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenTelemetry</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The name of the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenTelemetry</p>
         */
        @NameInMap("name")
        public String name;

        public static GetAddonResponseBodyDataEnvironmentsPoliciesProtocols build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironmentsPoliciesProtocols self = new GetAddonResponseBodyDataEnvironmentsPoliciesProtocols();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironmentsPoliciesProtocols setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonResponseBodyDataEnvironmentsPoliciesProtocols setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAddonResponseBodyDataEnvironmentsPoliciesProtocols setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonResponseBodyDataEnvironmentsPoliciesProtocols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAddonResponseBodyDataEnvironmentsPolicies extends TeaModel {
        /**
         * <p>The status of the default policy for alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Indicates whether a service account is assigned for communication with the console API.</p>
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
        public GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule metricCheckRule;

        /**
         * <p>Indicates whether to guide the user to restart pods after the add-on is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needRestartAfterIntegration")
        public Boolean needRestartAfterIntegration;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("protocols")
        public java.util.List<GetAddonResponseBodyDataEnvironmentsPoliciesProtocols> protocols;

        /**
         * <p>The name of the target add-on to which the system redirects.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-default</p>
         */
        @NameInMap("targetAddonName")
        public String targetAddonName;

        public static GetAddonResponseBodyDataEnvironmentsPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironmentsPolicies self = new GetAddonResponseBodyDataEnvironmentsPolicies();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setAlertDefaultStatus(String alertDefaultStatus) {
            this.alertDefaultStatus = alertDefaultStatus;
            return this;
        }
        public String getAlertDefaultStatus() {
            return this.alertDefaultStatus;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setDefaultInstall(Boolean defaultInstall) {
            this.defaultInstall = defaultInstall;
            return this;
        }
        public Boolean getDefaultInstall() {
            return this.defaultInstall;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setEnableServiceAccount(Boolean enableServiceAccount) {
            this.enableServiceAccount = enableServiceAccount;
            return this;
        }
        public Boolean getEnableServiceAccount() {
            return this.enableServiceAccount;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setMetricCheckRule(GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule metricCheckRule) {
            this.metricCheckRule = metricCheckRule;
            return this;
        }
        public GetAddonResponseBodyDataEnvironmentsPoliciesMetricCheckRule getMetricCheckRule() {
            return this.metricCheckRule;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setNeedRestartAfterIntegration(Boolean needRestartAfterIntegration) {
            this.needRestartAfterIntegration = needRestartAfterIntegration;
            return this;
        }
        public Boolean getNeedRestartAfterIntegration() {
            return this.needRestartAfterIntegration;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setProtocols(java.util.List<GetAddonResponseBodyDataEnvironmentsPoliciesProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<GetAddonResponseBodyDataEnvironmentsPoliciesProtocols> getProtocols() {
            return this.protocols;
        }

        public GetAddonResponseBodyDataEnvironmentsPolicies setTargetAddonName(String targetAddonName) {
            this.targetAddonName = targetAddonName;
            return this;
        }
        public String getTargetAddonName() {
            return this.targetAddonName;
        }

    }

    public static class GetAddonResponseBodyDataEnvironments extends TeaModel {
        /**
         * <p>The list of associated common schemas.</p>
         */
        @NameInMap("commonSchemaRefs")
        public java.util.List<GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs> commonSchemaRefs;

        /**
         * <p>The dependencies.</p>
         */
        @NameInMap("dependencies")
        public GetAddonResponseBodyDataEnvironmentsDependencies dependencies;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Observability integration.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The display name of the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>容器环境</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-default-umodel-1752755202744_k8s.metric.high_level_metric_deployment_cn-hangzhou/c0a686118449c4390b9cc0a07ea3e0e85</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("policies")
        public GetAddonResponseBodyDataEnvironmentsPolicies policies;

        /**
         * <p>The type of the integration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("policyType")
        public String policyType;

        public static GetAddonResponseBodyDataEnvironments build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyDataEnvironments self = new GetAddonResponseBodyDataEnvironments();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyDataEnvironments setCommonSchemaRefs(java.util.List<GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs> commonSchemaRefs) {
            this.commonSchemaRefs = commonSchemaRefs;
            return this;
        }
        public java.util.List<GetAddonResponseBodyDataEnvironmentsCommonSchemaRefs> getCommonSchemaRefs() {
            return this.commonSchemaRefs;
        }

        public GetAddonResponseBodyDataEnvironments setDependencies(GetAddonResponseBodyDataEnvironmentsDependencies dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public GetAddonResponseBodyDataEnvironmentsDependencies getDependencies() {
            return this.dependencies;
        }

        public GetAddonResponseBodyDataEnvironments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonResponseBodyDataEnvironments setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAddonResponseBodyDataEnvironments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonResponseBodyDataEnvironments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonResponseBodyDataEnvironments setPolicies(GetAddonResponseBodyDataEnvironmentsPolicies policies) {
            this.policies = policies;
            return this;
        }
        public GetAddonResponseBodyDataEnvironmentsPolicies getPolicies() {
            return this.policies;
        }

        public GetAddonResponseBodyDataEnvironments setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetAddonResponseBodyData extends TeaModel {
        /**
         * <p>The alias of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>resume_vector_alias</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The list of component categories.</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <p>The list of dashboards.</p>
         */
        @NameInMap("dashboards")
        public java.util.List<GetAddonResponseBodyDataDashboards> dashboards;

        /**
         * <p>The description of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>o11y-demo-cn-heyuan</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment information.</p>
         */
        @NameInMap("environments")
        public java.util.List<GetAddonResponseBodyDataEnvironments> environments;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
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
         * <p>2023-09-12 12:30:30</p>
         */
        @NameInMap("latestReleaseCreateTime")
        public String latestReleaseCreateTime;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>rum_api_dashboard_explorer_link_metric_set</p>
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
         * <p>The scenario of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>middleware</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("weight")
        public String weight;

        public static GetAddonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyData self = new GetAddonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetAddonResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetAddonResponseBodyData setDashboards(java.util.List<GetAddonResponseBodyDataDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<GetAddonResponseBodyDataDashboards> getDashboards() {
            return this.dashboards;
        }

        public GetAddonResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonResponseBodyData setEnvironments(java.util.List<GetAddonResponseBodyDataEnvironments> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<GetAddonResponseBodyDataEnvironments> getEnvironments() {
            return this.environments;
        }

        public GetAddonResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAddonResponseBodyData setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public GetAddonResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetAddonResponseBodyData setLatestReleaseCreateTime(String latestReleaseCreateTime) {
            this.latestReleaseCreateTime = latestReleaseCreateTime;
            return this;
        }
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        public GetAddonResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonResponseBodyData setOnce(Boolean once) {
            this.once = once;
            return this;
        }
        public Boolean getOnce() {
            return this.once;
        }

        public GetAddonResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetAddonResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAddonResponseBodyData setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

}
