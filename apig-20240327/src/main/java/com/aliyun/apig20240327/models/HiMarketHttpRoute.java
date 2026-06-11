// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketHttpRoute extends TeaModel {
    /**
     * <p>Indicates whether this is a system-defined route. Users cannot modify or delete built-in routes. Defaults to <code>false</code>.</p>
     */
    @NameInMap("builtin")
    public Boolean builtin;

    /**
     * <p>An optional description for the HTTP route. This field is for informational purposes only.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>A list of hostnames to which this route applies. The request\&quot;s <code>Host</code> header must match one of the hostnames in this list.</p>
     */
    @NameInMap("domains")
    public java.util.List<HiMarketDomain> domains;

    /**
     * <p>Defines the matching criteria for an incoming HTTP request. The request must meet all specified conditions for this route to apply.</p>
     */
    @NameInMap("match")
    public HiMarketHttpRouteMatch match;

    public static HiMarketHttpRoute build(java.util.Map<String, ?> map) throws Exception {
        HiMarketHttpRoute self = new HiMarketHttpRoute();
        return TeaModel.build(map, self);
    }

    public HiMarketHttpRoute setBuiltin(Boolean builtin) {
        this.builtin = builtin;
        return this;
    }
    public Boolean getBuiltin() {
        return this.builtin;
    }

    public HiMarketHttpRoute setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HiMarketHttpRoute setDomains(java.util.List<HiMarketDomain> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<HiMarketDomain> getDomains() {
        return this.domains;
    }

    public HiMarketHttpRoute setMatch(HiMarketHttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HiMarketHttpRouteMatch getMatch() {
        return this.match;
    }

    public static class HiMarketHttpRouteMatchHeaders extends TeaModel {
        /**
         * <p>Specifies whether the header match is case-sensitive. Defaults to <code>true</code>.</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>The name of the HTTP header to match, such as <code>Content-Type</code>.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of header match. Valid values are <code>Exact</code> and <code>RegularExpression</code>. Defaults to <code>Exact</code>.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value to match against the header. The match <code>type</code> determines how this value is interpreted.</p>
         */
        @NameInMap("value")
        public String value;

        public static HiMarketHttpRouteMatchHeaders build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHttpRouteMatchHeaders self = new HiMarketHttpRouteMatchHeaders();
            return TeaModel.build(map, self);
        }

        public HiMarketHttpRouteMatchHeaders setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public HiMarketHttpRouteMatchHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HiMarketHttpRouteMatchHeaders setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HiMarketHttpRouteMatchHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HiMarketHttpRouteMatchModelMatches extends TeaModel {
        /**
         * <p>Specifies whether the model field match is case-sensitive. Defaults to <code>true</code>.</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>The name of the model field to match.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of match, such as <code>Exact</code>, <code>Pattern</code>, or <code>Range</code>.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value or pattern to match against the model field.</p>
         */
        @NameInMap("value")
        public String value;

        public static HiMarketHttpRouteMatchModelMatches build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHttpRouteMatchModelMatches self = new HiMarketHttpRouteMatchModelMatches();
            return TeaModel.build(map, self);
        }

        public HiMarketHttpRouteMatchModelMatches setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public HiMarketHttpRouteMatchModelMatches setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HiMarketHttpRouteMatchModelMatches setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HiMarketHttpRouteMatchModelMatches setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HiMarketHttpRouteMatchPath extends TeaModel {
        /**
         * <p>Specifies whether the path match is case-sensitive. Defaults to <code>true</code>.</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>The type of path match. Valid values are <code>Exact</code> and <code>Prefix</code>. Defaults to <code>Exact</code> if not specified.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The path value to match. The specified <code>type</code> determines how this value is interpreted.</p>
         */
        @NameInMap("value")
        public String value;

        public static HiMarketHttpRouteMatchPath build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHttpRouteMatchPath self = new HiMarketHttpRouteMatchPath();
            return TeaModel.build(map, self);
        }

        public HiMarketHttpRouteMatchPath setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public HiMarketHttpRouteMatchPath setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HiMarketHttpRouteMatchPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HiMarketHttpRouteMatchQueryParams extends TeaModel {
        /**
         * <p>Specifies whether the query parameter match is case-sensitive. Defaults to <code>true</code>.</p>
         */
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        /**
         * <p>The name of the query parameter to match.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of query parameter match. Valid values are <code>Exact</code> and <code>RegularExpression</code>. Defaults to <code>Exact</code>.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value to match against the query parameter. The match <code>type</code> determines how this value is interpreted.</p>
         */
        @NameInMap("value")
        public String value;

        public static HiMarketHttpRouteMatchQueryParams build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHttpRouteMatchQueryParams self = new HiMarketHttpRouteMatchQueryParams();
            return TeaModel.build(map, self);
        }

        public HiMarketHttpRouteMatchQueryParams setCaseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        public HiMarketHttpRouteMatchQueryParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HiMarketHttpRouteMatchQueryParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HiMarketHttpRouteMatchQueryParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HiMarketHttpRouteMatch extends TeaModel {
        /**
         * <p>A list of HTTP header match conditions. The request must match all of these conditions.</p>
         */
        @NameInMap("headers")
        public java.util.List<HiMarketHttpRouteMatchHeaders> headers;

        /**
         * <p>A list of HTTP methods to match, such as <code>GET</code> or <code>POST</code>. If this field is not specified, the route matches requests with any HTTP method.</p>
         */
        @NameInMap("methods")
        public java.util.List<String> methods;

        /**
         * <p>A list of conditions for matching against a data model. Use this to validate the request body or other structured data.</p>
         */
        @NameInMap("modelMatches")
        public java.util.List<HiMarketHttpRouteMatchModelMatches> modelMatches;

        /**
         * <p>Specifies the conditions for matching the request path.</p>
         */
        @NameInMap("path")
        public HiMarketHttpRouteMatchPath path;

        /**
         * <p>A list of URL query parameter match conditions. The request must match all of these conditions.</p>
         */
        @NameInMap("queryParams")
        public java.util.List<HiMarketHttpRouteMatchQueryParams> queryParams;

        public static HiMarketHttpRouteMatch build(java.util.Map<String, ?> map) throws Exception {
            HiMarketHttpRouteMatch self = new HiMarketHttpRouteMatch();
            return TeaModel.build(map, self);
        }

        public HiMarketHttpRouteMatch setHeaders(java.util.List<HiMarketHttpRouteMatchHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<HiMarketHttpRouteMatchHeaders> getHeaders() {
            return this.headers;
        }

        public HiMarketHttpRouteMatch setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

        public HiMarketHttpRouteMatch setModelMatches(java.util.List<HiMarketHttpRouteMatchModelMatches> modelMatches) {
            this.modelMatches = modelMatches;
            return this;
        }
        public java.util.List<HiMarketHttpRouteMatchModelMatches> getModelMatches() {
            return this.modelMatches;
        }

        public HiMarketHttpRouteMatch setPath(HiMarketHttpRouteMatchPath path) {
            this.path = path;
            return this;
        }
        public HiMarketHttpRouteMatchPath getPath() {
            return this.path;
        }

        public HiMarketHttpRouteMatch setQueryParams(java.util.List<HiMarketHttpRouteMatchQueryParams> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public java.util.List<HiMarketHttpRouteMatchQueryParams> getQueryParams() {
            return this.queryParams;
        }

    }

}
