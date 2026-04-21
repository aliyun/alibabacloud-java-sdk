// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketHttpRoute extends TeaModel {
    @NameInMap("builtin")
    public Boolean builtin;

    @NameInMap("description")
    public String description;

    @NameInMap("domains")
    public java.util.List<HiMarketDomain> domains;

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
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

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
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

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
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        @NameInMap("type")
        public String type;

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
        @NameInMap("caseSensitive")
        public Boolean caseSensitive;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

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
        @NameInMap("headers")
        public java.util.List<HiMarketHttpRouteMatchHeaders> headers;

        @NameInMap("methods")
        public java.util.List<String> methods;

        @NameInMap("modelMatches")
        public java.util.List<HiMarketHttpRouteMatchModelMatches> modelMatches;

        @NameInMap("path")
        public HiMarketHttpRouteMatchPath path;

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
