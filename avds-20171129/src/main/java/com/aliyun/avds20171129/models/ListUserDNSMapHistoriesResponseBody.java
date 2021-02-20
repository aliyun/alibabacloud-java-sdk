// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserDNSMapHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserDNSMapHistoriesResponseBodyRecords> records;

    public static ListUserDNSMapHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDNSMapHistoriesResponseBody self = new ListUserDNSMapHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDNSMapHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserDNSMapHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserDNSMapHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDNSMapHistoriesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserDNSMapHistoriesResponseBody setRecords(java.util.List<ListUserDNSMapHistoriesResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserDNSMapHistoriesResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserDNSMapHistoriesResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Subdomain")
        public String subdomain;

        @NameInMap("Record")
        public String record;

        @NameInMap("TaskId")
        public Integer taskId;

        public static ListUserDNSMapHistoriesResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserDNSMapHistoriesResponseBodyRecords self = new ListUserDNSMapHistoriesResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setSubdomain(String subdomain) {
            this.subdomain = subdomain;
            return this;
        }
        public String getSubdomain() {
            return this.subdomain;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public ListUserDNSMapHistoriesResponseBodyRecords setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
