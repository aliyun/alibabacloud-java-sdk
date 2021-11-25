// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListFaceGroupsResponseBody extends TeaModel {
    @NameInMap("FaceGroups")
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFaceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsResponseBody self = new ListFaceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsResponseBody setFaceGroups(java.util.List<ListFaceGroupsResponseBodyFaceGroups> faceGroups) {
        this.faceGroups = faceGroups;
        return this;
    }
    public java.util.List<ListFaceGroupsResponseBodyFaceGroups> getFaceGroups() {
        return this.faceGroups;
    }

    public ListFaceGroupsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListFaceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary self = new ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary();
            return TeaModel.build(map, self);
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

    }

    public static class ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace extends TeaModel {
        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("FaceBoundary")
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary faceBoundary;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("ImageHeight")
        public Long imageHeight;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("ImageWidth")
        public Long imageWidth;

        public static ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace self = new ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setFaceBoundary(ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFaceFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setImageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Long getImageHeight() {
            return this.imageHeight;
        }

        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
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
        @NameInMap("AverageAge")
        public Float averageAge;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("GroupCoverFace")
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace groupCoverFace;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ImageCount")
        public Integer imageCount;

        @NameInMap("MaxAge")
        public Float maxAge;

        @NameInMap("MinAge")
        public Float minAge;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("RemarksArrayA")
        public String remarksArrayA;

        @NameInMap("RemarksArrayB")
        public String remarksArrayB;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("RemarksD")
        public String remarksD;

        public static ListFaceGroupsResponseBodyFaceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListFaceGroupsResponseBodyFaceGroups self = new ListFaceGroupsResponseBodyFaceGroups();
            return TeaModel.build(map, self);
        }

        public ListFaceGroupsResponseBodyFaceGroups setAverageAge(Float averageAge) {
            this.averageAge = averageAge;
            return this;
        }
        public Float getAverageAge() {
            return this.averageAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFaceGroupsResponseBodyFaceGroups setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFaceGroupsResponseBodyFaceGroups setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListFaceGroupsResponseBodyFaceGroups setGroupCoverFace(ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace groupCoverFace) {
            this.groupCoverFace = groupCoverFace;
            return this;
        }
        public ListFaceGroupsResponseBodyFaceGroupsGroupCoverFace getGroupCoverFace() {
            return this.groupCoverFace;
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

        public ListFaceGroupsResponseBodyFaceGroups setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public ListFaceGroupsResponseBodyFaceGroups setMaxAge(Float maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Float getMaxAge() {
            return this.maxAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setMinAge(Float minAge) {
            this.minAge = minAge;
            return this;
        }
        public Float getMinAge() {
            return this.minAge;
        }

        public ListFaceGroupsResponseBodyFaceGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksArrayA(String remarksArrayA) {
            this.remarksArrayA = remarksArrayA;
            return this;
        }
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksArrayB(String remarksArrayB) {
            this.remarksArrayB = remarksArrayB;
            return this;
        }
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListFaceGroupsResponseBodyFaceGroups setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

    }

}
