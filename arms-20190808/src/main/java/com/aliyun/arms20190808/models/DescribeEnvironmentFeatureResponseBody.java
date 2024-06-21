// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentFeatureResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
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
    public DescribeEnvironmentFeatureResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01FF8DD9-A09C-47A1-895A-B6E321BE77B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The alias of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus agent.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The configuration of the feature.</p>
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
         * <p>The environment ID.</p>
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
         * <p>The language.</p>
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
         * <p>Whether or not it is a managed component.</p>
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
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.17</p>
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
         * <p>The container parameters.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-cn-hangzhou-vpc.ack.aliyuncs.com/acs/arms-prometheus-agent:v4.0.0</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prometheus-operator</p>
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
        @NameInMap("BindResourceId")
        public String bindResourceId;

        /**
         * <p>The containers of the feature.</p>
         */
        @NameInMap("FeatureContainers")
        public java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> featureContainers;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The Kubernetes resource name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prometheus-ack-arms-prometheus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the agent. Valid values:</p>
         * <ul>
         * <li>Success: The agent is running.</li>
         * <li>Failed: The agent failed to run.</li>
         * <li>Not Found: The agent is not installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeEnvironmentFeatureResponseBodyDataFeatureStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvironmentFeatureResponseBodyDataFeatureStatus self = new DescribeEnvironmentFeatureResponseBodyDataFeatureStatus();
            return TeaModel.build(map, self);
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setBindResourceId(String bindResourceId) {
            this.bindResourceId = bindResourceId;
            return this;
        }
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setFeatureContainers(java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> featureContainers) {
            this.featureContainers = featureContainers;
            return this;
        }
        public java.util.List<DescribeEnvironmentFeatureResponseBodyDataFeatureStatusFeatureContainers> getFeatureContainers() {
            return this.featureContainers;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
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

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEnvironmentFeatureResponseBodyDataFeatureStatus setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeEnvironmentFeatureResponseBodyData extends TeaModel {
        /**
         * <p>The installation information of the feature.</p>
         */
        @NameInMap("Feature")
        public DescribeEnvironmentFeatureResponseBodyDataFeature feature;

        /**
         * <p>The status of the feature.</p>
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
