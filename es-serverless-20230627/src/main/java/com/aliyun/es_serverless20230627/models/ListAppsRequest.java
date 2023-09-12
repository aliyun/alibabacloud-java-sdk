// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListAppsRequest extends TeaModel {
    @NameInMap("appName")
    public String appName;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("orderType")
    public String orderType;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("status")
    public String status;

    public static ListAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRequest self = new ListAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppsRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ListAppsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListAppsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
