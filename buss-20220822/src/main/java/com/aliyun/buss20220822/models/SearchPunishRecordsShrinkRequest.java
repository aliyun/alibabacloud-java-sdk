// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRecordsShrinkRequest extends TeaModel {
    @NameInMap("ActionCodes")
    public String actionCodesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BussinessCodes")
    public String bussinessCodes;

    @NameInMap("CaseCodes")
    public String caseCodesShrink;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EventCodes")
    public String eventCodesShrink;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PunishStatus")
    public String punishStatusShrink;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("SourceCodes")
    public String sourceCodesShrink;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Url")
    public String url;

    @NameInMap("UrlFuzzy")
    public String urlFuzzy;

    public static SearchPunishRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRecordsShrinkRequest self = new SearchPunishRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishRecordsShrinkRequest setActionCodesShrink(String actionCodesShrink) {
        this.actionCodesShrink = actionCodesShrink;
        return this;
    }
    public String getActionCodesShrink() {
        return this.actionCodesShrink;
    }

    public SearchPunishRecordsShrinkRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public SearchPunishRecordsShrinkRequest setBussinessCodes(String bussinessCodes) {
        this.bussinessCodes = bussinessCodes;
        return this;
    }
    public String getBussinessCodes() {
        return this.bussinessCodes;
    }

    public SearchPunishRecordsShrinkRequest setCaseCodesShrink(String caseCodesShrink) {
        this.caseCodesShrink = caseCodesShrink;
        return this;
    }
    public String getCaseCodesShrink() {
        return this.caseCodesShrink;
    }

    public SearchPunishRecordsShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SearchPunishRecordsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchPunishRecordsShrinkRequest setEventCodesShrink(String eventCodesShrink) {
        this.eventCodesShrink = eventCodesShrink;
        return this;
    }
    public String getEventCodesShrink() {
        return this.eventCodesShrink;
    }

    public SearchPunishRecordsShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SearchPunishRecordsShrinkRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public SearchPunishRecordsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchPunishRecordsShrinkRequest setPunishStatusShrink(String punishStatusShrink) {
        this.punishStatusShrink = punishStatusShrink;
        return this;
    }
    public String getPunishStatusShrink() {
        return this.punishStatusShrink;
    }

    public SearchPunishRecordsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SearchPunishRecordsShrinkRequest setSourceCodesShrink(String sourceCodesShrink) {
        this.sourceCodesShrink = sourceCodesShrink;
        return this;
    }
    public String getSourceCodesShrink() {
        return this.sourceCodesShrink;
    }

    public SearchPunishRecordsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchPunishRecordsShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SearchPunishRecordsShrinkRequest setUrlFuzzy(String urlFuzzy) {
        this.urlFuzzy = urlFuzzy;
        return this;
    }
    public String getUrlFuzzy() {
        return this.urlFuzzy;
    }

}
