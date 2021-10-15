// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeURLRequest extends TeaModel {
    // 链式授权
    @NameInMap("AssumeRoleChain")
    public AssumeRoleChain assumeRoleChain;

    // 是否支持外部上传
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    // 文件名，必须带文件名后缀，默认是 SourceUri 的最后一级
    @NameInMap("Filename")
    public String filename;

    // 隐藏工具栏，预览模式下使用
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    // mns 消息通知地址
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    // mns 消息通知 topic
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 文件密码
    @NameInMap("Password")
    public String password;

    // 权限
    @NameInMap("Permission")
    public WebofficePermission permission;

    // 预览前几页
    @NameInMap("PreviewPages")
    public Long previewPages;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // oss 防盗链 referer
    @NameInMap("Referer")
    public String referer;

    // 预览编辑地址
    @NameInMap("SourceURI")
    public String sourceURI;

    // 用户
    @NameInMap("User")
    public WebofficeUser user;

    // 用户自定义数据，在消息通知中返回
    @NameInMap("UserData")
    public String userData;

    // 水印
    @NameInMap("Watermark")
    public WebofficeWatermark watermark;

    public static GetWebofficeURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLRequest self = new GetWebofficeURLRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLRequest setAssumeRoleChain(AssumeRoleChain assumeRoleChain) {
        this.assumeRoleChain = assumeRoleChain;
        return this;
    }
    public AssumeRoleChain getAssumeRoleChain() {
        return this.assumeRoleChain;
    }

    public GetWebofficeURLRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GetWebofficeURLRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetWebofficeURLRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GetWebofficeURLRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetWebofficeURLRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetWebofficeURLRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetWebofficeURLRequest setPermission(WebofficePermission permission) {
        this.permission = permission;
        return this;
    }
    public WebofficePermission getPermission() {
        return this.permission;
    }

    public GetWebofficeURLRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GetWebofficeURLRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetWebofficeURLRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GetWebofficeURLRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GetWebofficeURLRequest setUser(WebofficeUser user) {
        this.user = user;
        return this;
    }
    public WebofficeUser getUser() {
        return this.user;
    }

    public GetWebofficeURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWebofficeURLRequest setWatermark(WebofficeWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

}
