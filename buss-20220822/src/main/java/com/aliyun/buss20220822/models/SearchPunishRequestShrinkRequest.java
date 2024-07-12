// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRequestShrinkRequest extends TeaModel {
    @NameInMap("AntiStatuses")
    public String antiStatusesShrink;

    @NameInMap("BussinessCodes")
    public String bussinessCodesShrink;

    @NameInMap("Class")
    public String _class;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("EventCodes")
    public String eventCodesShrink;

    @NameInMap("ExtRequestId")
    public String extRequestId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PunishDomain")
    public String punishDomain;

    @NameInMap("PunishIp")
    public String punishIp;

    @NameInMap("PunishStatuses")
    public String punishStatusesShrink;

    @NameInMap("PunishUrl")
    public String punishUrl;

    @NameInMap("PunishUrlFull")
    public String punishUrlFull;

    @NameInMap("SourceCodes")
    public String sourceCodesShrink;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("UserIds")
    public String userIdsShrink;

    public static SearchPunishRequestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRequestShrinkRequest self = new SearchPunishRequestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishRequestShrinkRequest setAntiStatusesShrink(String antiStatusesShrink) {
        this.antiStatusesShrink = antiStatusesShrink;
        return this;
    }
    public String getAntiStatusesShrink() {
        return this.antiStatusesShrink;
    }

    public SearchPunishRequestShrinkRequest setBussinessCodesShrink(String bussinessCodesShrink) {
        this.bussinessCodesShrink = bussinessCodesShrink;
        return this;
    }
    public String getBussinessCodesShrink() {
        return this.bussinessCodesShrink;
    }

    public SearchPunishRequestShrinkRequest set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public SearchPunishRequestShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SearchPunishRequestShrinkRequest setEventCodesShrink(String eventCodesShrink) {
        this.eventCodesShrink = eventCodesShrink;
        return this;
    }
    public String getEventCodesShrink() {
        return this.eventCodesShrink;
    }

    public SearchPunishRequestShrinkRequest setExtRequestId(String extRequestId) {
        this.extRequestId = extRequestId;
        return this;
    }
    public String getExtRequestId() {
        return this.extRequestId;
    }

    public SearchPunishRequestShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SearchPunishRequestShrinkRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public SearchPunishRequestShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchPunishRequestShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public SearchPunishRequestShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchPunishRequestShrinkRequest setPunishDomain(String punishDomain) {
        this.punishDomain = punishDomain;
        return this;
    }
    public String getPunishDomain() {
        return this.punishDomain;
    }

    public SearchPunishRequestShrinkRequest setPunishIp(String punishIp) {
        this.punishIp = punishIp;
        return this;
    }
    public String getPunishIp() {
        return this.punishIp;
    }

    public SearchPunishRequestShrinkRequest setPunishStatusesShrink(String punishStatusesShrink) {
        this.punishStatusesShrink = punishStatusesShrink;
        return this;
    }
    public String getPunishStatusesShrink() {
        return this.punishStatusesShrink;
    }

    public SearchPunishRequestShrinkRequest setPunishUrl(String punishUrl) {
        this.punishUrl = punishUrl;
        return this;
    }
    public String getPunishUrl() {
        return this.punishUrl;
    }

    public SearchPunishRequestShrinkRequest setPunishUrlFull(String punishUrlFull) {
        this.punishUrlFull = punishUrlFull;
        return this;
    }
    public String getPunishUrlFull() {
        return this.punishUrlFull;
    }

    public SearchPunishRequestShrinkRequest setSourceCodesShrink(String sourceCodesShrink) {
        this.sourceCodesShrink = sourceCodesShrink;
        return this;
    }
    public String getSourceCodesShrink() {
        return this.sourceCodesShrink;
    }

    public SearchPunishRequestShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SearchPunishRequestShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
