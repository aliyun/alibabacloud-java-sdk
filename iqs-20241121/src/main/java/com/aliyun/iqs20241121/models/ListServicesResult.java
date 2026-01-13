// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListServicesResult extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("services")
    public LrOrder services;

    @NameInMap("total")
    public Integer total;

    public static ListServicesResult build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResult self = new ListServicesResult();
        return TeaModel.build(map, self);
    }

    public ListServicesResult setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesResult setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesResult setServices(LrOrder services) {
        this.services = services;
        return this;
    }
    public LrOrder getServices() {
        return this.services;
    }

    public ListServicesResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
