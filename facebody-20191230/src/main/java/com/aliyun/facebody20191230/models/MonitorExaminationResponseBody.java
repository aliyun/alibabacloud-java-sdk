// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MonitorExaminationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public MonitorExaminationResponseBodyData data;

    public static MonitorExaminationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonitorExaminationResponseBody self = new MonitorExaminationResponseBody();
        return TeaModel.build(map, self);
    }

    public MonitorExaminationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorExaminationResponseBody setData(MonitorExaminationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MonitorExaminationResponseBodyData getData() {
        return this.data;
    }

    public static class MonitorExaminationResponseBodyDataFaceInfoPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static MonitorExaminationResponseBodyDataFaceInfoPose build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataFaceInfoPose self = new MonitorExaminationResponseBodyDataFaceInfoPose();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataFaceInfoPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public MonitorExaminationResponseBodyDataFaceInfoPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public MonitorExaminationResponseBodyDataFaceInfoPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class MonitorExaminationResponseBodyDataFaceInfo extends TeaModel {
        @NameInMap("Completeness")
        public Long completeness;

        @NameInMap("FaceNumber")
        public Long faceNumber;

        @NameInMap("Pose")
        public MonitorExaminationResponseBodyDataFaceInfoPose pose;

        public static MonitorExaminationResponseBodyDataFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataFaceInfo self = new MonitorExaminationResponseBodyDataFaceInfo();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataFaceInfo setCompleteness(Long completeness) {
            this.completeness = completeness;
            return this;
        }
        public Long getCompleteness() {
            return this.completeness;
        }

        public MonitorExaminationResponseBodyDataFaceInfo setFaceNumber(Long faceNumber) {
            this.faceNumber = faceNumber;
            return this;
        }
        public Long getFaceNumber() {
            return this.faceNumber;
        }

        public MonitorExaminationResponseBodyDataFaceInfo setPose(MonitorExaminationResponseBodyDataFaceInfoPose pose) {
            this.pose = pose;
            return this;
        }
        public MonitorExaminationResponseBodyDataFaceInfoPose getPose() {
            return this.pose;
        }

    }

    public static class MonitorExaminationResponseBodyDataPersonInfoCellPhone extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Threshold")
        public Float threshold;

        public static MonitorExaminationResponseBodyDataPersonInfoCellPhone build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataPersonInfoCellPhone self = new MonitorExaminationResponseBodyDataPersonInfoCellPhone();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataPersonInfoCellPhone setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public MonitorExaminationResponseBodyDataPersonInfoCellPhone setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class MonitorExaminationResponseBodyDataPersonInfoEarPhone extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Threshold")
        public Float threshold;

        public static MonitorExaminationResponseBodyDataPersonInfoEarPhone build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataPersonInfoEarPhone self = new MonitorExaminationResponseBodyDataPersonInfoEarPhone();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataPersonInfoEarPhone setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public MonitorExaminationResponseBodyDataPersonInfoEarPhone setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class MonitorExaminationResponseBodyDataPersonInfo extends TeaModel {
        @NameInMap("CellPhone")
        public MonitorExaminationResponseBodyDataPersonInfoCellPhone cellPhone;

        @NameInMap("EarPhone")
        public MonitorExaminationResponseBodyDataPersonInfoEarPhone earPhone;

        @NameInMap("PersonNumber")
        public Long personNumber;

        public static MonitorExaminationResponseBodyDataPersonInfo build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataPersonInfo self = new MonitorExaminationResponseBodyDataPersonInfo();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataPersonInfo setCellPhone(MonitorExaminationResponseBodyDataPersonInfoCellPhone cellPhone) {
            this.cellPhone = cellPhone;
            return this;
        }
        public MonitorExaminationResponseBodyDataPersonInfoCellPhone getCellPhone() {
            return this.cellPhone;
        }

        public MonitorExaminationResponseBodyDataPersonInfo setEarPhone(MonitorExaminationResponseBodyDataPersonInfoEarPhone earPhone) {
            this.earPhone = earPhone;
            return this;
        }
        public MonitorExaminationResponseBodyDataPersonInfoEarPhone getEarPhone() {
            return this.earPhone;
        }

        public MonitorExaminationResponseBodyDataPersonInfo setPersonNumber(Long personNumber) {
            this.personNumber = personNumber;
            return this;
        }
        public Long getPersonNumber() {
            return this.personNumber;
        }

    }

    public static class MonitorExaminationResponseBodyData extends TeaModel {
        @NameInMap("FaceInfo")
        public MonitorExaminationResponseBodyDataFaceInfo faceInfo;

        @NameInMap("PersonInfo")
        public MonitorExaminationResponseBodyDataPersonInfo personInfo;

        @NameInMap("ChatScore")
        public Float chatScore;

        @NameInMap("Threshold")
        public Float threshold;

        public static MonitorExaminationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyData self = new MonitorExaminationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyData setFaceInfo(MonitorExaminationResponseBodyDataFaceInfo faceInfo) {
            this.faceInfo = faceInfo;
            return this;
        }
        public MonitorExaminationResponseBodyDataFaceInfo getFaceInfo() {
            return this.faceInfo;
        }

        public MonitorExaminationResponseBodyData setPersonInfo(MonitorExaminationResponseBodyDataPersonInfo personInfo) {
            this.personInfo = personInfo;
            return this;
        }
        public MonitorExaminationResponseBodyDataPersonInfo getPersonInfo() {
            return this.personInfo;
        }

        public MonitorExaminationResponseBodyData setChatScore(Float chatScore) {
            this.chatScore = chatScore;
            return this;
        }
        public Float getChatScore() {
            return this.chatScore;
        }

        public MonitorExaminationResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
