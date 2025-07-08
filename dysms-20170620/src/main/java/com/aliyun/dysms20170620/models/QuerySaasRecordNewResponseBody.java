// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySaasRecordNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySaasRecordNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySaasRecordNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasRecordNewResponseBody self = new QuerySaasRecordNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySaasRecordNewResponseBody setList(QuerySaasRecordNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySaasRecordNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySaasRecordNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySaasRecordNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySaasRecordNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySaasRecordNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySaasRecordNewResponseBodyListSaasRecord extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("DetailPkId")
        public Long detailPkId;

        @NameInMap("IndexCol")
        public String indexCol;

        @NameInMap("LastDealDate")
        public String lastDealDate;

        @NameInMap("RecordBizExpireDate")
        public String recordBizExpireDate;

        @NameInMap("Result")
        public String result;

        @NameInMap("ResultDesc")
        public String resultDesc;

        @NameInMap("SaasContent")
        public String saasContent;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QuerySaasRecordNewResponseBodyListSaasRecord build(java.util.Map<String, ?> map) throws Exception {
            QuerySaasRecordNewResponseBodyListSaasRecord self = new QuerySaasRecordNewResponseBodyListSaasRecord();
            return TeaModel.build(map, self);
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setDetailPkId(Long detailPkId) {
            this.detailPkId = detailPkId;
            return this;
        }
        public Long getDetailPkId() {
            return this.detailPkId;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setIndexCol(String indexCol) {
            this.indexCol = indexCol;
            return this;
        }
        public String getIndexCol() {
            return this.indexCol;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setLastDealDate(String lastDealDate) {
            this.lastDealDate = lastDealDate;
            return this;
        }
        public String getLastDealDate() {
            return this.lastDealDate;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setRecordBizExpireDate(String recordBizExpireDate) {
            this.recordBizExpireDate = recordBizExpireDate;
            return this;
        }
        public String getRecordBizExpireDate() {
            return this.recordBizExpireDate;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setResultDesc(String resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }
        public String getResultDesc() {
            return this.resultDesc;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setSaasContent(String saasContent) {
            this.saasContent = saasContent;
            return this;
        }
        public String getSaasContent() {
            return this.saasContent;
        }

        public QuerySaasRecordNewResponseBodyListSaasRecord setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QuerySaasRecordNewResponseBodyList extends TeaModel {
        @NameInMap("SaasRecord")
        public java.util.List<QuerySaasRecordNewResponseBodyListSaasRecord> saasRecord;

        public static QuerySaasRecordNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySaasRecordNewResponseBodyList self = new QuerySaasRecordNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySaasRecordNewResponseBodyList setSaasRecord(java.util.List<QuerySaasRecordNewResponseBodyListSaasRecord> saasRecord) {
            this.saasRecord = saasRecord;
            return this;
        }
        public java.util.List<QuerySaasRecordNewResponseBodyListSaasRecord> getSaasRecord() {
            return this.saasRecord;
        }

    }

}
