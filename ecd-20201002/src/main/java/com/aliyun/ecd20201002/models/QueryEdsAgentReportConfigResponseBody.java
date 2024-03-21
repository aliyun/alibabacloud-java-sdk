// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class QueryEdsAgentReportConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryEdsAgentReportConfigResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryEdsAgentReportConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdsAgentReportConfigResponseBody self = new QueryEdsAgentReportConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdsAgentReportConfigResponseBody setData(QueryEdsAgentReportConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdsAgentReportConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryEdsAgentReportConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryEdsAgentReportConfigResponseBodyData extends TeaModel {
        @NameInMap("Config")
        public String config;

        public static QueryEdsAgentReportConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdsAgentReportConfigResponseBodyData self = new QueryEdsAgentReportConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdsAgentReportConfigResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
