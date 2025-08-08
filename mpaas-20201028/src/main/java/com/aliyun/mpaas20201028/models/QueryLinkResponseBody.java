// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D9B3C4E7-BEC7-1E2C-86A3-EA985B4FFD73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryLinkResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{
         *             &quot;Modified&quot;: &quot;2024-04-29 16:35:55&quot;,
         *             &quot;NeedRenderEvent&quot;: false,
         *             &quot;WorkspaceId&quot;: &quot;default&quot;,
         *             &quot;Cors&quot;: false,
         *             &quot;Url&quot;: &quot;<a href="https://xxx/xxx">https://xxx/xxx</a>&quot;,
         *             &quot;Created&quot;: &quot;2024-04-29 16:35:55&quot;,
         *             &quot;LastModified&quot;: &quot;2024-04-29 16:35:55&quot;,
         *             &quot;Target&quot;: &quot;<a href="http://xxx/test.html">http://xxx/test.html</a>&quot;,
         *             &quot;Dynamictarget&quot;: &quot;&quot;,
         *             &quot;AppId&quot;: &quot;BB5953C300957&quot;,
         *             &quot;Version&quot;: 0,
         *             &quot;Traceid&quot;: &quot;f6c95f06891a19ff2d896ea309581883&quot;,
         *             &quot;Domain&quot;: &quot;u.aliyuncs.com&quot;
         *         }</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/xxx/xxx">https://xxx/xxx/xxx</a></p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
