// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgDNSMapResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgDNSMapResponseBodyRecords> records;

    public static ListOrgDNSMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgDNSMapResponseBody self = new ListOrgDNSMapResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgDNSMapResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgDNSMapResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgDNSMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgDNSMapResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgDNSMapResponseBody setRecords(java.util.List<ListOrgDNSMapResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgDNSMapResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgDNSMapResponseBodyRecords extends TeaModel {
        @NameInMap("Type")
        public String type;

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

        @NameInMap("Record")
        public String record;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgDNSMapResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgDNSMapResponseBodyRecords self = new ListOrgDNSMapResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgDNSMapResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOrgDNSMapResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgDNSMapResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListOrgDNSMapResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgDNSMapResponseBodyRecords setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

        public ListOrgDNSMapResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgDNSMapResponseBodyRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public ListOrgDNSMapResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
