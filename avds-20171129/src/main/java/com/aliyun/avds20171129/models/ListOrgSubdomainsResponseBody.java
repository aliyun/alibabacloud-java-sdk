// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgSubdomainsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgSubdomainsResponseBodyRecords> records;

    public static ListOrgSubdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgSubdomainsResponseBody self = new ListOrgSubdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgSubdomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgSubdomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgSubdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgSubdomainsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgSubdomainsResponseBody setRecords(java.util.List<ListOrgSubdomainsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgSubdomainsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgSubdomainsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("Subdomain")
        public String subdomain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgSubdomainsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgSubdomainsResponseBodyRecords self = new ListOrgSubdomainsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgSubdomainsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgSubdomainsResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListOrgSubdomainsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgSubdomainsResponseBodyRecords setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

        public ListOrgSubdomainsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgSubdomainsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
