// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryCardSmsStatisticsResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsResponseBody self = new QueryCardSmsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsStatisticsResponseBody setModel(QueryCardSmsStatisticsResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryCardSmsStatisticsResponseBodyModel getModel() {
        return this.model;
    }

    public QueryCardSmsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsStatisticsResponseBodyModelRecords extends TeaModel {
        @NameInMap("RenderSuccessTotal")
        public Long renderSuccessTotal;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("TmpCode")
        public String tmpCode;

        @NameInMap("TmpName")
        public String tmpName;

        @NameInMap("UrlGenerateTotal")
        public Long urlGenerateTotal;

        public static QueryCardSmsStatisticsResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsResponseBodyModelRecords self = new QueryCardSmsStatisticsResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setRenderSuccessTotal(Long renderSuccessTotal) {
            this.renderSuccessTotal = renderSuccessTotal;
            return this;
        }
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setTmpName(String tmpName) {
            this.tmpName = tmpName;
            return this;
        }
        public String getTmpName() {
            return this.tmpName;
        }

        public QueryCardSmsStatisticsResponseBodyModelRecords setUrlGenerateTotal(Long urlGenerateTotal) {
            this.urlGenerateTotal = urlGenerateTotal;
            return this;
        }
        public Long getUrlGenerateTotal() {
            return this.urlGenerateTotal;
        }

    }

    public static class QueryCardSmsStatisticsResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryCardSmsStatisticsResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryCardSmsStatisticsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsResponseBodyModel self = new QueryCardSmsStatisticsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCardSmsStatisticsResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCardSmsStatisticsResponseBodyModel setRecords(java.util.List<QueryCardSmsStatisticsResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryCardSmsStatisticsResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryCardSmsStatisticsResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
