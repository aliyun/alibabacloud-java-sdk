// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserDNSMapResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserDNSMapResponseBodyRecords> records;

    public static ListUserDNSMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDNSMapResponseBody self = new ListUserDNSMapResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDNSMapResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserDNSMapResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserDNSMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDNSMapResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserDNSMapResponseBody setRecords(java.util.List<ListUserDNSMapResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserDNSMapResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserDNSMapResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Subdomain")
        public String subdomain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Record")
        public String record;

        @NameInMap("Id")
        public Integer id;

        public static ListUserDNSMapResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserDNSMapResponseBodyRecords self = new ListUserDNSMapResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserDNSMapResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserDNSMapResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserDNSMapResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListUserDNSMapResponseBodyRecords setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

        public ListUserDNSMapResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserDNSMapResponseBodyRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public ListUserDNSMapResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
