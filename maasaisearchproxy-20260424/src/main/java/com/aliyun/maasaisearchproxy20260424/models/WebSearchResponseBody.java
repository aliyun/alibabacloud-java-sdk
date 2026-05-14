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

    public static class WebSearchResponseBodyDataResultSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>favicon</p>
         */
        @NameInMap("favicon")
        public String favicon;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        public static WebSearchResponseBodyDataResultSource build(java.util.Map<String, ?> map) throws Exception {
            WebSearchResponseBodyDataResultSource self = new WebSearchResponseBodyDataResultSource();
            return TeaModel.build(map, self);
        }

        public WebSearchResponseBodyDataResultSource setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public WebSearchResponseBodyDataResultSource setFavicon(String favicon) {
            this.favicon = favicon;
            return this;
        }
        public String getFavicon() {
            return this.favicon;
        }

        public WebSearchResponseBodyDataResultSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class WebSearchResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1990-01-01 12:00:00</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>snippet</p>
         */
        @NameInMap("snippet")
        public String snippet;

        @NameInMap("source")
        public WebSearchResponseBodyDataResultSource source;

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

        public WebSearchResponseBodyDataResult setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public WebSearchResponseBodyDataResult setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

        public WebSearchResponseBodyDataResult setSource(WebSearchResponseBodyDataResultSource source) {
            this.source = source;
            return this;
        }
        public WebSearchResponseBodyDataResultSource getSource() {
            return this.source;
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
