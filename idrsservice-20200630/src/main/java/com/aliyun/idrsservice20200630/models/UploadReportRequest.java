// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UploadReportRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("DetectProcessId")
    public String detectProcessId;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("FeeId")
    public String feeId;

    @NameInMap("MetaUrl")
    public String metaUrl;

    @NameInMap("OuterBusinessId")
    public String outerBusinessId;

    @NameInMap("RecordAt")
    public String recordAt;

    @NameInMap("ResultUrl")
    public String resultUrl;

    @NameInMap("Role")
    public String role;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("RtcRecordId")
    public String rtcRecordId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("VideoType")
    public String videoType;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static UploadReportRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadReportRequest self = new UploadReportRequest();
        return TeaModel.build(map, self);
    }

    public UploadReportRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadReportRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public UploadReportRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UploadReportRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public UploadReportRequest setDetectProcessId(String detectProcessId) {
        this.detectProcessId = detectProcessId;
        return this;
    }
    public String getDetectProcessId() {
        return this.detectProcessId;
    }

    public UploadReportRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public UploadReportRequest setFeeId(String feeId) {
        this.feeId = feeId;
        return this;
    }
    public String getFeeId() {
        return this.feeId;
    }

    public UploadReportRequest setMetaUrl(String metaUrl) {
        this.metaUrl = metaUrl;
        return this;
    }
    public String getMetaUrl() {
        return this.metaUrl;
    }

    public UploadReportRequest setOuterBusinessId(String outerBusinessId) {
        this.outerBusinessId = outerBusinessId;
        return this;
    }
    public String getOuterBusinessId() {
        return this.outerBusinessId;
    }

    public UploadReportRequest setRecordAt(String recordAt) {
        this.recordAt = recordAt;
        return this;
    }
    public String getRecordAt() {
        return this.recordAt;
    }

    public UploadReportRequest setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public UploadReportRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UploadReportRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public UploadReportRequest setRtcRecordId(String rtcRecordId) {
        this.rtcRecordId = rtcRecordId;
        return this;
    }
    public String getRtcRecordId() {
        return this.rtcRecordId;
    }

    public UploadReportRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UploadReportRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadReportRequest setVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }
    public String getVideoType() {
        return this.videoType;
    }

    public UploadReportRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
