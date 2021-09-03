// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeUrlRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 预览编辑地址
    @NameInMap("SourceUri")
    public String sourceUri;

    // 文件名，必须带文件名后缀，默认是 SourceUri 的最后一级
    @NameInMap("Filename")
    public String filename;

    // 用户自定义数据，在消息通知中返回
    @NameInMap("UserData")
    public String userData;

    // 预览前几页
    @NameInMap("PreviewPages")
    public Long previewPages;

    // 文件密码
    @NameInMap("Password")
    public String password;

    // 是否支持外部上传
    @NameInMap("ExternalUploaded")
    public Boolean externalUploaded;

    // mns 消息通知地址
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    // mns 消息通知 topic
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 隐藏工具栏，预览模式下使用
    @NameInMap("Hidecmb")
    public Boolean hidecmb;

    // 权限
    @NameInMap("Permission")
    public WebofficePermission permission;

    // 用户
    @NameInMap("User")
    public WebofficeUser user;

    // 水印
    @NameInMap("Watermark")
    public WebofficeWatermark watermark;

    // 链式授权
    @NameInMap("AssumeRoleChain")
    public AssumeRoleChain assumeRoleChain;

    public static GetWebofficeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeUrlRequest self = new GetWebofficeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeUrlRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetWebofficeUrlRequest setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public GetWebofficeUrlRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetWebofficeUrlRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWebofficeUrlRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GetWebofficeUrlRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetWebofficeUrlRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GetWebofficeUrlRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetWebofficeUrlRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetWebofficeUrlRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GetWebofficeUrlRequest setPermission(WebofficePermission permission) {
        this.permission = permission;
        return this;
    }
    public WebofficePermission getPermission() {
        return this.permission;
    }

    public GetWebofficeUrlRequest setUser(WebofficeUser user) {
        this.user = user;
        return this;
    }
    public WebofficeUser getUser() {
        return this.user;
    }

    public GetWebofficeUrlRequest setWatermark(WebofficeWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
    public WebofficeWatermark getWatermark() {
        return this.watermark;
    }

    public GetWebofficeUrlRequest setAssumeRoleChain(AssumeRoleChain assumeRoleChain) {
        this.assumeRoleChain = assumeRoleChain;
        return this;
    }
    public AssumeRoleChain getAssumeRoleChain() {
        return this.assumeRoleChain;
    }

}
