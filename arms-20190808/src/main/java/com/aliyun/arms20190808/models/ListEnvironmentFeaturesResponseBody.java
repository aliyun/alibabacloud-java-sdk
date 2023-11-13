// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentFeaturesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListEnvironmentFeaturesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Config")
        public java.util.Map<String, String> config;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvironmentId")
        public String environmentId;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Language")
        public String language;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

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
