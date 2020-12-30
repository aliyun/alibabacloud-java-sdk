// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RegisterPhotoRequest extends TeaModel {
    @NameInMap("TakenAt")
    public Long takenAt;

    @NameInMap("Location")
    public String location;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    @NameInMap("Latitude")
    public Float latitude;

    @NameInMap("Longitude")
    public Float longitude;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("IsVideo")
    public String isVideo;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("Size")
    public Long size;

    @NameInMap("PhotoTitle")
    public String photoTitle;

    @NameInMap("Remark")
    public String remark;

    public static RegisterPhotoRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterPhotoRequest self = new RegisterPhotoRequest();
        return TeaModel.build(map, self);
    }

    public RegisterPhotoRequest setTakenAt(Long takenAt) {
        this.takenAt = takenAt;
        return this;
    }
    public Long getTakenAt() {
        return this.takenAt;
    }

    public RegisterPhotoRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public RegisterPhotoRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public RegisterPhotoRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public RegisterPhotoRequest setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
    public Float getLatitude() {
        return this.latitude;
    }

    public RegisterPhotoRequest setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }
    public Float getLongitude() {
        return this.longitude;
    }

    public RegisterPhotoRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public RegisterPhotoRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public RegisterPhotoRequest setIsVideo(String isVideo) {
        this.isVideo = isVideo;
        return this;
    }
    public String getIsVideo() {
        return this.isVideo;
    }

    public RegisterPhotoRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public RegisterPhotoRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public RegisterPhotoRequest setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
        return this;
    }
    public String getPhotoTitle() {
        return this.photoTitle;
    }

    public RegisterPhotoRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
