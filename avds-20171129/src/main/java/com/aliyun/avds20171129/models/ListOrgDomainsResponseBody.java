// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgDomainsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgDomainsResponseBodyRecords> records;

    public static ListOrgDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgDomainsResponseBody self = new ListOrgDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgDomainsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgDomainsResponseBody setRecords(java.util.List<ListOrgDomainsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgDomainsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgDomainsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgDomainsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgDomainsResponseBodyRecords self = new ListOrgDomainsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgDomainsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgDomainsResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListOrgDomainsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgDomainsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgDomainsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
