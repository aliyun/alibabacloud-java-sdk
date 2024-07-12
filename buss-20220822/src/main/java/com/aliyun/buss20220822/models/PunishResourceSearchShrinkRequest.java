// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class PunishResourceSearchShrinkRequest extends TeaModel {
    @NameInMap("ActionCodes")
    public String actionCodesShrink;

    @NameInMap("BussinessCodes")
    public String bussinessCodesShrink;

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
    public String sourceCodesShrink;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("Status")
    public String status;

    @NameInMap("Url")
    public String url;

    @NameInMap("UserIds")
    public String userIdsShrink;

    public static PunishResourceSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PunishResourceSearchShrinkRequest self = new PunishResourceSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PunishResourceSearchShrinkRequest setActionCodesShrink(String actionCodesShrink) {
        this.actionCodesShrink = actionCodesShrink;
        return this;
    }
    public String getActionCodesShrink() {
        return this.actionCodesShrink;
    }

    public PunishResourceSearchShrinkRequest setBussinessCodesShrink(String bussinessCodesShrink) {
        this.bussinessCodesShrink = bussinessCodesShrink;
        return this;
    }
    public String getBussinessCodesShrink() {
        return this.bussinessCodesShrink;
    }

    public PunishResourceSearchShrinkRequest set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public PunishResourceSearchShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public PunishResourceSearchShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public PunishResourceSearchShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PunishResourceSearchShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PunishResourceSearchShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PunishResourceSearchShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PunishResourceSearchShrinkRequest setSourceCodesShrink(String sourceCodesShrink) {
        this.sourceCodesShrink = sourceCodesShrink;
        return this;
    }
    public String getSourceCodesShrink() {
        return this.sourceCodesShrink;
    }

    public PunishResourceSearchShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public PunishResourceSearchShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PunishResourceSearchShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public PunishResourceSearchShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
