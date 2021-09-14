// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class QueryDatasetDataRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Token")
    public String token;

    @NameInMap("Query")
    public String query;

    @NameInMap("Method")
    public String method;

    public static QueryDatasetDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDataRequest self = new QueryDatasetDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDataRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QueryDatasetDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public QueryDatasetDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryDatasetDataRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public QueryDatasetDataRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryDatasetDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryDatasetDataRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
