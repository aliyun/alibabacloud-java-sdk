// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-09 11:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The scope of the tickets that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>AS_ADMIN</strong>: all tickets.</li>
     * <li><strong>AS_COMMITTER</strong>: the tickets that are submitted by the current user.</li>
     * <li><strong>AS_HANDLER</strong>: the tickets to be processed by the current user.</li>
     * <li><strong>AS_OWNER</strong>: the tickets that are processed by the current user.</li>
     * <li><strong>AS_Related</strong>: the tickets that are related to the current user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AS_ADMIN</p>
     */
    @NameInMap("OrderResultType")
    public String orderResultType;

    /**
     * <p>The status of the tickets that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: queries the tickets of all statuses.</li>
     * <li><strong>FINISHED</strong>: queries the tickets that are completed.</li>
     * <li><strong>RUNNING</strong>: queries the tickets that are being processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the tickets that you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/429109.html">PluginType parameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DC_COMMON</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The keyword that is used to query tickets.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchContent")
    public String searchContent;

    /**
     * <p>The time condition based on which you want to query tickets. Valid values:</p>
     * <ul>
     * <li><strong>CREATE_TIME</strong>: the time when a ticket was created.</li>
     * <li><strong>MODIFY_TIME</strong>: the time when a ticket was last modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATE_TIME</p>
     */
    @NameInMap("SearchDateType")
    public String searchDateType;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-08 11:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
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
