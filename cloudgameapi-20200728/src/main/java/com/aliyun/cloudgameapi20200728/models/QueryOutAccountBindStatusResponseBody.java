// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOutAccountBindStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryOutAccountBindStatusResponseBodyData data;

    public static QueryOutAccountBindStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutAccountBindStatusResponseBody self = new QueryOutAccountBindStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutAccountBindStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOutAccountBindStatusResponseBody setData(QueryOutAccountBindStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOutAccountBindStatusResponseBodyData getData() {
        return this.data;
    }

    public static class QueryOutAccountBindStatusResponseBodyData extends TeaModel {
        @NameInMap("BindStatus")
        public Integer bindStatus;

        public static QueryOutAccountBindStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutAccountBindStatusResponseBodyData self = new QueryOutAccountBindStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOutAccountBindStatusResponseBodyData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

    }

}
