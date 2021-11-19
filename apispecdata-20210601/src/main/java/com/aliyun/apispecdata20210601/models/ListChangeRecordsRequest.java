// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListChangeRecordsRequest extends TeaModel {
    // 环境
    @NameInMap("Env")
    public String env;

    // 开始时间
    @NameInMap("FromDate")
    public String fromDate;

    // API命名空间
    @NameInMap("NameSpace")
    public String nameSpace;

    // API名称集合
    @NameInMap("Names")
    public java.util.List<String> names;

    // 当前页数
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestContext")
    public RequestContext requestContext;

    // 网关类型
    @NameInMap("RuntimeType")
    public String runtimeType;

    // 结束时间
    @NameInMap("ToDate")
    public String toDate;

    public static ListChangeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRecordsRequest self = new ListChangeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeRecordsRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListChangeRecordsRequest setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public String getFromDate() {
        return this.fromDate;
    }

    public ListChangeRecordsRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ListChangeRecordsRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListChangeRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChangeRecordsRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

    public ListChangeRecordsRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public ListChangeRecordsRequest setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }
    public String getToDate() {
        return this.toDate;
    }

}
