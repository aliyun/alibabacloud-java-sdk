// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserSubdomainsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserSubdomainsResponseBodyRecords> records;

    public static ListUserSubdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSubdomainsResponseBody self = new ListUserSubdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSubdomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserSubdomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserSubdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserSubdomainsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserSubdomainsResponseBody setRecords(java.util.List<ListUserSubdomainsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserSubdomainsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserSubdomainsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Subdomain")
        public String subdomain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Integer id;

        public static ListUserSubdomainsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserSubdomainsResponseBodyRecords self = new ListUserSubdomainsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserSubdomainsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserSubdomainsResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListUserSubdomainsResponseBodyRecords setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

        public ListUserSubdomainsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserSubdomainsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
