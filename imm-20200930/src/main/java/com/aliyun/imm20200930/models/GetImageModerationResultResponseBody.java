// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetImageModerationResultResponseBody extends TeaModel {
    /**
     * <p>The error code of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-03T09:44:32Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B6-1XBMX3BixLMILvXVGtlkr******</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The error message of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource TaskId is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The result of the image compliance detection task.</p>
     */
    @NameInMap("ModerationResult")
    public GetImageModerationResultResponseBodyModerationResult moderationResult;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6A120B1-BEB3-0F63-A7C2-0783B6******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-03T09:44:31.029Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageModeration-ff207203-3f93-4645-a041-7b8f0f******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageModeration</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The custom information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;fileId&quot;: &quot;123&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetImageModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageModerationResultResponseBody self = new GetImageModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageModerationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageModerationResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetImageModerationResultResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetImageModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageModerationResultResponseBody setModerationResult(GetImageModerationResultResponseBodyModerationResult moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }
    public GetImageModerationResultResponseBodyModerationResult getModerationResult() {
        return this.moderationResult;
    }

    public GetImageModerationResultResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetImageModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageModerationResultResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetImageModerationResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageModerationResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetImageModerationResultResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetImageModerationResultResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetImageModerationResultResponseBodyModerationResultFramesBlockFrames extends TeaModel {
        /**
         * <p>The label of the violation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;test&quot;: &quot;val&quot;
         * }</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The offset of the frame.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The confidence level of the violation.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Rate")
        public Double rate;

        public static GetImageModerationResultResponseBodyModerationResultFramesBlockFrames build(java.util.Map<String, ?> map) throws Exception {
            GetImageModerationResultResponseBodyModerationResultFramesBlockFrames self = new GetImageModerationResultResponseBodyModerationResultFramesBlockFrames();
            return TeaModel.build(map, self);
        }

        public GetImageModerationResultResponseBodyModerationResultFramesBlockFrames setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetImageModerationResultResponseBodyModerationResultFramesBlockFrames setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public GetImageModerationResultResponseBodyModerationResultFramesBlockFrames setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

    }

    public static class GetImageModerationResultResponseBodyModerationResultFrames extends TeaModel {
        /**
         * <p>The violated frames.</p>
         */
        @NameInMap("BlockFrames")
        public java.util.List<GetImageModerationResultResponseBodyModerationResultFramesBlockFrames> blockFrames;

        /**
         * <p>The total number of detected frames.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetImageModerationResultResponseBodyModerationResultFrames build(java.util.Map<String, ?> map) throws Exception {
            GetImageModerationResultResponseBodyModerationResultFrames self = new GetImageModerationResultResponseBodyModerationResultFrames();
            return TeaModel.build(map, self);
        }

        public GetImageModerationResultResponseBodyModerationResultFrames setBlockFrames(java.util.List<GetImageModerationResultResponseBodyModerationResultFramesBlockFrames> blockFrames) {
            this.blockFrames = blockFrames;
            return this;
        }
        public java.util.List<GetImageModerationResultResponseBodyModerationResultFramesBlockFrames> getBlockFrames() {
            return this.blockFrames;
        }

        public GetImageModerationResultResponseBodyModerationResultFrames setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetImageModerationResultResponseBodyModerationResult extends TeaModel {
        /**
         * <p>List of categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The information about video and motion detection frames.</p>
         */
        @NameInMap("Frames")
        public GetImageModerationResultResponseBodyModerationResultFrames frames;

        /**
         * <p>The recommended operation. Valid values:</p>
         * <ul>
         * <li>pass: The image has passed the check. No action is required.</li>
         * <li>review: The image contains suspected violations and requires human review.</li>
         * <li>block: The image contains violations. Further actions, such as deleting or blocking the image, are recommended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The OSS URI of the file. The URI follows the oss://${bucketname}/${objectname} format. bucketname indicates the name of an OSS bucket that is in the same region as the current project, and objectname is the file path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GetImageModerationResultResponseBodyModerationResult build(java.util.Map<String, ?> map) throws Exception {
            GetImageModerationResultResponseBodyModerationResult self = new GetImageModerationResultResponseBodyModerationResult();
            return TeaModel.build(map, self);
        }

        public GetImageModerationResultResponseBodyModerationResult setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetImageModerationResultResponseBodyModerationResult setFrames(GetImageModerationResultResponseBodyModerationResultFrames frames) {
            this.frames = frames;
            return this;
        }
        public GetImageModerationResultResponseBodyModerationResultFrames getFrames() {
            return this.frames;
        }

        public GetImageModerationResultResponseBodyModerationResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetImageModerationResultResponseBodyModerationResult setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
