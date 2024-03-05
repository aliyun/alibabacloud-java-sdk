// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersMetaResponseBody extends TeaModel {
    /**
     * <p>The list of clusters.</p>
     */
    @NameInMap("Clusters")
    public ListClustersMetaResponseBodyClusters clusters;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values: 1 to 50.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersMetaResponseBody self = new ListClustersMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersMetaResponseBody setClusters(ListClustersMetaResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClustersMetaResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListClustersMetaResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersMetaResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersMetaResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClustersMetaResponseBodyClustersClusterInfoSimple extends TeaModel {
        /**
         * <p>The server type of the account. Valid values:</p>
         * <br>
         * <p>*   nis</p>
         * <p>*   ldap</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The version of the client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The mode in which the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</p>
         * <p>*   Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version of E-HPC.</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        /**
         * <p>Indicates whether the cluster uses a plug-in. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false</p>
         */
        @NameInMap("HasPlugin")
        public Boolean hasPlugin;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether a scaling group is enabled. Valid values:</p>
         * <br>
         * <p>*   true: A scaling group is enabled.</p>
         * <p>*   false: No scaling group is enabled.</p>
         */
        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The cluster is deployed on a hybrid cloud.</p>
         * <p>*   PublicCloud: The cluster is deployed on a public cloud.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The image tag of the operating system.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   slurm</p>
         * <p>*   opengridscheduler</p>
         * <p>*   deadline</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   uninit: The cluster is not initialized.</p>
         * <p>*   creating: The cluster is being created.</p>
         * <p>*   init: The cluster is being initialized.</p>
         * <p>*   running: The cluster is running.</p>
         * <p>*   exception: The cluster encounters an exception.</p>
         * <p>*   releasing: The cluster is being released.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListClustersMetaResponseBodyClustersClusterInfoSimple build(java.util.Map<String, ?> map) throws Exception {
            ListClustersMetaResponseBodyClustersClusterInfoSimple self = new ListClustersMetaResponseBodyClustersClusterInfoSimple();
            return TeaModel.build(map, self);
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setEhpcVersion(String ehpcVersion) {
            this.ehpcVersion = ehpcVersion;
            return this;
        }
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setHasPlugin(Boolean hasPlugin) {
            this.hasPlugin = hasPlugin;
            return this;
        }
        public Boolean getHasPlugin() {
            return this.hasPlugin;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setIsComputeEss(Boolean isComputeEss) {
            this.isComputeEss = isComputeEss;
            return this;
        }
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListClustersMetaResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfoSimple")
        public java.util.List<ListClustersMetaResponseBodyClustersClusterInfoSimple> clusterInfoSimple;

        public static ListClustersMetaResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersMetaResponseBodyClusters self = new ListClustersMetaResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersMetaResponseBodyClusters setClusterInfoSimple(java.util.List<ListClustersMetaResponseBodyClustersClusterInfoSimple> clusterInfoSimple) {
            this.clusterInfoSimple = clusterInfoSimple;
            return this;
        }
        public java.util.List<ListClustersMetaResponseBodyClustersClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

    }

}
