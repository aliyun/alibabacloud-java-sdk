// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySummaryExpressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySummaryExpressResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySummaryExpressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySummaryExpressResponseBody self = new QuerySummaryExpressResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySummaryExpressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySummaryExpressResponseBody setData(java.util.List<QuerySummaryExpressResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySummaryExpressResponseBodyData> getData() {
        return this.data;
    }

    public QuerySummaryExpressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySummaryExpressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySummaryExpressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySummaryExpressResponseBodyData extends TeaModel {
        @NameInMap("hot")
        public Boolean hot;

        @NameInMap("latest")
        public Boolean latest;

        @NameInMap("link")
        public String link;

        @NameInMap("title")
        public String title;

        public static QuerySummaryExpressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySummaryExpressResponseBodyData self = new QuerySummaryExpressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySummaryExpressResponseBodyData setHot(Boolean hot) {
            this.hot = hot;
            return this;
        }
        public Boolean getHot() {
            return this.hot;
        }

        public QuerySummaryExpressResponseBodyData setLatest(Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Boolean getLatest() {
            return this.latest;
        }

        public QuerySummaryExpressResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QuerySummaryExpressResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
