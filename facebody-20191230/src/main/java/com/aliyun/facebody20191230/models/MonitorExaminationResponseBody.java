// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MonitorExaminationResponseBody extends TeaModel {
    @NameInMap("Data")
    public MonitorExaminationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D0F6EB94-73B6-4CB8-B266-22D2F221C475</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MonitorExaminationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonitorExaminationResponseBody self = new MonitorExaminationResponseBody();
        return TeaModel.build(map, self);
    }

    public MonitorExaminationResponseBody setData(MonitorExaminationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MonitorExaminationResponseBodyData getData() {
        return this.data;
    }

    public MonitorExaminationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MonitorExaminationResponseBodyDataFaceInfoPose extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-0.9185499548912048</p>
         */
        @NameInMap("Pitch")
        public Float pitch;

        /**
         * <strong>example:</strong>
         * <p>-0.18541647493839264</p>
         */
        @NameInMap("Roll")
        public Float roll;

        /**
         * <strong>example:</strong>
         * <p>8.095342636108398</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Completeness")
        public Float completeness;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FaceNumber")
        public Long faceNumber;

        @NameInMap("Pose")
        public MonitorExaminationResponseBodyDataFaceInfoPose pose;

        public static MonitorExaminationResponseBodyDataFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyDataFaceInfo self = new MonitorExaminationResponseBodyDataFaceInfo();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyDataFaceInfo setCompleteness(Float completeness) {
            this.completeness = completeness;
            return this;
        }
        public Float getCompleteness() {
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
        /**
         * <strong>example:</strong>
         * <p>0.39076218008995056</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0.7980290651321411</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0.28805577754974365</p>
         */
        @NameInMap("ChatScore")
        public Float chatScore;

        @NameInMap("FaceInfo")
        public MonitorExaminationResponseBodyDataFaceInfo faceInfo;

        @NameInMap("PersonInfo")
        public MonitorExaminationResponseBodyDataPersonInfo personInfo;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        public static MonitorExaminationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MonitorExaminationResponseBodyData self = new MonitorExaminationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MonitorExaminationResponseBodyData setChatScore(Float chatScore) {
            this.chatScore = chatScore;
            return this;
        }
        public Float getChatScore() {
            return this.chatScore;
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

        public MonitorExaminationResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
