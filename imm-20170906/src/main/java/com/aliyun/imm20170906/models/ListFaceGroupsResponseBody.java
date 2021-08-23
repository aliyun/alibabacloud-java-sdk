// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListFaceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("FaceGroups")
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups;

    public static ListFaceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsResponseBody self = new ListFaceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceGroupsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListFaceGroupsResponseBody setFaceGroups(java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups) {
        this.faceGroups = faceGroups;
        return this;
    }
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> getFaceGroups() {
        return this.faceGroups;
    }

    public static class ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary self = new ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("FaceBoundary")
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary faceBoundary;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("ImageHeight")
        public Long imageHeight;

        @NameInMap("ImageWidth")
        public Long imageWidth;

        public static ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace self = new ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setFaceBoundary(ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setImageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Long getImageHeight() {
            return this.imageHeight;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setImageWidth(Long imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Long getImageWidth() {
            return this.imageWidth;
        }

    }

    public static class ListFaceGroupsResponseBodyFaceGroups extends TeaModel {
        @NameInMap("Gender")
        public String gender;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("GroupCoverFace")
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace groupCoverFace;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("RemarksArrayB")
        public String remarksArrayB;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("MaxAge")
        public Float maxAge;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("AverageAge")
        public Float averageAge;

        @NameInMap("RemarksArrayA")
        public String remarksArrayA;

        @NameInMap("MinAge")
        public Float minAge;

        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static ListFaceGroupsResponseBodyFaceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroups self = new ListFaceGroupsResponseBodyFaceGroups();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroups setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListFaceGroupsResponseBodyFaceGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListFaceGroupsResponseBodyFaceGroups setGroupCoverFace(ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace groupCoverFace) {
            this.groupCoverFace = groupCoverFace;
            return this;
        }
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace getGroupCoverFace() {
            return this.groupCoverFace;
        }

        public ListFaceGroupsResponseBodyFaceGroups setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksArrayB(String remarksArrayB) {
            this.remarksArrayB = remarksArrayB;
            return this;
        }
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListFaceGroupsResponseBodyFaceGroups setMaxAge(Float maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Float getMaxAge() {
            return this.maxAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListFaceGroupsResponseBodyFaceGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListFaceGroupsResponseBodyFaceGroups setAverageAge(Float averageAge) {
            this.averageAge = averageAge;
            return this;
        }
        public Float getAverageAge() {
            return this.averageAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksArrayA(String remarksArrayA) {
            this.remarksArrayA = remarksArrayA;
            return this;
        }
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        public ListFaceGroupsResponseBodyFaceGroups setMinAge(Float minAge) {
            this.minAge = minAge;
            return this;
        }
        public Float getMinAge() {
            return this.minAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListFaceGroupsResponseBodyFaceGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
