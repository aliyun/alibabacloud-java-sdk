// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class SearchObjectResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchObjectResponseData data;

    public static SearchObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchObjectResponse self = new SearchObjectResponse();
        return TeaModel.build(map, self);
    }

    public SearchObjectResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchObjectResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchObjectResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public SearchObjectResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchObjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchObjectResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchObjectResponse setData(SearchObjectResponseData data) {
        this.data = data;
        return this;
    }
    public SearchObjectResponseData getData() {
        return this.data;
    }

    public static class SearchObjectResponseDataBodyList extends TeaModel {
        @NameInMap("DeviceID")
        @Validation(required = true)
        public String deviceID;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("SourceImageUrl")
        @Validation(required = true)
        public String sourceImageUrl;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchObjectResponseDataBodyList build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseDataBodyList self = new SearchObjectResponseDataBodyList();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseDataBodyList setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseDataBodyList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SearchObjectResponseDataBodyList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseDataBodyList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseDataBodyList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchObjectResponseDataBodyList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchObjectResponseDataBodyList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchObjectResponseDataBodyList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseDataBodyList setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseDataBodyList setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchObjectResponseDataFaceList extends TeaModel {
        @NameInMap("DeviceID")
        @Validation(required = true)
        public String deviceID;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("SourceImageUrl")
        @Validation(required = true)
        public String sourceImageUrl;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchObjectResponseDataFaceList build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseDataFaceList self = new SearchObjectResponseDataFaceList();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseDataFaceList setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseDataFaceList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SearchObjectResponseDataFaceList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseDataFaceList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseDataFaceList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchObjectResponseDataFaceList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchObjectResponseDataFaceList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchObjectResponseDataFaceList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseDataFaceList setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseDataFaceList setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchObjectResponseDataMotorList extends TeaModel {
        @NameInMap("DeviceID")
        @Validation(required = true)
        public String deviceID;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("SourceImageUrl")
        @Validation(required = true)
        public String sourceImageUrl;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchObjectResponseDataMotorList build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseDataMotorList self = new SearchObjectResponseDataMotorList();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseDataMotorList setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseDataMotorList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SearchObjectResponseDataMotorList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseDataMotorList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseDataMotorList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchObjectResponseDataMotorList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchObjectResponseDataMotorList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchObjectResponseDataMotorList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseDataMotorList setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseDataMotorList setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchObjectResponseDataNonMotorList extends TeaModel {
        @NameInMap("DeviceID")
        @Validation(required = true)
        public String deviceID;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Integer leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Integer leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Integer rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Integer rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Integer score;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("SourceImageUrl")
        @Validation(required = true)
        public String sourceImageUrl;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchObjectResponseDataNonMotorList build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseDataNonMotorList self = new SearchObjectResponseDataNonMotorList();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseDataNonMotorList setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public SearchObjectResponseDataNonMotorList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public SearchObjectResponseDataNonMotorList setLeftTopX(Integer leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        public SearchObjectResponseDataNonMotorList setLeftTopY(Integer leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        public SearchObjectResponseDataNonMotorList setRightBottomX(Integer rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public Integer getRightBottomX() {
            return this.rightBottomX;
        }

        public SearchObjectResponseDataNonMotorList setRightBottomY(Integer rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public Integer getRightBottomY() {
            return this.rightBottomY;
        }

        public SearchObjectResponseDataNonMotorList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public SearchObjectResponseDataNonMotorList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public SearchObjectResponseDataNonMotorList setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public SearchObjectResponseDataNonMotorList setTargetImageUrl(String targetImageUrl) {
            this.targetImageUrl = targetImageUrl;
            return this;
        }
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

    }

    public static class SearchObjectResponseData extends TeaModel {
        @NameInMap("BodyList")
        @Validation(required = true)
        public java.util.List<SearchObjectResponseDataBodyList> bodyList;

        @NameInMap("FaceList")
        @Validation(required = true)
        public java.util.List<SearchObjectResponseDataFaceList> faceList;

        @NameInMap("MotorList")
        @Validation(required = true)
        public java.util.List<SearchObjectResponseDataMotorList> motorList;

        @NameInMap("NonMotorList")
        @Validation(required = true)
        public java.util.List<SearchObjectResponseDataNonMotorList> nonMotorList;

        public static SearchObjectResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchObjectResponseData self = new SearchObjectResponseData();
            return TeaModel.build(map, self);
        }

        public SearchObjectResponseData setBodyList(java.util.List<SearchObjectResponseDataBodyList> bodyList) {
            this.bodyList = bodyList;
            return this;
        }
        public java.util.List<SearchObjectResponseDataBodyList> getBodyList() {
            return this.bodyList;
        }

        public SearchObjectResponseData setFaceList(java.util.List<SearchObjectResponseDataFaceList> faceList) {
            this.faceList = faceList;
            return this;
        }
        public java.util.List<SearchObjectResponseDataFaceList> getFaceList() {
            return this.faceList;
        }

        public SearchObjectResponseData setMotorList(java.util.List<SearchObjectResponseDataMotorList> motorList) {
            this.motorList = motorList;
            return this;
        }
        public java.util.List<SearchObjectResponseDataMotorList> getMotorList() {
            return this.motorList;
        }

        public SearchObjectResponseData setNonMotorList(java.util.List<SearchObjectResponseDataNonMotorList> nonMotorList) {
            this.nonMotorList = nonMotorList;
            return this;
        }
        public java.util.List<SearchObjectResponseDataNonMotorList> getNonMotorList() {
            return this.nonMotorList;
        }

    }

}
