// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryVideoTaskInfoRequest extends TeaModel {
    @NameInMap("App")
    public QueryVideoTaskInfoRequestApp app;

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

    public static QueryVideoTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoTaskInfoRequest self = new QueryVideoTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoTaskInfoRequest setApp(QueryVideoTaskInfoRequestApp app) {
        this.app = app;
        return this;
    }
    public QueryVideoTaskInfoRequestApp getApp() {
        return this.app;
    }

    public QueryVideoTaskInfoRequest setOrderById(String orderById) {
        this.orderById = orderById;
        return this;
    }
    public String getOrderById() {
        return this.orderById;
    }

    public QueryVideoTaskInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryVideoTaskInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryVideoTaskInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryVideoTaskInfoRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

    public QueryVideoTaskInfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryVideoTaskInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryVideoTaskInfoRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class QueryVideoTaskInfoRequestApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static QueryVideoTaskInfoRequestApp build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoTaskInfoRequestApp self = new QueryVideoTaskInfoRequestApp();
            return TeaModel.build(map, self);
        }

        public QueryVideoTaskInfoRequestApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
