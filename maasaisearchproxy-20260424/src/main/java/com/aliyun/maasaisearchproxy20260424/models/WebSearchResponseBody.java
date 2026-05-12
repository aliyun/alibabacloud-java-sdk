// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class WebSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public WebSearchResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>3b5215d417623961959166934d009a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static WebSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebSearchResponseBody self = new WebSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public WebSearchResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebSearchResponseBody setData(WebSearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public WebSearchResponseBodyData getData() {
        return this.data;
    }

    public WebSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class WebSearchResponseBodyDataResult extends TeaModel {
        @NameInMap("snippet")
        public String snippet;

        /**
         * <strong>example:</strong>
         * <p>4567</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://pai-dlc-proxy-1-cn-wulanchabu.aliyun.com/ray/dashboard/dlc1a9r0uhfn24cl">https://pai-dlc-proxy-1-cn-wulanchabu.aliyun.com/ray/dashboard/dlc1a9r0uhfn24cl</a></p>
         */
        @NameInMap("url")
        public String url;

        public static WebSearchResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            WebSearchResponseBodyDataResult self = new WebSearchResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public WebSearchResponseBodyDataResult setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

        public WebSearchResponseBodyDataResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public WebSearchResponseBodyDataResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class WebSearchResponseBodyData extends TeaModel {
        @NameInMap("result")
        public java.util.List<WebSearchResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total")
        public Integer total;

        public static WebSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            WebSearchResponseBodyData self = new WebSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public WebSearchResponseBodyData setResult(java.util.List<WebSearchResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<WebSearchResponseBodyDataResult> getResult() {
            return this.result;
        }

        public WebSearchResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
