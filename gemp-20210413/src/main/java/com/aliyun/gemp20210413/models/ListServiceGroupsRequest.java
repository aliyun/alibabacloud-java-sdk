// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isScheduled")
    public Boolean isScheduled;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("orderByScheduleStatus")
    public Boolean orderByScheduleStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>王宇</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("queryType")
    public String queryType;

    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
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

    public ListServiceGroupsRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ListServiceGroupsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
