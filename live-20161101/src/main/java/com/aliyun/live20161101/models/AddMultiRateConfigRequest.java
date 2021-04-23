// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddMultiRateConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("App")
    public String app;

    @NameInMap("AvFormat")
    public String avFormat;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsLazy")
    public String isLazy;

    @NameInMap("IsTimeAlign")
    public String isTimeAlign;

    @NameInMap("Templates")
    public String templates;

    public static AddMultiRateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMultiRateConfigRequest self = new AddMultiRateConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddMultiRateConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddMultiRateConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddMultiRateConfigRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddMultiRateConfigRequest setAvFormat(String avFormat) {
        this.avFormat = avFormat;
        return this;
    }
    public String getAvFormat() {
        return this.avFormat;
    }

    public AddMultiRateConfigRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddMultiRateConfigRequest setIsLazy(String isLazy) {
        this.isLazy = isLazy;
        return this;
    }
    public String getIsLazy() {
        return this.isLazy;
    }

    public AddMultiRateConfigRequest setIsTimeAlign(String isTimeAlign) {
        this.isTimeAlign = isTimeAlign;
        return this;
    }
    public String getIsTimeAlign() {
        return this.isTimeAlign;
    }

    public AddMultiRateConfigRequest setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
