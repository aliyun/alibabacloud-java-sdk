// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoModerationResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ResourceNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2023-04-03T10:20:56.87Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>05C-1XBQvsG2Tn5kBx2dUWo43******</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>The specified resource TaskId is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("ModerationResult")
    public GetVideoModerationResultResponseBodyModerationResult moderationResult;

    /**
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration-d0f0df1d-531d-4ab4-b353-e7f475******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-03T10:20:41.432Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration-d0f0df1d-531d-4ab4-b353-e7f4750******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UserData")
    public String userData;

    public static GetVideoModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoModerationResultResponseBody self = new GetVideoModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoModerationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoModerationResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoModerationResultResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetVideoModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoModerationResultResponseBody setModerationResult(GetVideoModerationResultResponseBodyModerationResult moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }
    public GetVideoModerationResultResponseBodyModerationResult getModerationResult() {
        return this.moderationResult;
    }

    public GetVideoModerationResultResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoModerationResultResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoModerationResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVideoModerationResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoModerationResultResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetVideoModerationResultResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;teat&quot;:&quot;val&quot;}</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rate")
        public Double rate;

        public static GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames build(java.util.Map<String, ?> map) throws Exception {
            GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames self = new GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames();
            return TeaModel.build(map, self);
        }

        public GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

    }

    public static class GetVideoModerationResultResponseBodyModerationResultFrames extends TeaModel {
        @NameInMap("BlockFrames")
        public java.util.List<GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames> blockFrames;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetVideoModerationResultResponseBodyModerationResultFrames build(java.util.Map<String, ?> map) throws Exception {
            GetVideoModerationResultResponseBodyModerationResultFrames self = new GetVideoModerationResultResponseBodyModerationResultFrames();
            return TeaModel.build(map, self);
        }

        public GetVideoModerationResultResponseBodyModerationResultFrames setBlockFrames(java.util.List<GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames> blockFrames) {
            this.blockFrames = blockFrames;
            return this;
        }
        public java.util.List<GetVideoModerationResultResponseBodyModerationResultFramesBlockFrames> getBlockFrames() {
            return this.blockFrames;
        }

        public GetVideoModerationResultResponseBodyModerationResultFrames setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetVideoModerationResultResponseBodyModerationResult extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("Frames")
        public GetVideoModerationResultResponseBodyModerationResultFrames frames;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GetVideoModerationResultResponseBodyModerationResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoModerationResultResponseBodyModerationResult self = new GetVideoModerationResultResponseBodyModerationResult();
            return TeaModel.build(map, self);
        }

        public GetVideoModerationResultResponseBodyModerationResult setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetVideoModerationResultResponseBodyModerationResult setFrames(GetVideoModerationResultResponseBodyModerationResultFrames frames) {
            this.frames = frames;
            return this;
        }
        public GetVideoModerationResultResponseBodyModerationResultFrames getFrames() {
            return this.frames;
        }

        public GetVideoModerationResultResponseBodyModerationResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetVideoModerationResultResponseBodyModerationResult setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
