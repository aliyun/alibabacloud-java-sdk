// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopProductsRequest extends TeaModel {
    // 环境
    @NameInMap("Environment")
    public String environment;

    // page number
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // page size
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestContext")
    public RequestContext requestContext;

    public static ListPopProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPopProductsRequest self = new ListPopProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListPopProductsRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListPopProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPopProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPopProductsRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

}
