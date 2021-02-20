// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserWebTechsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserWebTechsResponseBodyRecords> records;

    public static ListUserWebTechsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserWebTechsResponseBody self = new ListUserWebTechsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserWebTechsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserWebTechsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserWebTechsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserWebTechsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserWebTechsResponseBody setRecords(java.util.List<ListUserWebTechsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserWebTechsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserWebTechsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("PoweredBy")
        public String poweredBy;

        @NameInMap("Version")
        public String version;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Server")
        public String server;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        public static ListUserWebTechsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserWebTechsResponseBodyRecords self = new ListUserWebTechsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserWebTechsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserWebTechsResponseBodyRecords setPoweredBy(String poweredBy) {
            this.poweredBy = poweredBy;
            return this;
        }
        public String getPoweredBy() {
            return this.poweredBy;
        }

        public ListUserWebTechsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListUserWebTechsResponseBodyRecords setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public ListUserWebTechsResponseBodyRecords setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public ListUserWebTechsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserWebTechsResponseBodyRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListUserWebTechsResponseBodyRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserWebTechsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
