// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class PunishResourceSearchRequest extends TeaModel {
    @NameInMap("ActionCodes")
    public java.util.List<String> actionCodes;

    @NameInMap("BussinessCodes")
    public java.util.List<String> bussinessCodes;

    @NameInMap("Class")
    public String _class;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SourceCodes")
    public java.util.List<String> sourceCodes;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("Status")
    public String status;

    @NameInMap("Url")
    public String url;

    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static PunishResourceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        PunishResourceSearchRequest self = new PunishResourceSearchRequest();
        return TeaModel.build(map, self);
    }

    public PunishResourceSearchRequest setActionCodes(java.util.List<String> actionCodes) {
        this.actionCodes = actionCodes;
        return this;
    }
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    public PunishResourceSearchRequest setBussinessCodes(java.util.List<String> bussinessCodes) {
        this.bussinessCodes = bussinessCodes;
        return this;
    }
    public java.util.List<String> getBussinessCodes() {
        return this.bussinessCodes;
    }

    public PunishResourceSearchRequest set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public PunishResourceSearchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public PunishResourceSearchRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public PunishResourceSearchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PunishResourceSearchRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PunishResourceSearchRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PunishResourceSearchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PunishResourceSearchRequest setSourceCodes(java.util.List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
        return this;
    }
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    public PunishResourceSearchRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public PunishResourceSearchRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PunishResourceSearchRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public PunishResourceSearchRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
