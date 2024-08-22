// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentFeaturesResponseBody extends TeaModel {
    /**
     * <p>Status Code. Description 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEnvironmentFeaturesResponseBodyData> data;

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
     * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
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

    public static ListEnvironmentFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentFeaturesResponseBody self = new ListEnvironmentFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentFeaturesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentFeaturesResponseBody setData(java.util.List<ListEnvironmentFeaturesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnvironmentFeaturesResponseBodyData> getData() {
        return this.data;
    }

    public ListEnvironmentFeaturesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentFeaturesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentFeaturesResponseBodyData extends TeaModel {
        /**
         * <p>The alias of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus Agent</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The feature configuration.</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, String> config;

        /**
         * <p>The description of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect Metric data using the Prometheus collection specification.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The URL of the icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.17</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>Indicates whether the component is fully managed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Managed")
        public Boolean managed;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>metric-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the feature. Valid values:</p>
         * <ul>
         * <li>Installing: The agent is being installed.</li>
         * <li>Success: The agent is installed.</li>
         * <li>Failed: The agent failed to be installed.</li>
         * <li>UnInstall: The agent is uninstalled.</li>
         * <li>Uninstalling: The agent is being uninstalled.</li>
         * <li>UnInstallFailed: The agent failed to be uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.17</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListEnvironmentFeaturesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentFeaturesResponseBodyData self = new ListEnvironmentFeaturesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentFeaturesResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListEnvironmentFeaturesResponseBodyData setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public ListEnvironmentFeaturesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvironmentFeaturesResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListEnvironmentFeaturesResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListEnvironmentFeaturesResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListEnvironmentFeaturesResponseBodyData setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListEnvironmentFeaturesResponseBodyData setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListEnvironmentFeaturesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvironmentFeaturesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnvironmentFeaturesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
