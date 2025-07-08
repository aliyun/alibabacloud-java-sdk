// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryContactsListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryContactsListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryContactsListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryContactsListNewResponseBody self = new QueryContactsListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryContactsListNewResponseBody setList(java.util.List<QueryContactsListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryContactsListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryContactsListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryContactsListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryContactsListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryContactsListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryContactsListNewResponseBodyList extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenPkgWarning")
        public Integer openPkgWarning;

        @NameInMap("OpenPreventBrushWarning")
        public Integer openPreventBrushWarning;

        @NameInMap("OpenSendWarning")
        public Integer openSendWarning;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("ReceiveSignTemplateAuditResult")
        public Integer receiveSignTemplateAuditResult;

        public static QueryContactsListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryContactsListNewResponseBodyList self = new QueryContactsListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryContactsListNewResponseBodyList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryContactsListNewResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryContactsListNewResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryContactsListNewResponseBodyList setOpenPkgWarning(Integer openPkgWarning) {
            this.openPkgWarning = openPkgWarning;
            return this;
        }
        public Integer getOpenPkgWarning() {
            return this.openPkgWarning;
        }

        public QueryContactsListNewResponseBodyList setOpenPreventBrushWarning(Integer openPreventBrushWarning) {
            this.openPreventBrushWarning = openPreventBrushWarning;
            return this;
        }
        public Integer getOpenPreventBrushWarning() {
            return this.openPreventBrushWarning;
        }

        public QueryContactsListNewResponseBodyList setOpenSendWarning(Integer openSendWarning) {
            this.openSendWarning = openSendWarning;
            return this;
        }
        public Integer getOpenSendWarning() {
            return this.openSendWarning;
        }

        public QueryContactsListNewResponseBodyList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryContactsListNewResponseBodyList setReceiveSignTemplateAuditResult(Integer receiveSignTemplateAuditResult) {
            this.receiveSignTemplateAuditResult = receiveSignTemplateAuditResult;
            return this;
        }
        public Integer getReceiveSignTemplateAuditResult() {
            return this.receiveSignTemplateAuditResult;
        }

    }

}
