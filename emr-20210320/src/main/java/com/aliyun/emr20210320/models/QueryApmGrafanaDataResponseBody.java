// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmGrafanaDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryApmGrafanaDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApmGrafanaDataResponseBody self = new QueryApmGrafanaDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApmGrafanaDataResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public QueryApmGrafanaDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Data extends TeaModel {
        @NameInMap("QueryGrafanaData")
        public String queryGrafanaData;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setQueryGrafanaData(String queryGrafanaData) {
            this.queryGrafanaData = queryGrafanaData;
            return this;
        }
        public String getQueryGrafanaData() {
            return this.queryGrafanaData;
        }

    }

}
