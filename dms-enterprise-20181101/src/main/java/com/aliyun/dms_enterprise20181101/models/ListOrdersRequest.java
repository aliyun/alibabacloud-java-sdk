// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersRequest extends TeaModel {
    // The end of the time range to query.
    @NameInMap("EndTime")
    public String endTime;

    // The scope of the tickets that you want to query. Valid values:
    // 
    // *   **AS_ADMIN**: all tickets.
    // *   **AS_COMMITTER**: the tickets that are submitted by the current user.
    // *   **AS_HANDLER**: the tickets to be processed by the current user.
    // *   **AS_OWNER**: the tickets that are processed by the current user.
    // *   **AS_Related**: the tickets that are related to the current user.
    @NameInMap("OrderResultType")
    public String orderResultType;

    // The status of the tickets that you want to query. Valid values:
    // 
    // *   **ALL**: queries the tickets of all statuses.
    // *   **FINISHED**: queries the tickets that are completed.
    // *   **RUNNING**: queries the tickets that are being processed.
    @NameInMap("OrderStatus")
    public String orderStatus;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The type of the tickets that you want to query. For more information, see [PluginType parameter](~~429109~~).
    @NameInMap("PluginType")
    public String pluginType;

    // The keyword that is used to query tickets.
    @NameInMap("SearchContent")
    public String searchContent;

    // The time condition based on which you want to query tickets. Valid values:
    // 
    // *   **CREATE_TIME**: the time when a ticket was created.
    // *   **MODIFY_TIME**: the time when a ticket was last modified.
    @NameInMap("SearchDateType")
    public String searchDateType;

    // The beginning of the time range to query.
    @NameInMap("StartTime")
    public String startTime;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static ListOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersRequest self = new ListOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrdersRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListOrdersRequest setOrderResultType(String orderResultType) {
        this.orderResultType = orderResultType;
        return this;
    }
    public String getOrderResultType() {
        return this.orderResultType;
    }

    public ListOrdersRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ListOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrdersRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public ListOrdersRequest setSearchContent(String searchContent) {
        this.searchContent = searchContent;
        return this;
    }
    public String getSearchContent() {
        return this.searchContent;
    }

    public ListOrdersRequest setSearchDateType(String searchDateType) {
        this.searchDateType = searchDateType;
        return this;
    }
    public String getSearchDateType() {
        return this.searchDateType;
    }

    public ListOrdersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListOrdersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
