// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentFeatureResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return data.</p>
     */
    @NameInMap("Data")
    public DescribeEnvironmentFeatureResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>*   `true`: successful</p>
     * <p>*   `false`: failed</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEnvironmentFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvironmentFeatureResponseBody self = new DescribeEnvironmentFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvironmentFeatureResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvironmentFeatureResponseBody setData(DescribeEnvironmentFeatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvironmentFeatureResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvironmentFeatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvironmentFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnvironmentFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEnvironmentFeatureResponseBodyDataFeature extends TeaModel {
        /**
         * <p>Alias of Feature.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Config of Feature.</p>
         */
        @NameInMap("Config")
        public java.util.Map<String, String> config;

        /**
         * <p>Description of Feature.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Environment ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>Icon address.</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>Lanuage.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>This is the latest version of Feature.</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("Managed")
        public Boolean managed;

        /**
         * <p>Name of Feature.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Installation status of Feature.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Version of Feature.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeEnvironmentFeatureResponseBodyDataFeature build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentFeatureResponseBodyDataFeature self = new DescribeEnvironmentFeatureResponseBodyDataFeature();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeature setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers extends TeaModel {
        /**
         * <p>Container parameters.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>Container image.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>Name of the container.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers self = new DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeEnvironmentFeatureResponseBodyDataFeatureStatus extends TeaModel {
        /**
         * <p>Feature container list.</p>
         */
        @NameInMap("FeatureContainers")
        public java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> featureContainers;

        /**
         * <p>K8s resource name of the Feature.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Running status.</p>
         * <p>- Success: Running normal</p>
         * <p>- Failed: Running exception</p>
         * <p>- Not Found: Not installed</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEnvironmentFeatureResponseBodyDataFeatureStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentFeatureResponseBodyDataFeatureStatus self = new DescribeEnvironmentFeatureResponseBodyDataFeatureStatus();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setFeatureContainers(java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> featureContainers) {
            this.featureContainers = featureContainers;
            return this;
        }
        public java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> getFeatureContainers() {
            return this.featureContainers;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEnvironmentFeatureResponseBodyData extends TeaModel {
        /**
         * <p>Feature Installation information.</p>
         */
        @NameInMap("Feature")
        public DescribeEnvironmentFeatureResponseBodyDataFeature feature;

        /**
         * <p>Running status of the Feature.</p>
         */
        @NameInMap("FeatureStatus")
        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus featureStatus;

        public static DescribeEnvironmentFeatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentFeatureResponseBodyData self = new DescribeEnvironmentFeatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentFeatureResponseBodyData setFeature(DescribeEnvironmentFeatureResponseBodyDataFeature feature) {
            this.feature = feature;
            return this;
        }
        public DescribeEnvironmentFeatureResponseBodyDataFeature getFeature() {
            return this.feature;
        }

        public DescribeEnvironmentFeatureResponseBodyData setFeatureStatus(DescribeEnvironmentFeatureResponseBodyDataFeatureStatus featureStatus) {
            this.featureStatus = featureStatus;
            return this;
        }
        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus getFeatureStatus() {
            return this.featureStatus;
        }

    }

}
