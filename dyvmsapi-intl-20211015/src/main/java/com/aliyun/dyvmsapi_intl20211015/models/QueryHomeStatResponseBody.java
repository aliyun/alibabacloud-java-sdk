// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryHomeStatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryHomeStatResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryHomeStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHomeStatResponseBody self = new QueryHomeStatResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHomeStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHomeStatResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryHomeStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHomeStatResponseBody setModel(QueryHomeStatResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryHomeStatResponseBodyModel getModel() {
        return this.model;
    }

    public QueryHomeStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryHomeStatResponseBodyModelList extends TeaModel {
        @NameInMap("CallFailed")
        public Long callFailed;

        @NameInMap("CallSuccess")
        public Long callSuccess;

        @NameInMap("CallTotal")
        public Long callTotal;

        @NameInMap("Date")
        public String date;

        @NameInMap("SuccessRate")
        public Long successRate;

        public static QueryHomeStatResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryHomeStatResponseBodyModelList self = new QueryHomeStatResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public QueryHomeStatResponseBodyModelList setCallFailed(Long callFailed) {
            this.callFailed = callFailed;
            return this;
        }
        public Long getCallFailed() {
            return this.callFailed;
        }

        public QueryHomeStatResponseBodyModelList setCallSuccess(Long callSuccess) {
            this.callSuccess = callSuccess;
            return this;
        }
        public Long getCallSuccess() {
            return this.callSuccess;
        }

        public QueryHomeStatResponseBodyModelList setCallTotal(Long callTotal) {
            this.callTotal = callTotal;
            return this;
        }
        public Long getCallTotal() {
            return this.callTotal;
        }

        public QueryHomeStatResponseBodyModelList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryHomeStatResponseBodyModelList setSuccessRate(Long successRate) {
            this.successRate = successRate;
            return this;
        }
        public Long getSuccessRate() {
            return this.successRate;
        }

    }

    public static class QueryHomeStatResponseBodyModel extends TeaModel {
        @NameInMap("CdrDrUrl")
        public String cdrDrUrl;

        @NameInMap("List")
        public java.util.List<QueryHomeStatResponseBodyModelList> list;

        public static QueryHomeStatResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryHomeStatResponseBodyModel self = new QueryHomeStatResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryHomeStatResponseBodyModel setCdrDrUrl(String cdrDrUrl) {
            this.cdrDrUrl = cdrDrUrl;
            return this;
        }
        public String getCdrDrUrl() {
            return this.cdrDrUrl;
        }

        public QueryHomeStatResponseBodyModel setList(java.util.List<QueryHomeStatResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryHomeStatResponseBodyModelList> getList() {
            return this.list;
        }

    }

}
