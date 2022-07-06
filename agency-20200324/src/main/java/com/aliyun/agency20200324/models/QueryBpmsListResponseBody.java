// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class QueryBpmsListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public QueryBpmsListResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static QueryBpmsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBpmsListResponseBody self = new QueryBpmsListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBpmsListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBpmsListResponseBody setList(QueryBpmsListResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryBpmsListResponseBodyList getList() {
        return this.list;
    }

    public QueryBpmsListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryBpmsListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBpmsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBpmsListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBpmsListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryBpmsListResponseBodyListList extends TeaModel {
        @NameInMap("ApplyRemarks")
        public String applyRemarks;

        @NameInMap("ApplyTime")
        public String applyTime;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerRptType")
        public Integer customerRptType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PartnerPk")
        public Long partnerPk;

        public static QueryBpmsListResponseBodyListList build(java.util.Map<String, ?> map) throws Exception {
            QueryBpmsListResponseBodyListList self = new QueryBpmsListResponseBodyListList();
            return TeaModel.build(map, self);
        }

        public QueryBpmsListResponseBodyListList setApplyRemarks(String applyRemarks) {
            this.applyRemarks = applyRemarks;
            return this;
        }
        public String getApplyRemarks() {
            return this.applyRemarks;
        }

        public QueryBpmsListResponseBodyListList setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public QueryBpmsListResponseBodyListList setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public QueryBpmsListResponseBodyListList setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public QueryBpmsListResponseBodyListList setCustomerRptType(Integer customerRptType) {
            this.customerRptType = customerRptType;
            return this;
        }
        public Integer getCustomerRptType() {
            return this.customerRptType;
        }

        public QueryBpmsListResponseBodyListList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryBpmsListResponseBodyListList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryBpmsListResponseBodyListList setPartnerPk(Long partnerPk) {
            this.partnerPk = partnerPk;
            return this;
        }
        public Long getPartnerPk() {
            return this.partnerPk;
        }

    }

    public static class QueryBpmsListResponseBodyList extends TeaModel {
        @NameInMap("list")
        public java.util.List<QueryBpmsListResponseBodyListList> list;

        public static QueryBpmsListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryBpmsListResponseBodyList self = new QueryBpmsListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryBpmsListResponseBodyList setList(java.util.List<QueryBpmsListResponseBodyListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryBpmsListResponseBodyListList> getList() {
            return this.list;
        }

    }

}
