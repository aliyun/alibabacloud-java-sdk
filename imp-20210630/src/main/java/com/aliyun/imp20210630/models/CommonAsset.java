// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonAsset extends TeaModel {
    // 行政区域地址
    @NameInMap("Address")
    public CommonAddress address;

    // 应用ID
    @NameInMap("AppId")
    public String appId;

    // 审核状态
    @NameInMap("AuditStatus")
    public String auditStatus;

    // 作者
    @NameInMap("Author")
    public String author;

    // 创建时间
    @NameInMap("CreatedAt")
    public String createdAt;

    // 资产描述
    @NameInMap("Description")
    public String description;

    // 扩展字段
    @NameInMap("Extends")
    public java.util.Map<String, ?> _extends;

    // 资产ID
    @NameInMap("Id")
    public String id;

    // 图像资源
    @NameInMap("Images")
    public java.util.List<CommonMediaResource> images;

    // 定义Label， eg:type:advertise 支持广告类型的label
    @NameInMap("Labels")
    public java.util.Map<String, ?> labels;

    // 经纬度地理位置
    @NameInMap("Location")
    public TypeLatLng location;

    // 资产来源
    @NameInMap("Source")
    public String source;

    // 资产状态
    @NameInMap("Status")
    public String status;

    // 概要
    @NameInMap("Synopsis")
    public String synopsis;

    // 标签
    @NameInMap("Tags")
    public java.util.List<String> tags;

    // 标题
    @NameInMap("Title")
    public String title;

    // 更新时间
    @NameInMap("UpdatedAt")
    public String updatedAt;

    // 视频资源
    @NameInMap("Videos")
    public java.util.List<CommonMediaResource> videos;

    public static CommonAsset build(java.util.Map<String, ?> map) throws Exception {
        CommonAsset self = new CommonAsset();
        return TeaModel.build(map, self);
    }

    public CommonAsset setAddress(CommonAddress address) {
        this.address = address;
        return this;
    }
    public CommonAddress getAddress() {
        return this.address;
    }

    public CommonAsset setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CommonAsset setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public CommonAsset setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CommonAsset setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CommonAsset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CommonAsset set_extends(java.util.Map<String, ?> _extends) {
        this._extends = _extends;
        return this;
    }
    public java.util.Map<String, ?> get_extends() {
        return this._extends;
    }

    public CommonAsset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CommonAsset setImages(java.util.List<CommonMediaResource> images) {
        this.images = images;
        return this;
    }
    public java.util.List<CommonMediaResource> getImages() {
        return this.images;
    }

    public CommonAsset setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public CommonAsset setLocation(TypeLatLng location) {
        this.location = location;
        return this;
    }
    public TypeLatLng getLocation() {
        return this.location;
    }

    public CommonAsset setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CommonAsset setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CommonAsset setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }
    public String getSynopsis() {
        return this.synopsis;
    }

    public CommonAsset setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CommonAsset setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CommonAsset setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CommonAsset setVideos(java.util.List<CommonMediaResource> videos) {
        this.videos = videos;
        return this;
    }
    public java.util.List<CommonMediaResource> getVideos() {
        return this.videos;
    }

}
