// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindImagesRequest extends TeaModel {
    @NameInMap("AddressLineContentsMatch")
    public String addressLineContentsMatch;

    @NameInMap("AgeRange")
    public String ageRange;

    @NameInMap("CreateTimeRange")
    public String createTimeRange;

    @NameInMap("Emotion")
    public String emotion;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("FacesModifyTimeRange")
    public String facesModifyTimeRange;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ImageSizeRange")
    public String imageSizeRange;

    @NameInMap("ImageTimeRange")
    public String imageTimeRange;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("LocationBoundary")
    public String locationBoundary;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("ModifyTimeRange")
    public String modifyTimeRange;

    @NameInMap("OCRContentsMatch")
    public String OCRContentsMatch;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Project")
    public String project;

    @NameInMap("RemarksAPrefix")
    public String remarksAPrefix;

    @NameInMap("RemarksArrayAIn")
    public String remarksArrayAIn;

    @NameInMap("RemarksArrayBIn")
    public String remarksArrayBIn;

    @NameInMap("RemarksBPrefix")
    public String remarksBPrefix;

    @NameInMap("RemarksCPrefix")
    public String remarksCPrefix;

    @NameInMap("RemarksDPrefix")
    public String remarksDPrefix;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceUriPrefix")
    public String sourceUriPrefix;

    @NameInMap("TagNames")
    public String tagNames;

    @NameInMap("TagsModifyTimeRange")
    public String tagsModifyTimeRange;

    public static FindImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindImagesRequest self = new FindImagesRequest();
        return TeaModel.build(map, self);
    }

    public FindImagesRequest setAddressLineContentsMatch(String addressLineContentsMatch) {
        this.addressLineContentsMatch = addressLineContentsMatch;
        return this;
    }
    public String getAddressLineContentsMatch() {
        return this.addressLineContentsMatch;
    }

    public FindImagesRequest setAgeRange(String ageRange) {
        this.ageRange = ageRange;
        return this;
    }
    public String getAgeRange() {
        return this.ageRange;
    }

    public FindImagesRequest setCreateTimeRange(String createTimeRange) {
        this.createTimeRange = createTimeRange;
        return this;
    }
    public String getCreateTimeRange() {
        return this.createTimeRange;
    }

    public FindImagesRequest setEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }
    public String getEmotion() {
        return this.emotion;
    }

    public FindImagesRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public FindImagesRequest setFacesModifyTimeRange(String facesModifyTimeRange) {
        this.facesModifyTimeRange = facesModifyTimeRange;
        return this;
    }
    public String getFacesModifyTimeRange() {
        return this.facesModifyTimeRange;
    }

    public FindImagesRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public FindImagesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public FindImagesRequest setImageSizeRange(String imageSizeRange) {
        this.imageSizeRange = imageSizeRange;
        return this;
    }
    public String getImageSizeRange() {
        return this.imageSizeRange;
    }

    public FindImagesRequest setImageTimeRange(String imageTimeRange) {
        this.imageTimeRange = imageTimeRange;
        return this;
    }
    public String getImageTimeRange() {
        return this.imageTimeRange;
    }

    public FindImagesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public FindImagesRequest setLocationBoundary(String locationBoundary) {
        this.locationBoundary = locationBoundary;
        return this;
    }
    public String getLocationBoundary() {
        return this.locationBoundary;
    }

    public FindImagesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public FindImagesRequest setModifyTimeRange(String modifyTimeRange) {
        this.modifyTimeRange = modifyTimeRange;
        return this;
    }
    public String getModifyTimeRange() {
        return this.modifyTimeRange;
    }

    public FindImagesRequest setOCRContentsMatch(String OCRContentsMatch) {
        this.OCRContentsMatch = OCRContentsMatch;
        return this;
    }
    public String getOCRContentsMatch() {
        return this.OCRContentsMatch;
    }

    public FindImagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public FindImagesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public FindImagesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public FindImagesRequest setRemarksAPrefix(String remarksAPrefix) {
        this.remarksAPrefix = remarksAPrefix;
        return this;
    }
    public String getRemarksAPrefix() {
        return this.remarksAPrefix;
    }

    public FindImagesRequest setRemarksArrayAIn(String remarksArrayAIn) {
        this.remarksArrayAIn = remarksArrayAIn;
        return this;
    }
    public String getRemarksArrayAIn() {
        return this.remarksArrayAIn;
    }

    public FindImagesRequest setRemarksArrayBIn(String remarksArrayBIn) {
        this.remarksArrayBIn = remarksArrayBIn;
        return this;
    }
    public String getRemarksArrayBIn() {
        return this.remarksArrayBIn;
    }

    public FindImagesRequest setRemarksBPrefix(String remarksBPrefix) {
        this.remarksBPrefix = remarksBPrefix;
        return this;
    }
    public String getRemarksBPrefix() {
        return this.remarksBPrefix;
    }

    public FindImagesRequest setRemarksCPrefix(String remarksCPrefix) {
        this.remarksCPrefix = remarksCPrefix;
        return this;
    }
    public String getRemarksCPrefix() {
        return this.remarksCPrefix;
    }

    public FindImagesRequest setRemarksDPrefix(String remarksDPrefix) {
        this.remarksDPrefix = remarksDPrefix;
        return this;
    }
    public String getRemarksDPrefix() {
        return this.remarksDPrefix;
    }

    public FindImagesRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public FindImagesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public FindImagesRequest setSourceUriPrefix(String sourceUriPrefix) {
        this.sourceUriPrefix = sourceUriPrefix;
        return this;
    }
    public String getSourceUriPrefix() {
        return this.sourceUriPrefix;
    }

    public FindImagesRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public FindImagesRequest setTagsModifyTimeRange(String tagsModifyTimeRange) {
        this.tagsModifyTimeRange = tagsModifyTimeRange;
        return this;
    }
    public String getTagsModifyTimeRange() {
        return this.tagsModifyTimeRange;
    }

}
