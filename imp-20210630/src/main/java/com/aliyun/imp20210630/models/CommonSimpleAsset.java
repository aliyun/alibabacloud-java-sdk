// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonSimpleAsset extends TeaModel {
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
    @NameInMap("Image")
    public CommonMediaResource image;

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

    // 视频资源
    @NameInMap("Video")
    public CommonMediaResource video;

    public static CommonSimpleAsset build(java.util.Map<String, ?> map) throws Exception {
        CommonSimpleAsset self = new CommonSimpleAsset();
        return TeaModel.build(map, self);
    }

    public CommonSimpleAsset setAddress(CommonAddress address) {
        this.address = address;
        return this;
    }
    public CommonAddress getAddress() {
        return this.address;
    }

    public CommonSimpleAsset setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CommonSimpleAsset setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public CommonSimpleAsset setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CommonSimpleAsset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CommonSimpleAsset set_extends(java.util.Map<String, ?> _extends) {
        this._extends = _extends;
        return this;
    }
    public java.util.Map<String, ?> get_extends() {
        return this._extends;
    }

    public CommonSimpleAsset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CommonSimpleAsset setImage(CommonMediaResource image) {
        this.image = image;
        return this;
    }
    public CommonMediaResource getImage() {
        return this.image;
    }

    public CommonSimpleAsset setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public CommonSimpleAsset setLocation(TypeLatLng location) {
        this.location = location;
        return this;
    }
    public TypeLatLng getLocation() {
        return this.location;
    }

    public CommonSimpleAsset setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CommonSimpleAsset setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CommonSimpleAsset setSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }
    public String getSynopsis() {
        return this.synopsis;
    }

    public CommonSimpleAsset setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public CommonSimpleAsset setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CommonSimpleAsset setVideo(CommonMediaResource video) {
        this.video = video;
        return this;
    }
    public CommonMediaResource getVideo() {
        return this.video;
    }

}
