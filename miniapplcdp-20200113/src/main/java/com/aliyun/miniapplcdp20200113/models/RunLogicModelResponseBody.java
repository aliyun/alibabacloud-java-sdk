// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class RunLogicModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public RunLogicModelResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RunLogicModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunLogicModelResponseBody self = new RunLogicModelResponseBody();
        return TeaModel.build(map, self);
    }

    public RunLogicModelResponseBody setData(RunLogicModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunLogicModelResponseBodyData getData() {
        return this.data;
    }

    public RunLogicModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunLogicModelResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

        @NameInMap("Status")
        public Integer status;

        public static RunLogicModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunLogicModelResponseBodyData self = new RunLogicModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunLogicModelResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public RunLogicModelResponseBodyData setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public RunLogicModelResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
