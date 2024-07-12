// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRequestRequest extends TeaModel {
    @NameInMap("AntiStatuses")
    public java.util.List<String> antiStatuses;

    @NameInMap("BussinessCodes")
    public java.util.List<String> bussinessCodes;

    @NameInMap("Class")
    public String _class;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("EventCodes")
    public java.util.List<String> eventCodes;

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
    public java.util.List<String> punishStatuses;

    @NameInMap("PunishUrl")
    public String punishUrl;

    @NameInMap("PunishUrlFull")
    public String punishUrlFull;

    @NameInMap("SourceCodes")
    public java.util.List<String> sourceCodes;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static SearchPunishRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRequestRequest self = new SearchPunishRequestRequest();
        return TeaModel.build(map, self);
    }

    public SearchPunishRequestRequest setAntiStatuses(java.util.List<String> antiStatuses) {
        this.antiStatuses = antiStatuses;
        return this;
    }
    public java.util.List<String> getAntiStatuses() {
        return this.antiStatuses;
    }

    public SearchPunishRequestRequest setBussinessCodes(java.util.List<String> bussinessCodes) {
        this.bussinessCodes = bussinessCodes;
        return this;
    }
    public java.util.List<String> getBussinessCodes() {
        return this.bussinessCodes;
    }

    public SearchPunishRequestRequest set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public SearchPunishRequestRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public SearchPunishRequestRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public SearchPunishRequestRequest setExtRequestId(String extRequestId) {
        this.extRequestId = extRequestId;
        return this;
    }
    public String getExtRequestId() {
        return this.extRequestId;
    }

    public SearchPunishRequestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SearchPunishRequestRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public SearchPunishRequestRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchPunishRequestRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public SearchPunishRequestRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchPunishRequestRequest setPunishDomain(String punishDomain) {
        this.punishDomain = punishDomain;
        return this;
    }
    public String getPunishDomain() {
        return this.punishDomain;
    }

    public SearchPunishRequestRequest setPunishIp(String punishIp) {
        this.punishIp = punishIp;
        return this;
    }
    public String getPunishIp() {
        return this.punishIp;
    }

    public SearchPunishRequestRequest setPunishStatuses(java.util.List<String> punishStatuses) {
        this.punishStatuses = punishStatuses;
        return this;
    }
    public java.util.List<String> getPunishStatuses() {
        return this.punishStatuses;
    }

    public SearchPunishRequestRequest setPunishUrl(String punishUrl) {
        this.punishUrl = punishUrl;
        return this;
    }
    public String getPunishUrl() {
        return this.punishUrl;
    }

    public SearchPunishRequestRequest setPunishUrlFull(String punishUrlFull) {
        this.punishUrlFull = punishUrlFull;
        return this;
    }
    public String getPunishUrlFull() {
        return this.punishUrlFull;
    }

    public SearchPunishRequestRequest setSourceCodes(java.util.List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
        return this;
    }
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    public SearchPunishRequestRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public SearchPunishRequestRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
