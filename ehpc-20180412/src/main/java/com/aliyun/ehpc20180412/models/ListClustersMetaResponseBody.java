// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersMetaResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Clusters")
    public java.util.List<ListClustersMetaResponseBodyClusters> clusters;

    public static ListClustersMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersMetaResponseBody self = new ListClustersMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersMetaResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListClustersMetaResponseBody setClusters(java.util.List<ListClustersMetaResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<ListClustersMetaResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public static class ListClustersMetaResponseBodyClusters extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClientVersion")
        public String clientVersion;

        public static ListClustersMetaResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersMetaResponseBodyClusters self = new ListClustersMetaResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersMetaResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClustersMetaResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersMetaResponseBodyClusters setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListClustersMetaResponseBodyClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClustersMetaResponseBodyClusters setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public ListClustersMetaResponseBodyClusters setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListClustersMetaResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersMetaResponseBodyClusters setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClustersMetaResponseBodyClusters setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListClustersMetaResponseBodyClusters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersMetaResponseBodyClusters setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

    }

}
