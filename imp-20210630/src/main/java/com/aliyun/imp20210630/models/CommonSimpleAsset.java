// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonSimpleAsset extends TeaModel {
    @NameInMap("Address")
    public CommonAddress address;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("Author")
    public String author;

    @NameInMap("Description")
    public String description;

    @NameInMap("Extends")
    public java.util.Map<String, ?> _extends;

    @NameInMap("Id")
    public String id;

    @NameInMap("Image")
    public CommonMediaResource image;

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
