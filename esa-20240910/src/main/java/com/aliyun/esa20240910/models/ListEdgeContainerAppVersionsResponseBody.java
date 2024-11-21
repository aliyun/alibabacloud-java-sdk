// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppVersionsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The versions.</p>
     */
    @NameInMap("Versions")
    public java.util.List<ListEdgeContainerAppVersionsResponseBodyVersions> versions;

    public static ListEdgeContainerAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppVersionsResponseBody self = new ListEdgeContainerAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeContainerAppVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeContainerAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeContainerAppVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEdgeContainerAppVersionsResponseBody setVersions(java.util.List<ListEdgeContainerAppVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListEdgeContainerAppVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent extends TeaModel {
        /**
         * <p>The probe command.</p>
         * 
         * <strong>example:</strong>
         * <p>openresty -g  &quot;daemon off;</p>
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
         * <p>{\&quot;Content-Type\&quot;:\&quot;application/json\&quot;}</p>
         */
        @NameInMap("HttpHeaders")
        public String httpHeaders;

        /**
         * <p>The latency for container probe initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The port of the container health check.</p>
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
         * <p>30</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent self = new ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setHttpHeaders(String httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public String getHttpHeaders() {
            return this.httpHeaders;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class ListEdgeContainerAppVersionsResponseBodyVersionsContainers extends TeaModel {
        /**
         * <p>The arguments that are passed to the container startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>-c a=1</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The command that is used to start the container.</p>
         * 
         * <strong>example:</strong>
         * <p>openresty -g \&quot;daemon off;\&quot;</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The environment variables of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>ENV=prod</p>
         */
        @NameInMap("EnvVariables")
        public String envVariables;

        /**
         * <p>The address of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>container1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The command that is run before the container is started. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\\]}}</code>.</p>
         * <p>If you want to cancel this configuration, set the parameter value to <code>&quot;&quot;</code> or <code>{}</code>. If you do not specify this parameter, this configuration is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;bash\&quot;,\&quot;-c\&quot;,\&quot;cd /home/admin/</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The command that is run before the container is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>sh stop.sh</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The container probe content.</p>
         */
        @NameInMap("ProbeContent")
        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent probeContent;

        /**
         * <p>The probe type of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>httpGet</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>The compute specification of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1C2G</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static ListEdgeContainerAppVersionsResponseBodyVersionsContainers build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppVersionsResponseBodyVersionsContainers self = new ListEdgeContainerAppVersionsResponseBodyVersionsContainers();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setEnvVariables(String envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public String getEnvVariables() {
            return this.envVariables;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setProbeContent(ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent probeContent) {
            this.probeContent = probeContent;
            return this;
        }
        public ListEdgeContainerAppVersionsResponseBodyVersionsContainersProbeContent getProbeContent() {
            return this.probeContent;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setProbeType(String probeType) {
            this.probeType = probeType;
            return this;
        }
        public String getProbeType() {
            return this.probeType;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersionsContainers setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListEdgeContainerAppVersionsResponseBodyVersions extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The containers in the version.</p>
         */
        @NameInMap("Containers")
        public java.util.List<ListEdgeContainerAppVersionsResponseBodyVersionsContainers> containers;

        /**
         * <p>The time when the version was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-10T02:53:16Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the version was last released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-10T02:48:36Z</p>
         */
        @NameInMap("LastPublishTime")
        public String lastPublishTime;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>version01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the version was released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-10T02:48:36Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test version</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The status of the current version. Valid values:</p>
         * <ul>
         * <li><strong>created</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>creating</strong></li>
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
         * <p>2023-04-16 10:51:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-87962637161651****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ListEdgeContainerAppVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppVersionsResponseBodyVersions self = new ListEdgeContainerAppVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setContainers(java.util.List<ListEdgeContainerAppVersionsResponseBodyVersionsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<ListEdgeContainerAppVersionsResponseBodyVersionsContainers> getContainers() {
            return this.containers;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setLastPublishTime(String lastPublishTime) {
            this.lastPublishTime = lastPublishTime;
            return this;
        }
        public String getLastPublishTime() {
            return this.lastPublishTime;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListEdgeContainerAppVersionsResponseBodyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
