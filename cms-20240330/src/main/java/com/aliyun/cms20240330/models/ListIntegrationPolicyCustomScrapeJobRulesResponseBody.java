// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCustomScrapeJobRulesResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>et15prod-et15storage</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The custom scrape job rules.</p>
     */
    @NameInMap("customScrapeJobRules")
    public java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules> customScrapeJobRules;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-15abcc24c06f4797832b5954198e1ed1</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListIntegrationPolicyCustomScrapeJobRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCustomScrapeJobRulesResponseBody self = new ListIntegrationPolicyCustomScrapeJobRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody setCustomScrapeJobRules(java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules> customScrapeJobRules) {
        this.customScrapeJobRules = customScrapeJobRules;
        return this;
    }
    public java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules> getCustomScrapeJobRules() {
        return this.customScrapeJobRules;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs extends TeaModel {
        /**
         * <p>The scrape job name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-exporter</p>
         */
        @NameInMap("jobName")
        public String jobName;

        /**
         * <p>The details.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The scrape path.</p>
         * 
         * <strong>example:</strong>
         * <p>/metrics</p>
         */
        @NameInMap("metricsPath")
        public String metricsPath;

        /**
         * <p>The invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("scheme")
        public String scheme;

        /**
         * <p>The scrape interval.</p>
         * 
         * <strong>example:</strong>
         * <p>30s</p>
         */
        @NameInMap("scrapeInterval")
        public String scrapeInterval;

        /**
         * <p>The scrape timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("scrapeTimeout")
        public String scrapeTimeout;

        /**
         * <p>The service discovery configurations.</p>
         */
        @NameInMap("serviceDiscoveryConfigs")
        public java.util.List<String> serviceDiscoveryConfigs;

        public static ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs self = new ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setMetricsPath(String metricsPath) {
            this.metricsPath = metricsPath;
            return this;
        }
        public String getMetricsPath() {
            return this.metricsPath;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setScrapeInterval(String scrapeInterval) {
            this.scrapeInterval = scrapeInterval;
            return this;
        }
        public String getScrapeInterval() {
            return this.scrapeInterval;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setScrapeTimeout(String scrapeTimeout) {
            this.scrapeTimeout = scrapeTimeout;
            return this;
        }
        public String getScrapeTimeout() {
            return this.scrapeTimeout;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs setServiceDiscoveryConfigs(java.util.List<String> serviceDiscoveryConfigs) {
            this.serviceDiscoveryConfigs = serviceDiscoveryConfigs;
            return this;
        }
        public java.util.List<String> getServiceDiscoveryConfigs() {
            return this.serviceDiscoveryConfigs;
        }

    }

    public static class ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules extends TeaModel {
        /**
         * <p>The add-on name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-ecs</p>
         */
        @NameInMap("addonName")
        public String addonName;

        /**
         * <p>The name of the add-on release.</p>
         * 
         * <strong>example:</strong>
         * <p>release-12345678</p>
         */
        @NameInMap("addonReleaseName")
        public String addonReleaseName;

        /**
         * <p>The add-on version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("addonVersion")
        public String addonVersion;

        /**
         * <p>The configuration YAML file.</p>
         * 
         * <strong>example:</strong>
         * <p>scrape_cofnigs:</p>
         * <ul>
         * <li>jobxxxxxx</li>
         * </ul>
         */
        @NameInMap("configYaml")
        public String configYaml;

        /**
         * <p>The enabled status.</p>
         * 
         * <strong>example:</strong>
         * <p>mini</p>
         */
        @NameInMap("enableStatus")
        public String enableStatus;

        /**
         * <p>Indicates whether the YAML file is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encryptYaml")
        public Boolean encryptYaml;

        /**
         * <p>The number of matched pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("matchedPodCount")
        public Long matchedPodCount;

        /**
         * <p>The details.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>dlab1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-data</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The custom configurations.</p>
         */
        @NameInMap("scrapeConfigs")
        public java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs> scrapeConfigs;

        public static ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules self = new ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setEncryptYaml(Boolean encryptYaml) {
            this.encryptYaml = encryptYaml;
            return this;
        }
        public Boolean getEncryptYaml() {
            return this.encryptYaml;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setMatchedPodCount(Long matchedPodCount) {
            this.matchedPodCount = matchedPodCount;
            return this;
        }
        public Long getMatchedPodCount() {
            return this.matchedPodCount;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRules setScrapeConfigs(java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs> scrapeConfigs) {
            this.scrapeConfigs = scrapeConfigs;
            return this;
        }
        public java.util.List<ListIntegrationPolicyCustomScrapeJobRulesResponseBodyCustomScrapeJobRulesScrapeConfigs> getScrapeConfigs() {
            return this.scrapeConfigs;
        }

    }

}
