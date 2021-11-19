// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListPopVersionsRequest extends TeaModel {
    // 环境
    @NameInMap("Environment")
    public String environment;

    // page nunber
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // page size
    @NameInMap("PageSize")
    public Integer pageSize;

    // POP产品名称
    @NameInMap("PopProduct")
    public String popProduct;

    @NameInMap("RequestContext")
    public RequestContext requestContext;

    public static ListPopVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPopVersionsRequest self = new ListPopVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPopVersionsRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListPopVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPopVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPopVersionsRequest setPopProduct(String popProduct) {
        this.popProduct = popProduct;
        return this;
    }
    public String getPopProduct() {
        return this.popProduct;
    }

    public ListPopVersionsRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

}
