// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushMessageRequest extends TeaModel {
    @NameInMap("AppPackage")
    public String appPackage;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Act")
    public String act;

    @NameInMap("Uri")
    public String uri;

    @NameInMap("PkgContent")
    public String pkgContent;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("ReceiverType")
    public String receiverType;

    @NameInMap("ReceiverValues")
    public String receiverValues;

    @NameInMap("ExpiredTime")
    public Long expiredTime;

    @NameInMap("Title")
    public String title;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Type")
    public Integer type;

    public static PushMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMessageRequest self = new PushMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushMessageRequest setAppPackage(String appPackage) {
        this.appPackage = appPackage;
        return this;
    }
    public String getAppPackage() {
        return this.appPackage;
    }

    public PushMessageRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PushMessageRequest setAct(String act) {
        this.act = act;
        return this;
    }
    public String getAct() {
        return this.act;
    }

    public PushMessageRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public PushMessageRequest setPkgContent(String pkgContent) {
        this.pkgContent = pkgContent;
        return this;
    }
    public String getPkgContent() {
        return this.pkgContent;
    }

    public PushMessageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public PushMessageRequest setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }
    public String getReceiverType() {
        return this.receiverType;
    }

    public PushMessageRequest setReceiverValues(String receiverValues) {
        this.receiverValues = receiverValues;
        return this;
    }
    public String getReceiverValues() {
        return this.receiverValues;
    }

    public PushMessageRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public PushMessageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushMessageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PushMessageRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public PushMessageRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
