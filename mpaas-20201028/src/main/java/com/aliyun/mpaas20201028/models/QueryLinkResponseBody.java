// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryLinkResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkResponseBody self = new QueryLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkResponseBody setResultContent(QueryLinkResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryLinkResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryLinkResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryLinkResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public Object data;

        @NameInMap("Target")
        public String target;

        @NameInMap("Version")
        public String version;

        public static QueryLinkResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkResponseBodyResultContent self = new QueryLinkResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryLinkResponseBodyResultContent setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public QueryLinkResponseBodyResultContent setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public QueryLinkResponseBodyResultContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
