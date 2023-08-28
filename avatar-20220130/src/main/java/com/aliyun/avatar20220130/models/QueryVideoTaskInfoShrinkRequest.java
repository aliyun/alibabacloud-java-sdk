// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryVideoTaskInfoShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("OrderById")
    public String orderById;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskUuid")
    public String taskUuid;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public Integer type;

    public static QueryVideoTaskInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoTaskInfoShrinkRequest self = new QueryVideoTaskInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoTaskInfoShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public QueryVideoTaskInfoShrinkRequest setOrderById(String orderById) {
        this.orderById = orderById;
        return this;
    }
    public String getOrderById() {
        return this.orderById;
    }

    public QueryVideoTaskInfoShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryVideoTaskInfoShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryVideoTaskInfoShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryVideoTaskInfoShrinkRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public QueryVideoTaskInfoShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryVideoTaskInfoShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryVideoTaskInfoShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
