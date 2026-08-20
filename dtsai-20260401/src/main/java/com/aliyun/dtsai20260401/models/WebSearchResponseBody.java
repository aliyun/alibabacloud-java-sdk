// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebSearchResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorMessage Code</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorMessage Example</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The search query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>Spring Boot</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of search results.</p>
     */
    @NameInMap("SearchResult")
    public java.util.List<WebSearchResponseBodySearchResult> searchResult;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalResults")
    public Integer totalResults;

    public static WebSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebSearchResponseBody self = new WebSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public WebSearchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public WebSearchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WebSearchResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public WebSearchResponseBody setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public WebSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebSearchResponseBody setSearchResult(java.util.List<WebSearchResponseBodySearchResult> searchResult) {
        this.searchResult = searchResult;
        return this;
    }
    public java.util.List<WebSearchResponseBodySearchResult> getSearchResult() {
        return this.searchResult;
    }

    public WebSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public WebSearchResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static class WebSearchResponseBodySearchResult extends TeaModel {
        /**
         * <p>The snippet of the web page content.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications.</p>
         */
        @NameInMap("Snippet")
        public String snippet;

        /**
         * <p>The title of the web page.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring Boot</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the web page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/projects/spring-boot">https://xxx/projects/spring-boot</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static WebSearchResponseBodySearchResult build(java.util.Map<String, ?> map) throws Exception {
            WebSearchResponseBodySearchResult self = new WebSearchResponseBodySearchResult();
            return TeaModel.build(map, self);
        }

        public WebSearchResponseBodySearchResult setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

        public WebSearchResponseBodySearchResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public WebSearchResponseBodySearchResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
