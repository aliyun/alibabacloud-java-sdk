// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvCustomJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEnvCustomJobsResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnvCustomJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvCustomJobsResponseBody self = new ListEnvCustomJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvCustomJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvCustomJobsResponseBody setData(java.util.List<ListEnvCustomJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnvCustomJobsResponseBodyData> getData() {
        return this.data;
    }

    public ListEnvCustomJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvCustomJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvCustomJobsResponseBodyDataScrapeConfigs extends TeaModel {
        /**
         * <p>The name of the job.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The path of the metric.</p>
         */
        @NameInMap("MetricsPath")
        public String metricsPath;

        /**
         * <p>The service discovery methods.</p>
         */
        @NameInMap("ScrapeDiscoverys")
        public java.util.List<String> scrapeDiscoverys;

        /**
         * <p>The capture interval.</p>
         */
        @NameInMap("ScrapeInterval")
        public String scrapeInterval;

        public static ListEnvCustomJobsResponseBodyDataScrapeConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListEnvCustomJobsResponseBodyDataScrapeConfigs self = new ListEnvCustomJobsResponseBodyDataScrapeConfigs();
            return TeaModel.build(map, self);
        }

        public ListEnvCustomJobsResponseBodyDataScrapeConfigs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListEnvCustomJobsResponseBodyDataScrapeConfigs setMetricsPath(String metricsPath) {
            this.metricsPath = metricsPath;
            return this;
        }
        public String getMetricsPath() {
            return this.metricsPath;
        }

        public ListEnvCustomJobsResponseBodyDataScrapeConfigs setScrapeDiscoverys(java.util.List<String> scrapeDiscoverys) {
            this.scrapeDiscoverys = scrapeDiscoverys;
            return this;
        }
        public java.util.List<String> getScrapeDiscoverys() {
            return this.scrapeDiscoverys;
        }

        public ListEnvCustomJobsResponseBodyDataScrapeConfigs setScrapeInterval(String scrapeInterval) {
            this.scrapeInterval = scrapeInterval;
            return this;
        }
        public String getScrapeInterval() {
            return this.scrapeInterval;
        }

    }

    public static class ListEnvCustomJobsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the component to which the custom job belongs.</p>
         */
        @NameInMap("AddonName")
        public String addonName;

        /**
         * <p>The instance name of the component.</p>
         */
        @NameInMap("AddonReleaseName")
        public String addonReleaseName;

        /**
         * <p>The version of the component.</p>
         */
        @NameInMap("AddonVersion")
        public String addonVersion;

        /**
         * <p>If the request parameter EncryptYaml is set to true, a Base64-encoded YAML string is returned. Otherwise, a plaintext YAML string is returned.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The time when the custom job was created. The value of this parameter is a timestamp.</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>The name of the custom job.</p>
         */
        @NameInMap("CustomJobName")
        public String customJobName;

        /**
         * <p>The ID of the environment instance.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The capture configurations.</p>
         */
        @NameInMap("ScrapeConfigs")
        public java.util.List<ListEnvCustomJobsResponseBodyDataScrapeConfigs> scrapeConfigs;

        /**
         * <p>The status of the custom job.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListEnvCustomJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvCustomJobsResponseBodyData self = new ListEnvCustomJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvCustomJobsResponseBodyData setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListEnvCustomJobsResponseBodyData setAddonReleaseName(String addonReleaseName) {
            this.addonReleaseName = addonReleaseName;
            return this;
        }
        public String getAddonReleaseName() {
            return this.addonReleaseName;
        }

        public ListEnvCustomJobsResponseBodyData setAddonVersion(String addonVersion) {
            this.addonVersion = addonVersion;
            return this;
        }
        public String getAddonVersion() {
            return this.addonVersion;
        }

        public ListEnvCustomJobsResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public ListEnvCustomJobsResponseBodyData setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public ListEnvCustomJobsResponseBodyData setCustomJobName(String customJobName) {
            this.customJobName = customJobName;
            return this;
        }
        public String getCustomJobName() {
            return this.customJobName;
        }

        public ListEnvCustomJobsResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListEnvCustomJobsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEnvCustomJobsResponseBodyData setScrapeConfigs(java.util.List<ListEnvCustomJobsResponseBodyDataScrapeConfigs> scrapeConfigs) {
            this.scrapeConfigs = scrapeConfigs;
            return this;
        }
        public java.util.List<ListEnvCustomJobsResponseBodyDataScrapeConfigs> getScrapeConfigs() {
            return this.scrapeConfigs;
        }

        public ListEnvCustomJobsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
