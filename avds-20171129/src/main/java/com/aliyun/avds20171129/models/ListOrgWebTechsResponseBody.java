// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgWebTechsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgWebTechsResponseBodyRecords> records;

    public static ListOrgWebTechsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgWebTechsResponseBody self = new ListOrgWebTechsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgWebTechsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgWebTechsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgWebTechsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgWebTechsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgWebTechsResponseBody setRecords(java.util.List<ListOrgWebTechsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgWebTechsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgWebTechsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("PoweredBy")
        public String poweredBy;

        @NameInMap("Version")
        public String version;

        @NameInMap("OrgId")
        public Integer orgId;

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

        public static ListOrgWebTechsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgWebTechsResponseBodyRecords self = new ListOrgWebTechsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgWebTechsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgWebTechsResponseBodyRecords setPoweredBy(String poweredBy) {
            this.poweredBy = poweredBy;
            return this;
        }
        public String getPoweredBy() {
            return this.poweredBy;
        }

        public ListOrgWebTechsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListOrgWebTechsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgWebTechsResponseBodyRecords setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public ListOrgWebTechsResponseBodyRecords setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public ListOrgWebTechsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgWebTechsResponseBodyRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListOrgWebTechsResponseBodyRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOrgWebTechsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
