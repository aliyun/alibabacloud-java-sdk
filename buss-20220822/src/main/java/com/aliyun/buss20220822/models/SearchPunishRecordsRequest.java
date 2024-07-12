// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRecordsRequest extends TeaModel {
    @NameInMap("ActionCodes")
    public java.util.List<String> actionCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BussinessCodes")
    public String bussinessCodes;

    @NameInMap("CaseCodes")
    public java.util.List<String> caseCodes;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventCodes")
    public java.util.List<String> eventCodes;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PunishStatus")
    public java.util.List<String> punishStatus;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("SourceCodes")
    public java.util.List<String> sourceCodes;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Url")
    public String url;

    @NameInMap("UrlFuzzy")
    public String urlFuzzy;

    public static SearchPunishRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRecordsRequest self = new SearchPunishRecordsRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishRecordsRequest setActionCodes(java.util.List<String> actionCodes) {
        this.actionCodes = actionCodes;
        return this;
    }
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    public SearchPunishRecordsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public SearchPunishRecordsRequest setBussinessCodes(String bussinessCodes) {
        this.bussinessCodes = bussinessCodes;
        return this;
    }
    public String getBussinessCodes() {
        return this.bussinessCodes;
    }

    public SearchPunishRecordsRequest setCaseCodes(java.util.List<String> caseCodes) {
        this.caseCodes = caseCodes;
        return this;
    }
    public java.util.List<String> getCaseCodes() {
        return this.caseCodes;
    }

    public SearchPunishRecordsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SearchPunishRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchPunishRecordsRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public SearchPunishRecordsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SearchPunishRecordsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public SearchPunishRecordsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchPunishRecordsRequest setPunishStatus(java.util.List<String> punishStatus) {
        this.punishStatus = punishStatus;
        return this;
    }
    public java.util.List<String> getPunishStatus() {
        return this.punishStatus;
    }

    public SearchPunishRecordsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SearchPunishRecordsRequest setSourceCodes(java.util.List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
        return this;
    }
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    public SearchPunishRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchPunishRecordsRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SearchPunishRecordsRequest setUrlFuzzy(String urlFuzzy) {
        this.urlFuzzy = urlFuzzy;
        return this;
    }
    public String getUrlFuzzy() {
        return this.urlFuzzy;
    }

}
