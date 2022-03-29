// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ListAstralnetAppUrlsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppSource")
    public String appSource;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAstralnetAppUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAstralnetAppUrlsRequest self = new ListAstralnetAppUrlsRequest();
        return TeaModel.build(map, self);
    }

    public ListAstralnetAppUrlsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAstralnetAppUrlsRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public ListAstralnetAppUrlsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAstralnetAppUrlsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
