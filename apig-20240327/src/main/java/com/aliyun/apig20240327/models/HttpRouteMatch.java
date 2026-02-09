// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpRouteMatch extends TeaModel {
    /**
     * <p>The rules for matching based on HTTP request headers.</p>
     */
    @NameInMap("headers")
    public java.util.List<HttpRouteMatchHeaders> headers;

    /**
     * <p>Specifies whether the path is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreUriCase")
    public Boolean ignoreUriCase;

    /**
     * <p>The HTTP methods.</p>
     */
    @NameInMap("methods")
    public java.util.List<String> methods;

    /**
     * <p>The path rule.</p>
     */
    @NameInMap("path")
    public HttpRouteMatchPath path;

    /**
     * <p>The rules for matching based on query parameters.</p>
     */
    @NameInMap("queryParams")
    public java.util.List<HttpRouteMatchQueryParams> queryParams;

    public static HttpRouteMatch build(java.util.Map<String, ?> map) throws Exception {
        HttpRouteMatch self = new HttpRouteMatch();
        return TeaModel.build(map, self);
    }

    public HttpRouteMatch setHeaders(java.util.List<HttpRouteMatchHeaders> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<HttpRouteMatchHeaders> getHeaders() {
        return this.headers;
    }

    public HttpRouteMatch setIgnoreUriCase(Boolean ignoreUriCase) {
        this.ignoreUriCase = ignoreUriCase;
        return this;
    }
    public Boolean getIgnoreUriCase() {
        return this.ignoreUriCase;
    }

    public HttpRouteMatch setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public HttpRouteMatch setPath(HttpRouteMatchPath path) {
        this.path = path;
        return this;
    }
    public HttpRouteMatchPath getPath() {
        return this.path;
    }

    public HttpRouteMatch setQueryParams(java.util.List<HttpRouteMatchQueryParams> queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public java.util.List<HttpRouteMatchQueryParams> getQueryParams() {
        return this.queryParams;
    }

    public static class HttpRouteMatchHeaders extends TeaModel {
        /**
         * <p>The header name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li>Exact: exact match</li>
         * <li>Prefix: prefix match</li>
         * <li>Regex: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The header value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("value")
        public String value;

        public static HttpRouteMatchHeaders build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteMatchHeaders self = new HttpRouteMatchHeaders();
            return TeaModel.build(map, self);
        }

        public HttpRouteMatchHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteMatchHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpRouteMatchHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HttpRouteMatchPath extends TeaModel {
        /**
         * <p>The path matching type. Valid values:</p>
         * <ul>
         * <li>Exact: exact match</li>
         * <li>Prefix: prefix match</li>
         * <li>Regex: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prefix</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/user</p>
         */
        @NameInMap("value")
        public String value;

        public static HttpRouteMatchPath build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteMatchPath self = new HttpRouteMatchPath();
            return TeaModel.build(map, self);
        }

        public HttpRouteMatchPath setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpRouteMatchPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HttpRouteMatchQueryParams extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li>Exact: exact match</li>
         * <li>Prefix: prefix match</li>
         * <li>Regex: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("value")
        public String value;

        public static HttpRouteMatchQueryParams build(java.util.Map<String, ?> map) throws Exception {
            HttpRouteMatchQueryParams self = new HttpRouteMatchQueryParams();
            return TeaModel.build(map, self);
        }

        public HttpRouteMatchQueryParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpRouteMatchQueryParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpRouteMatchQueryParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
