// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 是否已经排班
    @NameInMap("isScheduled")
    public Boolean isScheduled;

    // 是否根据排班状态排序
    @NameInMap("orderByScheduleStatus")
    public Boolean orderByScheduleStatus;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 搜索名称
    @NameInMap("queryName")
    public String queryName;

    // 搜索类型。USER用户 SERVICEGROUP服务组
    @NameInMap("queryType")
    public String queryType;

    // 用户ID
    @NameInMap("userId")
    public Long userId;

    public static ListServiceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsRequest self = new ListServiceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListServiceGroupsRequest setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
        return this;
    }
    public Boolean getIsScheduled() {
        return this.isScheduled;
    }

    public ListServiceGroupsRequest setOrderByScheduleStatus(Boolean orderByScheduleStatus) {
        this.orderByScheduleStatus = orderByScheduleStatus;
        return this;
    }
    public Boolean getOrderByScheduleStatus() {
        return this.orderByScheduleStatus;
    }

    public ListServiceGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServiceGroupsRequest setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public ListServiceGroupsRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListServiceGroupsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
