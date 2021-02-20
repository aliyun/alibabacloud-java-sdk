// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgHostsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgHostsResponseBodyRecords> records;

    public static ListOrgHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgHostsResponseBody self = new ListOrgHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgHostsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgHostsResponseBody setRecords(java.util.List<ListOrgHostsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgHostsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgHostsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("State")
        public String state;

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("OS")
        public String OS;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgHostsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgHostsResponseBodyRecords self = new ListOrgHostsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgHostsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgHostsResponseBodyRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListOrgHostsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgHostsResponseBodyRecords setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public ListOrgHostsResponseBodyRecords setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListOrgHostsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgHostsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListOrgHostsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
