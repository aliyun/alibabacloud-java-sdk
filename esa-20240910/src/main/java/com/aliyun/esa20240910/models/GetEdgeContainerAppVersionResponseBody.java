// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the version.</p>
     */
    @NameInMap("Version")
    public GetEdgeContainerAppVersionResponseBodyVersion version;

    public static GetEdgeContainerAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppVersionResponseBody self = new GetEdgeContainerAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerAppVersionResponseBody setVersion(GetEdgeContainerAppVersionResponseBodyVersion version) {
        this.version = version;
        return this;
    }
    public GetEdgeContainerAppVersionResponseBodyVersion getVersion() {
        return this.version;
    }

    public static class GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo extends TeaModel {
        /**
         * <p>The domain name of the Container Registry image.</p>
         * 
         * <strong>example:</strong>
         * <p>*.mooc.seewo.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the Container Registry instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xcdn-9ak2thl14z5s</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the image is an enterprise-level image.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsEnterpriseRegistry")
        public Boolean isEnterpriseRegistry;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-zeu0xyk28alyxozh</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>wpy1</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-healthy-100-soa-1710987653</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The URL of the Container Registry image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shenzhen.aliyuncs.com/lihetech/easywits_server_exam:3.40.2</p>
         */
        @NameInMap("TagUrl")
        public String tagUrl;

        public static GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo self = new GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setIsEnterpriseRegistry(Boolean isEnterpriseRegistry) {
            this.isEnterpriseRegistry = isEnterpriseRegistry;
            return this;
        }
        public Boolean getIsEnterpriseRegistry() {
            return this.isEnterpriseRegistry;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo setTagUrl(String tagUrl) {
            this.tagUrl = tagUrl;
            return this;
        }
        public String getTagUrl() {
            return this.tagUrl;
        }

    }

    public static class GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent extends TeaModel {
        /**
         * <p>The probe command.</p>
         * 
         * <strong>example:</strong>
         * <p>sh test.sh</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The number of consecutive failed health checks required for a container to be considered as unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The request headers that are included in the container health check request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Content-Type\&quot;:\&quot;application/json</p>
         */
        @NameInMap("HttpHeaders")
        public String httpHeaders;

        /**
         * <p>The latency for container probe initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The path of the container health check.</p>
         * 
         * <strong>example:</strong>
         * <p>/health_check</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The interval between container health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The port of the container health check. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol that the container health check request uses.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        /**
         * <p>The number of consecutive successful health checks required for a container to be considered as healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <p>The timeout period of the container health check.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent self = new GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setHttpHeaders(String httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public String getHttpHeaders() {
            return this.httpHeaders;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class GetEdgeContainerAppVersionResponseBodyVersionContainers extends TeaModel {
        /**
         * <p>The information about the Container Registry image.</p>
         */
        @NameInMap("ACRImageInfo")
        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo ACRImageInfo;

        /**
         * <p>The arguments that are passed to the container startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>-c /path/config.toml</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The command that is used to start the container.</p>
         * 
         * <strong>example:</strong>
         * <p>sh abc.sh 1 2 3</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV=prod</p>
         */
        @NameInMap("EnvVariables")
        public String envVariables;

        /**
         * <p>The image address.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx:1.14.0</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>Indicates whether the image is a Container Registry image.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsACRImage")
        public Boolean isACRImage;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>version01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The command that is run before the container is started. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\\]}}</code>. If you want to cancel this configuration, set the parameter value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;touch\&quot;,\&quot;/home/admin/checkpoststartV1\&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The command that is run before the container is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>sh prestop.sh &quot;echo hello world&quot;</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The probe content.</p>
         */
        @NameInMap("ProbeContent")
        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent probeContent;

        /**
         * <p>The probe type.</p>
         * 
         * <strong>example:</strong>
         * <p>httpGet</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>The compute specification.</p>
         * 
         * <strong>example:</strong>
         * <p>1C2G</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The storage capacity of the container. Valid values: 0.5G, 10G, 20G, and 30G.</p>
         */
        @NameInMap("Storage")
        public String storage;

        public static GetEdgeContainerAppVersionResponseBodyVersionContainers build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppVersionResponseBodyVersionContainers self = new GetEdgeContainerAppVersionResponseBodyVersionContainers();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setACRImageInfo(GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo ACRImageInfo) {
            this.ACRImageInfo = ACRImageInfo;
            return this;
        }
        public GetEdgeContainerAppVersionResponseBodyVersionContainersACRImageInfo getACRImageInfo() {
            return this.ACRImageInfo;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setEnvVariables(String envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public String getEnvVariables() {
            return this.envVariables;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setIsACRImage(Boolean isACRImage) {
            this.isACRImage = isACRImage;
            return this;
        }
        public Boolean getIsACRImage() {
            return this.isACRImage;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setProbeContent(GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent probeContent) {
            this.probeContent = probeContent;
            return this;
        }
        public GetEdgeContainerAppVersionResponseBodyVersionContainersProbeContent getProbeContent() {
            return this.probeContent;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setProbeType(String probeType) {
            this.probeType = probeType;
            return this;
        }
        public String getProbeType() {
            return this.probeType;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetEdgeContainerAppVersionResponseBodyVersionContainers setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

    }

    public static class GetEdgeContainerAppVersionResponseBodyVersion extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The container images deployed for this version.</p>
         */
        @NameInMap("Containers")
        public java.util.List<GetEdgeContainerAppVersionResponseBodyVersionContainers> containers;

        /**
         * <p>The time when the version was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-01T09:32:33Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the version was last released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T04:58:05Z</p>
         */
        @NameInMap("LastPublishTime")
        public String lastPublishTime;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the version was released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-14T02:04:03Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The status of the current version. Valid values:</p>
         * <ul>
         * <li>created: The version is created.</li>
         * <li>failed: The version failed to be created.</li>
         * <li>creating: The version is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the version was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03T10:52:52Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the created version.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-87962637161651****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetEdgeContainerAppVersionResponseBodyVersion build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppVersionResponseBodyVersion self = new GetEdgeContainerAppVersionResponseBodyVersion();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setContainers(java.util.List<GetEdgeContainerAppVersionResponseBodyVersionContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<GetEdgeContainerAppVersionResponseBodyVersionContainers> getContainers() {
            return this.containers;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setLastPublishTime(String lastPublishTime) {
            this.lastPublishTime = lastPublishTime;
            return this;
        }
        public String getLastPublishTime() {
            return this.lastPublishTime;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetEdgeContainerAppVersionResponseBodyVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
