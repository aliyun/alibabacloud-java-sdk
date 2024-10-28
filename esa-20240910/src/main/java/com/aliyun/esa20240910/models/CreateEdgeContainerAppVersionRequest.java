// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;Name&quot;: &quot;container1&quot;,
     *             &quot;Image&quot;: &quot;image1&quot;,
     *             &quot;Spec&quot;: &quot;1C2G&quot;,
     *             &quot;Command&quot;: &quot;/bin/sh&quot;,
     *             &quot;Args&quot;: &quot;-c hello&quot;,
     *             &quot;ProbeType&quot;: &quot;tcpSocket&quot;,
     *             &quot;ProbeContent&quot;: &quot;{\&quot;Port\&quot;:8080}&quot;
     *       },
     *       {
     *             &quot;Name&quot;: &quot;container2&quot;,
     *             &quot;Image&quot;: &quot;image2&quot;,
     *             &quot;Spec&quot;: &quot;2C4G&quot;,
     *             &quot;ProbeType&quot;: &quot;httpGet&quot;,
     *             &quot;ProbeContent&quot;: &quot;{\&quot;Path\&quot;:\&quot;/\&quot;,\&quot;Port\&quot;:80,\&quot;InitialDelaySeconds\&quot;:10}&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Containers")
    public java.util.List<CreateEdgeContainerAppVersionRequestContainers> containers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verson1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>test app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    public static CreateEdgeContainerAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppVersionRequest self = new CreateEdgeContainerAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEdgeContainerAppVersionRequest setContainers(java.util.List<CreateEdgeContainerAppVersionRequestContainers> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<CreateEdgeContainerAppVersionRequestContainers> getContainers() {
        return this.containers;
    }

    public CreateEdgeContainerAppVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeContainerAppVersionRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public static class CreateEdgeContainerAppVersionRequestContainersACRImageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1500.***.net</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>xcdn-9axbo****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsEnterpriseRegistry")
        public Boolean isEnterpriseRegistry;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>crr-h1ghghu60ct****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <strong>example:</strong>
         * <p>test_71</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <strong>example:</strong>
         * <p>safeline</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <strong>example:</strong>
         * <p>3.40.2</p>
         */
        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagUrl")
        public String tagUrl;

        public static CreateEdgeContainerAppVersionRequestContainersACRImageInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeContainerAppVersionRequestContainersACRImageInfo self = new CreateEdgeContainerAppVersionRequestContainersACRImageInfo();
            return TeaModel.build(map, self);
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setIsEnterpriseRegistry(Boolean isEnterpriseRegistry) {
            this.isEnterpriseRegistry = isEnterpriseRegistry;
            return this;
        }
        public Boolean getIsEnterpriseRegistry() {
            return this.isEnterpriseRegistry;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo setTagUrl(String tagUrl) {
            this.tagUrl = tagUrl;
            return this;
        }
        public String getTagUrl() {
            return this.tagUrl;
        }

    }

    public static class CreateEdgeContainerAppVersionRequestContainersProbeContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>echo ok</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.rewrite.com">www.rewrite.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;Content-Type\&quot;:\&quot;application/json\&quot;}]</p>
         */
        @NameInMap("HttpHeaders")
        public String httpHeaders;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <strong>example:</strong>
         * <p>9991</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateEdgeContainerAppVersionRequestContainersProbeContent build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeContainerAppVersionRequestContainersProbeContent self = new CreateEdgeContainerAppVersionRequestContainersProbeContent();
            return TeaModel.build(map, self);
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setHttpHeaders(String httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public String getHttpHeaders() {
            return this.httpHeaders;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateEdgeContainerAppVersionRequestContainersProbeContent setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class CreateEdgeContainerAppVersionRequestContainers extends TeaModel {
        @NameInMap("ACRImageInfo")
        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo ACRImageInfo;

        @NameInMap("Args")
        public String args;

        @NameInMap("Command")
        public String command;

        @NameInMap("EnvVariables")
        public String envVariables;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shenzhen.aliyuncs.com/lihe<strong><strong>h/ea</strong></strong>ts_serv**<strong>am:3.</strong></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsACRImage")
        public Boolean isACRImage;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lxg-demo-er</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProbeContent")
        public CreateEdgeContainerAppVersionRequestContainersProbeContent probeContent;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Storage")
        public String storage;

        public static CreateEdgeContainerAppVersionRequestContainers build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeContainerAppVersionRequestContainers self = new CreateEdgeContainerAppVersionRequestContainers();
            return TeaModel.build(map, self);
        }

        public CreateEdgeContainerAppVersionRequestContainers setACRImageInfo(CreateEdgeContainerAppVersionRequestContainersACRImageInfo ACRImageInfo) {
            this.ACRImageInfo = ACRImageInfo;
            return this;
        }
        public CreateEdgeContainerAppVersionRequestContainersACRImageInfo getACRImageInfo() {
            return this.ACRImageInfo;
        }

        public CreateEdgeContainerAppVersionRequestContainers setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public CreateEdgeContainerAppVersionRequestContainers setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public CreateEdgeContainerAppVersionRequestContainers setEnvVariables(String envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public String getEnvVariables() {
            return this.envVariables;
        }

        public CreateEdgeContainerAppVersionRequestContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateEdgeContainerAppVersionRequestContainers setIsACRImage(Boolean isACRImage) {
            this.isACRImage = isACRImage;
            return this;
        }
        public Boolean getIsACRImage() {
            return this.isACRImage;
        }

        public CreateEdgeContainerAppVersionRequestContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEdgeContainerAppVersionRequestContainers setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public CreateEdgeContainerAppVersionRequestContainers setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public CreateEdgeContainerAppVersionRequestContainers setProbeContent(CreateEdgeContainerAppVersionRequestContainersProbeContent probeContent) {
            this.probeContent = probeContent;
            return this;
        }
        public CreateEdgeContainerAppVersionRequestContainersProbeContent getProbeContent() {
            return this.probeContent;
        }

        public CreateEdgeContainerAppVersionRequestContainers setProbeType(String probeType) {
            this.probeType = probeType;
            return this;
        }
        public String getProbeType() {
            return this.probeType;
        }

        public CreateEdgeContainerAppVersionRequestContainers setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public CreateEdgeContainerAppVersionRequestContainers setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

    }

}
