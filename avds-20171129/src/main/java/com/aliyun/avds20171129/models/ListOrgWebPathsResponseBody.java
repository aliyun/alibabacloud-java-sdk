// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgWebPathsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgWebPathsResponseBodyRecords> records;

    public static ListOrgWebPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgWebPathsResponseBody self = new ListOrgWebPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgWebPathsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgWebPathsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgWebPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgWebPathsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgWebPathsResponseBody setRecords(java.util.List<ListOrgWebPathsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgWebPathsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgWebPathsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("Site")
        public String site;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgWebPathsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgWebPathsResponseBodyRecords self = new ListOrgWebPathsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgWebPathsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgWebPathsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgWebPathsResponseBodyRecords setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public ListOrgWebPathsResponseBodyRecords setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListOrgWebPathsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgWebPathsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
