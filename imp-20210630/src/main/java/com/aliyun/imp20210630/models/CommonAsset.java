// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonAsset extends TeaModel {
    @NameInMap("Address")
    public CommonAddress address;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("Author")
    public String author;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Description")
    public String description;

    @NameInMap("Extends")
    public java.util.Map<String, ?> _extends;

    @NameInMap("Id")
    public String id;

    @NameInMap("Images")
    public java.util.List<CommonMediaResource> images;

    @NameInMap("Labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("Location")
    public TypeLatLng location;

    @NameInMap("Source")
    public String source;

    @NameInMap("Status")
    public String status;

    @NameInMap("Synopsis")
    public String synopsis;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdatedAt")
    public String updatedAt;

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
