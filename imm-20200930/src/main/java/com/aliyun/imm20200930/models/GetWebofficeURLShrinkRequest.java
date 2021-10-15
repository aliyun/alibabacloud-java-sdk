// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeURLShrinkRequest extends TeaModel {
    // 链式授权
    @NameInMap("AssumeRoleChain")
    public String assumeRoleChainShrink;

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
    public String permissionShrink;

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
    public String userShrink;

    // 用户自定义数据，在消息通知中返回
    @NameInMap("UserData")
    public String userData;

    // 水印
    @NameInMap("Watermark")
    public String watermarkShrink;

    public static GetWebofficeURLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLShrinkRequest self = new GetWebofficeURLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLShrinkRequest setAssumeRoleChainShrink(String assumeRoleChainShrink) {
        this.assumeRoleChainShrink = assumeRoleChainShrink;
        return this;
    }
    public String getAssumeRoleChainShrink() {
        return this.assumeRoleChainShrink;
    }

    public GetWebofficeURLShrinkRequest setExternalUploaded(Boolean externalUploaded) {
        this.externalUploaded = externalUploaded;
        return this;
    }
    public Boolean getExternalUploaded() {
        return this.externalUploaded;
    }

    public GetWebofficeURLShrinkRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GetWebofficeURLShrinkRequest setHidecmb(Boolean hidecmb) {
        this.hidecmb = hidecmb;
        return this;
    }
    public Boolean getHidecmb() {
        return this.hidecmb;
    }

    public GetWebofficeURLShrinkRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public GetWebofficeURLShrinkRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public GetWebofficeURLShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetWebofficeURLShrinkRequest setPermissionShrink(String permissionShrink) {
        this.permissionShrink = permissionShrink;
        return this;
    }
    public String getPermissionShrink() {
        return this.permissionShrink;
    }

    public GetWebofficeURLShrinkRequest setPreviewPages(Long previewPages) {
        this.previewPages = previewPages;
        return this;
    }
    public Long getPreviewPages() {
        return this.previewPages;
    }

    public GetWebofficeURLShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetWebofficeURLShrinkRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public GetWebofficeURLShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GetWebofficeURLShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public GetWebofficeURLShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GetWebofficeURLShrinkRequest setWatermarkShrink(String watermarkShrink) {
        this.watermarkShrink = watermarkShrink;
        return this;
    }
    public String getWatermarkShrink() {
        return this.watermarkShrink;
    }

}
