// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsRequest extends TeaModel {
    /**
     * <p>The alert type.</p>
     * <ul>
     * <li><p>ALERT: An alert is triggered.</p>
     * </li>
     * <li><p>RESUME: The service has recovered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALERT</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The end of the time range to query. This is a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1711328826977</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The alert object.</p>
     * <ul>
     * <li><p>GTM_ADDRESS: Address</p>
     * </li>
     * <li><p>GTM_ADDRESS_POOL: Address pool</p>
     * </li>
     * <li><p>GTM_INSTANCE: Instance</p>
     * </li>
     * <li><p>GTM_MONITOR_TEMPLATE: Health check template</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GTM_ADDRESS</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The keyword for the search. This is usually an address ID, address pool ID, or domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-895280232254422016</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response.</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The current page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start of the time range to query. This is a UNIX timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1611328826977</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static ListCloudGtmAlertLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAlertLogsRequest self = new ListCloudGtmAlertLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAlertLogsRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public ListCloudGtmAlertLogsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public ListCloudGtmAlertLogsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListCloudGtmAlertLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCloudGtmAlertLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCloudGtmAlertLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmAlertLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmAlertLogsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
