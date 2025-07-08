// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDayDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryTmpEffectReportDayDataResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTmpEffectReportDayDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDayDataResponseBody self = new QueryTmpEffectReportDayDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDayDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTmpEffectReportDayDataResponseBody setModel(QueryTmpEffectReportDayDataResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryTmpEffectReportDayDataResponseBodyModel getModel() {
        return this.model;
    }

    public QueryTmpEffectReportDayDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTmpEffectReportDayDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTmpEffectReportDayDataResponseBodyModelRecords extends TeaModel {
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

        @NameInMap("RptSuccessCount")
        public String rptSuccessCount;

        @NameInMap("TmpCode")
        public String tmpCode;

        @NameInMap("TmpName")
        public String tmpName;

        @NameInMap("VendorName")
        public String vendorName;

        public static QueryTmpEffectReportDayDataResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryTmpEffectReportDayDataResponseBodyModelRecords self = new QueryTmpEffectReportDayDataResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setClickPv(String clickPv) {
            this.clickPv = clickPv;
            return this;
        }
        public String getClickPv() {
            return this.clickPv;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setClickUv(String clickUv) {
            this.clickUv = clickUv;
            return this;
        }
        public String getClickUv() {
            return this.clickUv;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setExposePv(String exposePv) {
            this.exposePv = exposePv;
            return this;
        }
        public String getExposePv() {
            return this.exposePv;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setExposeUv(String exposeUv) {
            this.exposeUv = exposeUv;
            return this;
        }
        public String getExposeUv() {
            return this.exposeUv;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setRptSuccessCount(String rptSuccessCount) {
            this.rptSuccessCount = rptSuccessCount;
            return this;
        }
        public String getRptSuccessCount() {
            return this.rptSuccessCount;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setTmpName(String tmpName) {
            this.tmpName = tmpName;
            return this;
        }
        public String getTmpName() {
            return this.tmpName;
        }

        public QueryTmpEffectReportDayDataResponseBodyModelRecords setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

    public static class QueryTmpEffectReportDayDataResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryTmpEffectReportDayDataResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryTmpEffectReportDayDataResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTmpEffectReportDayDataResponseBodyModel self = new QueryTmpEffectReportDayDataResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryTmpEffectReportDayDataResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryTmpEffectReportDayDataResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryTmpEffectReportDayDataResponseBodyModel setRecords(java.util.List<QueryTmpEffectReportDayDataResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryTmpEffectReportDayDataResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryTmpEffectReportDayDataResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
