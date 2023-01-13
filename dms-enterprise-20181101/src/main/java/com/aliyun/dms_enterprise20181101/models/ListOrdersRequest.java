// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The scope of the tickets that you want to query. Valid values:</p>
     * <br>
     * <p>*   **AS_ADMIN**: all tickets.</p>
     * <p>*   **AS_COMMITTER**: the tickets that are submitted by the current user.</p>
     * <p>*   **AS_HANDLER**: the tickets to be processed by the current user.</p>
     * <p>*   **AS_OWNER**: the tickets that are processed by the current user.</p>
     * <p>*   **AS_Related**: the tickets that are related to the current user.</p>
     */
    @NameInMap("OrderResultType")
    public String orderResultType;

    /**
     * <p>The status of the tickets that you want to query. Valid values:</p>
     * <br>
     * <p>*   **ALL**: queries the tickets of all statuses.</p>
     * <p>*   **FINISHED**: queries the tickets that are completed.</p>
     * <p>*   **RUNNING**: queries the tickets that are being processed.</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the tickets that you want to query. For more information, see [PluginType parameter](~~429109~~).</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The keyword that is used to query tickets.</p>
     */
    @NameInMap("SearchContent")
    public String searchContent;

    /**
     * <p>The time condition based on which you want to query tickets. Valid values:</p>
     * <br>
     * <p>*   **CREATE_TIME**: the time when a ticket was created.</p>
     * <p>*   **MODIFY_TIME**: the time when a ticket was last modified.</p>
     */
    @NameInMap("SearchDateType")
    public String searchDateType;

    /**
     * <p>The beginning of the time range to query.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
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
