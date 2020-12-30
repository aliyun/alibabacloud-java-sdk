// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterOperationHostResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ClusterOperationHostList")
    public ListClusterOperationHostResponseBodyClusterOperationHostList clusterOperationHostList;

    public static ListClusterOperationHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationHostResponseBody self = new ListClusterOperationHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationHostResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterOperationHostResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterOperationHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterOperationHostResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterOperationHostResponseBody setClusterOperationHostList(ListClusterOperationHostResponseBodyClusterOperationHostList clusterOperationHostList) {
        this.clusterOperationHostList = clusterOperationHostList;
        return this;
    }
    public ListClusterOperationHostResponseBodyClusterOperationHostList getClusterOperationHostList() {
        return this.clusterOperationHostList;
    }

    public static class ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Percentage")
        public String percentage;

        @NameInMap("HostId")
        public String hostId;

        public static ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost self = new ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

    public static class ListClusterOperationHostResponseBodyClusterOperationHostList extends TeaModel {
        @NameInMap("ClusterOperationHost")
        public java.util.List<ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost> clusterOperationHost;

        public static ListClusterOperationHostResponseBodyClusterOperationHostList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationHostResponseBodyClusterOperationHostList self = new ListClusterOperationHostResponseBodyClusterOperationHostList();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationHostResponseBodyClusterOperationHostList setClusterOperationHost(java.util.List<ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost> clusterOperationHost) {
            this.clusterOperationHost = clusterOperationHost;
            return this;
        }
        public java.util.List<ListClusterOperationHostResponseBodyClusterOperationHostListClusterOperationHost> getClusterOperationHost() {
            return this.clusterOperationHost;
        }

    }

}
