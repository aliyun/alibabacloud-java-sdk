// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class NotificationTemplate extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnContent")
    public String enContent;

    @NameInMap("EnItemContent")
    public String enItemContent;

    @NameInMap("EnTitle")
    public String enTitle;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("WraperType")
    public String wraperType;

    @NameInMap("ZhContent")
    public String zhContent;

    @NameInMap("ZhItemContent")
    public String zhItemContent;

    @NameInMap("ZhTitle")
    public String zhTitle;

    public static NotificationTemplate build(java.util.Map<String, ?> map) throws Exception {
        NotificationTemplate self = new NotificationTemplate();
        return TeaModel.build(map, self);
    }

    public NotificationTemplate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotificationTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotificationTemplate setEnContent(String enContent) {
        this.enContent = enContent;
        return this;
    }
    public String getEnContent() {
        return this.enContent;
    }

    public NotificationTemplate setEnItemContent(String enItemContent) {
        this.enItemContent = enItemContent;
        return this;
    }
    public String getEnItemContent() {
        return this.enItemContent;
    }

    public NotificationTemplate setEnTitle(String enTitle) {
        this.enTitle = enTitle;
        return this;
    }
    public String getEnTitle() {
        return this.enTitle;
    }

    public NotificationTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NotificationTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NotificationTemplate setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotificationTemplate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotificationTemplate setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public NotificationTemplate setWraperType(String wraperType) {
        this.wraperType = wraperType;
        return this;
    }
    public String getWraperType() {
        return this.wraperType;
    }

    public NotificationTemplate setZhContent(String zhContent) {
        this.zhContent = zhContent;
        return this;
    }
    public String getZhContent() {
        return this.zhContent;
    }

    public NotificationTemplate setZhItemContent(String zhItemContent) {
        this.zhItemContent = zhItemContent;
        return this;
    }
    public String getZhItemContent() {
        return this.zhItemContent;
    }

    public NotificationTemplate setZhTitle(String zhTitle) {
        this.zhTitle = zhTitle;
        return this;
    }
    public String getZhTitle() {
        return this.zhTitle;
    }

}
