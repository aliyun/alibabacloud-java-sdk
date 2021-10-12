// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOutAccountBindStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryOutAccountBindStatusResponseData data;

    public static QueryOutAccountBindStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutAccountBindStatusResponse self = new QueryOutAccountBindStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutAccountBindStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOutAccountBindStatusResponse setData(QueryOutAccountBindStatusResponseData data) {
        this.data = data;
        return this;
    }
    public QueryOutAccountBindStatusResponseData getData() {
        return this.data;
    }

    public static class QueryOutAccountBindStatusResponseData extends TeaModel {
        @NameInMap("BindStatus")
        @Validation(required = true)
        public Integer bindStatus;

        public static QueryOutAccountBindStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutAccountBindStatusResponseData self = new QueryOutAccountBindStatusResponseData();
            return TeaModel.build(map, self);
        }

        public QueryOutAccountBindStatusResponseData setBindStatus(Integer bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public Integer getBindStatus() {
            return this.bindStatus;
        }

    }

}
