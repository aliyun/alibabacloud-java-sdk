// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserHostsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserHostsResponseBodyRecords> records;

    public static ListUserHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserHostsResponseBody self = new ListUserHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserHostsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserHostsResponseBody setRecords(java.util.List<ListUserHostsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserHostsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserHostsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("OS")
        public String OS;

        @NameInMap("State")
        public String state;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Id")
        public Integer id;

        public static ListUserHostsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserHostsResponseBodyRecords self = new ListUserHostsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserHostsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserHostsResponseBodyRecords setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public ListUserHostsResponseBodyRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListUserHostsResponseBodyRecords setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListUserHostsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserHostsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListUserHostsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
