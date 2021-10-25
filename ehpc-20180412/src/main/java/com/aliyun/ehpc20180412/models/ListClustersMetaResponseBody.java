// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersMetaResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Clusters")
    public ListClustersMetaResponseBodyClusters clusters;

    public static ListClustersMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersMetaResponseBody self = new ListClustersMetaResponseBody();
        return TeaModel.build(map, self);
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

    public ListClustersMetaResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersMetaResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClustersMetaResponseBody setClusters(ListClustersMetaResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClustersMetaResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class ListClustersMetaResponseBodyClustersClusterInfoSimple extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("IsComputeEss")
        public Boolean isComputeEss;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Location")
        public String location;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static ListClustersMetaResponseBodyClustersClusterInfoSimple build(java.util.Map<String, ?> map) throws Exception {
            ListClustersMetaResponseBodyClustersClusterInfoSimple self = new ListClustersMetaResponseBodyClustersClusterInfoSimple();
            return TeaModel.build(map, self);
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

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setIsComputeEss(Boolean isComputeEss) {
            this.isComputeEss = isComputeEss;
            return this;
        }
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListClustersMetaResponseBodyClustersClusterInfoSimple setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
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
