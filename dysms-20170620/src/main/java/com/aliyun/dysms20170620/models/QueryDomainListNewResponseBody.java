// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDomainListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryDomainListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryDomainListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListNewResponseBody self = new QueryDomainListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainListNewResponseBody setList(java.util.List<QueryDomainListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryDomainListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryDomainListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryDomainListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryDomainListNewResponseBodyList extends TeaModel {
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        public static QueryDomainListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListNewResponseBodyList self = new QueryDomainListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryDomainListNewResponseBodyList setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public QueryDomainListNewResponseBodyList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryDomainListNewResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

    }

}
