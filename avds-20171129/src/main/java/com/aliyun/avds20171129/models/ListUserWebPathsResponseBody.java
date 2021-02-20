// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserWebPathsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserWebPathsResponseBodyRecords> records;

    public static ListUserWebPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserWebPathsResponseBody self = new ListUserWebPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserWebPathsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserWebPathsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserWebPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserWebPathsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserWebPathsResponseBody setRecords(java.util.List<ListUserWebPathsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserWebPathsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserWebPathsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Site")
        public String site;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Integer id;

        public static ListUserWebPathsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserWebPathsResponseBodyRecords self = new ListUserWebPathsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserWebPathsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserWebPathsResponseBodyRecords setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public ListUserWebPathsResponseBodyRecords setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListUserWebPathsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserWebPathsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
