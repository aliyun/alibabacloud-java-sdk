// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsRequest extends TeaModel {
    /**
     * <p>Alert type:</p>
     * <ul>
     * <li>ALERT</li>
     * <li>RESUME</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALERT</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The end time of the query (timestamp).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1711328826977</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Alarm object types:</p>
     * <ul>
     * <li>GTM_ADDRESS: Address</li>
     * <li>GTM_ADDRESS_POOL: Address Pool</li>
     * <li>GTM_INSTANCE: Instance</li>
     * <li>GTM_MONITOR_TEMPLATE: Health Check Template</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GTM_ADDRESS</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>Search keyword, usually an address ID, address pool ID, domain information, etc.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-895280232254422016</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Language type of the returned information:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Current page number, starting from <strong>1</strong>, default is <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query (timestamp).</p>
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
