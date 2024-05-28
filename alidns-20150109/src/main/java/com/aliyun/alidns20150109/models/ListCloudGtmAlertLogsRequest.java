// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
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
