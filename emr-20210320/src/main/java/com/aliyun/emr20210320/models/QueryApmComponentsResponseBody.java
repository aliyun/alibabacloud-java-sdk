// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmComponentsResponseBody extends TeaModel {
    /**
     * <p>Created on 2022/7/11 5:27 PM</p>
     */
    @NameInMap("Data")
    public Data data;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryApmComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApmComponentsResponseBody self = new QueryApmComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApmComponentsResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public QueryApmComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Data extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
