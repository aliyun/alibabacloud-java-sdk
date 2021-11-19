// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListChangeRecordsShrinkRequest extends TeaModel {
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
    public String namesShrink;

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

    public static ListChangeRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRecordsShrinkRequest self = new ListChangeRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeRecordsShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListChangeRecordsShrinkRequest setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public String getFromDate() {
        return this.fromDate;
    }

    public ListChangeRecordsShrinkRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ListChangeRecordsShrinkRequest setNamesShrink(String namesShrink) {
        this.namesShrink = namesShrink;
        return this;
    }
    public String getNamesShrink() {
        return this.namesShrink;
    }

    public ListChangeRecordsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeRecordsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChangeRecordsShrinkRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

    public ListChangeRecordsShrinkRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public ListChangeRecordsShrinkRequest setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }
    public String getToDate() {
        return this.toDate;
    }

}
