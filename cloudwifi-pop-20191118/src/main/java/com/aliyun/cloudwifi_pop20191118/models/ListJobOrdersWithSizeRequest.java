// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersWithSizeRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ChangingType")
    public String changingType;

    @NameInMap("ClientSystem")
    public String clientSystem;

    @NameInMap("ClientUniqueId")
    public String clientUniqueId;

    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Handler")
    public String handler;

    @NameInMap("Id")
    public String id;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    public static ListJobOrdersWithSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersWithSizeRequest self = new ListJobOrdersWithSizeRequest();
        return TeaModel.build(map, self);
    }

    public ListJobOrdersWithSizeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ListJobOrdersWithSizeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListJobOrdersWithSizeRequest setChangingType(String changingType) {
        this.changingType = changingType;
        return this;
    }
    public String getChangingType() {
        return this.changingType;
    }

    public ListJobOrdersWithSizeRequest setClientSystem(String clientSystem) {
        this.clientSystem = clientSystem;
        return this;
    }
    public String getClientSystem() {
        return this.clientSystem;
    }

    public ListJobOrdersWithSizeRequest setClientUniqueId(String clientUniqueId) {
        this.clientUniqueId = clientUniqueId;
        return this;
    }
    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    public ListJobOrdersWithSizeRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public ListJobOrdersWithSizeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobOrdersWithSizeRequest setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public ListJobOrdersWithSizeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListJobOrdersWithSizeRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ListJobOrdersWithSizeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobOrdersWithSizeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobOrdersWithSizeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobOrdersWithSizeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobOrdersWithSizeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
