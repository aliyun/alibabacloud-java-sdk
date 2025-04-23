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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DD517102-B314-4665-BDAC-A32DE7834D02</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The version of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.64</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The mode in which the cluster is deployed. Valid values:</p>
         * <ul>
         * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
         * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterdescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version of E-HPC.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("EhpcVersion")
        public String ehpcVersion;

        /**
         * <p>Indicates whether the cluster uses a plug-in. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasPlugin")
        public Boolean hasPlugin;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether a scaling group is enabled. Valid values:</p>
         * <ul>
         * <li>true: A scaling group is enabled.</li>
         * <li>false: No scaling group is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <ul>
         * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The image tag of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>uninit: The cluster is not initialized.</li>
         * <li>creating: The cluster is being created.</li>
         * <li>init: The cluster is being initialized.</li>
         * <li>running: The cluster is running.</li>
         * <li>exception: The cluster encounters an exception.</li>
         * <li>releasing: The cluster is being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-b3f3edefefeep0760yju****</p>
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
