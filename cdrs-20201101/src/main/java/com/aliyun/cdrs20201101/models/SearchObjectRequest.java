// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class SearchObjectRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("ObjectType")
    @Validation(required = true)
    public String objectType;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("Feature")
    public String feature;

    @NameInMap("ImageContent")
    public String imageContent;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("ShotTimeStart")
    public String shotTimeStart;

    @NameInMap("ShotTimeEnd")
    public String shotTimeEnd;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static SearchObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectRequest self = new SearchObjectRequest();
        return TeaModel.build(map, self);
    }

    public SearchObjectRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public SearchObjectRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public SearchObjectRequest setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

    public SearchObjectRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

    public SearchObjectRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SearchObjectRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public SearchObjectRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public SearchObjectRequest setShotTimeStart(String shotTimeStart) {
        this.shotTimeStart = shotTimeStart;
        return this;
    }
    public String getShotTimeStart() {
        return this.shotTimeStart;
    }

    public SearchObjectRequest setShotTimeEnd(String shotTimeEnd) {
        this.shotTimeEnd = shotTimeEnd;
        return this;
    }
    public String getShotTimeEnd() {
        return this.shotTimeEnd;
    }

    public SearchObjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchObjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
