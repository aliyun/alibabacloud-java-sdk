// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QuerySignByParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("data")
    public QuerySignByParamResponseBodyData data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static QuerySignByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySignByParamResponseBody self = new QuerySignByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySignByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySignByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySignByParamResponseBody setData(QuerySignByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySignByParamResponseBodyData getData() {
        return this.data;
    }

    public QuerySignByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class QuerySignByParamResponseBodyDataSign extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SignId")
        public Long signId;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("RejectInfo")
        public String rejectInfo;

        @NameInMap("SignType")
        public String signType;

        public static QuerySignByParamResponseBodyDataSign build(java.util.Map<String, ?> map) throws Exception {
            QuerySignByParamResponseBodyDataSign self = new QuerySignByParamResponseBodyDataSign();
            return TeaModel.build(map, self);
        }

        public QuerySignByParamResponseBodyDataSign setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySignByParamResponseBodyDataSign setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySignByParamResponseBodyDataSign setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySignByParamResponseBodyDataSign setSignId(Long signId) {
            this.signId = signId;
            return this;
        }
        public Long getSignId() {
            return this.signId;
        }

        public QuerySignByParamResponseBodyDataSign setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QuerySignByParamResponseBodyDataSign setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySignByParamResponseBodyDataSign setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public QuerySignByParamResponseBodyDataSign setSignType(String signType) {
            this.signType = signType;
            return this;
        }
        public String getSignType() {
            return this.signType;
        }

    }

    public static class QuerySignByParamResponseBodyData extends TeaModel {
        @NameInMap("sign")
        public java.util.List<QuerySignByParamResponseBodyDataSign> sign;

        public static QuerySignByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySignByParamResponseBodyData self = new QuerySignByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySignByParamResponseBodyData setSign(java.util.List<QuerySignByParamResponseBodyDataSign> sign) {
            this.sign = sign;
            return this;
        }
        public java.util.List<QuerySignByParamResponseBodyDataSign> getSign() {
            return this.sign;
        }

    }

}
