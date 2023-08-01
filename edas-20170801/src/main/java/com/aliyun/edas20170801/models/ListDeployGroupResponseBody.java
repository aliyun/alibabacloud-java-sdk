// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDeployGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the instance group in which the application is deployed.</p>
     */
    @NameInMap("DeployGroupList")
    public ListDeployGroupResponseBodyDeployGroupList deployGroupList;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeployGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployGroupResponseBody self = new ListDeployGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeployGroupResponseBody setDeployGroupList(ListDeployGroupResponseBodyDeployGroupList deployGroupList) {
        this.deployGroupList = deployGroupList;
        return this;
    }
    public ListDeployGroupResponseBodyDeployGroupList getDeployGroupList() {
        return this.deployGroupList;
    }

    public ListDeployGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeployGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeployGroupResponseBodyDeployGroupListDeployGroup extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the change process for application deployment in the instance group.</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The name of the basic component.</p>
         */
        @NameInMap("BaseComponentMetaName")
        public String baseComponentMetaName;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The maximum number of CPU cores allowed for each application instance when the application is running.</p>
         */
        @NameInMap("CpuLimit")
        public String cpuLimit;

        /**
         * <p>The number of CPU cores requested for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.</p>
         */
        @NameInMap("CpuRequest")
        public String cpuRequest;

        /**
         * <p>The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The name of the deployment.</p>
         */
        @NameInMap("DeploymentName")
        public String deploymentName;

        /**
         * <p>The ID of the ACK cluster.</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
         */
        @NameInMap("EphemeralStorageLimit")
        public String ephemeralStorageLimit;

        /**
         * <p>The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
         */
        @NameInMap("EphemeralStorageRequest")
        public String ephemeralStorageRequest;

        /**
         * <p>The ID of the instance group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the instance group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the instance group. Valid values:</p>
         * <br>
         * <p>*   0: default group.</p>
         * <p>*   1: Canary release is disabled for traffic management.</p>
         * <p>*   2: Canary release is enabled for traffic management.</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The time when the application was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.</p>
         */
        @NameInMap("MemoryLimit")
        public String memoryLimit;

        /**
         * <p>The size of memory requested for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.</p>
         */
        @NameInMap("MemoryRequest")
        public String memoryRequest;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("NameSpace")
        public String nameSpace;

        /**
         * <p>The external download URL of the deployment package.</p>
         */
        @NameInMap("PackagePublicUrl")
        public String packagePublicUrl;

        /**
         * <p>The URL of the deployment package.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package.</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
         */
        @NameInMap("PackageVersionId")
        public String packageVersionId;

        /**
         * <p>The post-start script.</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The pre-stop script.</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The version of the application. The value progressively increases in the range of 0 to 7.</p>
         */
        @NameInMap("Reversion")
        public String reversion;

        /**
         * <p>The ID of the application deployed in the ACK cluster in Enterprise Distributed Application Service (EDAS).</p>
         */
        @NameInMap("Selector")
        public String selector;

        /**
         * <p>The state of the application instance group. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The throttling policy. This parameter is reserved.</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        /**
         * <p>The time when the application was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the vServer group of the Internet-facing SLB instance associated with the instance group.</p>
         */
        @NameInMap("VExtServerGroupId")
        public String VExtServerGroupId;

        /**
         * <p>The ID of the vServer group of the internal-facing Server Load Balancer (SLB) instance associated with the instance group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static ListDeployGroupResponseBodyDeployGroupListDeployGroup build(java.util.Map<String, ?> map) throws Exception {
            ListDeployGroupResponseBodyDeployGroupListDeployGroup self = new ListDeployGroupResponseBodyDeployGroupListDeployGroup();
            return TeaModel.build(map, self);
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setBaseComponentMetaName(String baseComponentMetaName) {
            this.baseComponentMetaName = baseComponentMetaName;
            return this;
        }
        public String getBaseComponentMetaName() {
            return this.baseComponentMetaName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEphemeralStorageLimit(String ephemeralStorageLimit) {
            this.ephemeralStorageLimit = ephemeralStorageLimit;
            return this;
        }
        public String getEphemeralStorageLimit() {
            return this.ephemeralStorageLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setEphemeralStorageRequest(String ephemeralStorageRequest) {
            this.ephemeralStorageRequest = ephemeralStorageRequest;
            return this;
        }
        public String getEphemeralStorageRequest() {
            return this.ephemeralStorageRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackagePublicUrl(String packagePublicUrl) {
            this.packagePublicUrl = packagePublicUrl;
            return this;
        }
        public String getPackagePublicUrl() {
            return this.packagePublicUrl;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setReversion(String reversion) {
            this.reversion = reversion;
            return this;
        }
        public String getReversion() {
            return this.reversion;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setVExtServerGroupId(String VExtServerGroupId) {
            this.VExtServerGroupId = VExtServerGroupId;
            return this;
        }
        public String getVExtServerGroupId() {
            return this.VExtServerGroupId;
        }

        public ListDeployGroupResponseBodyDeployGroupListDeployGroup setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class ListDeployGroupResponseBodyDeployGroupList extends TeaModel {
        @NameInMap("DeployGroup")
        public java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> deployGroup;

        public static ListDeployGroupResponseBodyDeployGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListDeployGroupResponseBodyDeployGroupList self = new ListDeployGroupResponseBodyDeployGroupList();
            return TeaModel.build(map, self);
        }

        public ListDeployGroupResponseBodyDeployGroupList setDeployGroup(java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> deployGroup) {
            this.deployGroup = deployGroup;
            return this;
        }
        public java.util.List<ListDeployGroupResponseBodyDeployGroupListDeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

    }

}
