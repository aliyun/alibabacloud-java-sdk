// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAvatarTrainingJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAvatarTrainingJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAvatarTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvatarTrainingJobResponseBody self = new GetAvatarTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvatarTrainingJobResponseBody setData(GetAvatarTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAvatarTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public GetAvatarTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvatarTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob extends TeaModel {
        @NameInMap("AvatarDescription")
        public String avatarDescription;

        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("AvatarName")
        public String avatarName;

        @NameInMap("AvatarType")
        public String avatarType;

        @NameInMap("FirstTrainingTime")
        public String firstTrainingTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("LastTrainingTime")
        public String lastTrainingTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Portrait")
        public String portrait;

        @NameInMap("Status")
        public String status;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Transparent")
        public Boolean transparent;

        @NameInMap("Video")
        public String video;

        public static GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob build(java.util.Map<String, ?> map) throws Exception {
            GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob self = new GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob();
            return TeaModel.build(map, self);
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setAvatarDescription(String avatarDescription) {
            this.avatarDescription = avatarDescription;
            return this;
        }
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }
        public String getAvatarName() {
            return this.avatarName;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setFirstTrainingTime(String firstTrainingTime) {
            this.firstTrainingTime = firstTrainingTime;
            return this;
        }
        public String getFirstTrainingTime() {
            return this.firstTrainingTime;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setLastTrainingTime(String lastTrainingTime) {
            this.lastTrainingTime = lastTrainingTime;
            return this;
        }
        public String getLastTrainingTime() {
            return this.lastTrainingTime;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setTransparent(Boolean transparent) {
            this.transparent = transparent;
            return this;
        }
        public Boolean getTransparent() {
            return this.transparent;
        }

        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob setVideo(String video) {
            this.video = video;
            return this;
        }
        public String getVideo() {
            return this.video;
        }

    }

    public static class GetAvatarTrainingJobResponseBodyData extends TeaModel {
        @NameInMap("AvatarTrainingJob")
        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob avatarTrainingJob;

        public static GetAvatarTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvatarTrainingJobResponseBodyData self = new GetAvatarTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvatarTrainingJobResponseBodyData setAvatarTrainingJob(GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob avatarTrainingJob) {
            this.avatarTrainingJob = avatarTrainingJob;
            return this;
        }
        public GetAvatarTrainingJobResponseBodyDataAvatarTrainingJob getAvatarTrainingJob() {
            return this.avatarTrainingJob;
        }

    }

}
