// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListApiNamesRequest extends TeaModel {
    // 环境
    @NameInMap("Env")
    public String env;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // pop产品
    @NameInMap("PopCode")
    public String popCode;

    // pop版本
    @NameInMap("PopVersion")
    public String popVersion;

    @NameInMap("RequestContext")
    public RequestContext requestContext;

    public static ListApiNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiNamesRequest self = new ListApiNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListApiNamesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListApiNamesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApiNamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiNamesRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public ListApiNamesRequest setPopVersion(String popVersion) {
        this.popVersion = popVersion;
        return this;
    }
    public String getPopVersion() {
        return this.popVersion;
    }

    public ListApiNamesRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

}
