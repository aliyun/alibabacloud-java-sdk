// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryTmpEffectReportDataResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTmpEffectReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDataResponseBody self = new QueryTmpEffectReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTmpEffectReportDataResponseBody setModel(QueryTmpEffectReportDataResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryTmpEffectReportDataResponseBodyModel getModel() {
        return this.model;
    }

    public QueryTmpEffectReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTmpEffectReportDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTmpEffectReportDataResponseBodyModelRecords extends TeaModel {
        @NameInMap("ClickPv")
        public String clickPv;

        @NameInMap("ClickUv")
        public String clickUv;

        @NameInMap("Date")
        public String date;

        @NameInMap("ExposePv")
        public String exposePv;

        @NameInMap("ExposeUv")
        public String exposeUv;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RptSuccessCount")
        public String rptSuccessCount;

        @NameInMap("TmpCode")
        public String tmpCode;

        @NameInMap("TmpName")
        public String tmpName;

        @NameInMap("VendorName")
        public String vendorName;

        public static QueryTmpEffectReportDataResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryTmpEffectReportDataResponseBodyModelRecords self = new QueryTmpEffectReportDataResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setClickPv(String clickPv) {
            this.clickPv = clickPv;
            return this;
        }
        public String getClickPv() {
            return this.clickPv;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setClickUv(String clickUv) {
            this.clickUv = clickUv;
            return this;
        }
        public String getClickUv() {
            return this.clickUv;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setExposePv(String exposePv) {
            this.exposePv = exposePv;
            return this;
        }
        public String getExposePv() {
            return this.exposePv;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setExposeUv(String exposeUv) {
            this.exposeUv = exposeUv;
            return this;
        }
        public String getExposeUv() {
            return this.exposeUv;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setRptSuccessCount(String rptSuccessCount) {
            this.rptSuccessCount = rptSuccessCount;
            return this;
        }
        public String getRptSuccessCount() {
            return this.rptSuccessCount;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setTmpName(String tmpName) {
            this.tmpName = tmpName;
            return this;
        }
        public String getTmpName() {
            return this.tmpName;
        }

        public QueryTmpEffectReportDataResponseBodyModelRecords setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

    public static class QueryTmpEffectReportDataResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryTmpEffectReportDataResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryTmpEffectReportDataResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTmpEffectReportDataResponseBodyModel self = new QueryTmpEffectReportDataResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryTmpEffectReportDataResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryTmpEffectReportDataResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryTmpEffectReportDataResponseBodyModel setRecords(java.util.List<QueryTmpEffectReportDataResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryTmpEffectReportDataResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryTmpEffectReportDataResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
