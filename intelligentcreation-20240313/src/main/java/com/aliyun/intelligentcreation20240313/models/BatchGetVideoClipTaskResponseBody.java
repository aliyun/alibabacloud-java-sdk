// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetVideoClipTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskList")
    public java.util.List<BatchGetVideoClipTaskResponseBodyTaskList> taskList;

    public static BatchGetVideoClipTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoClipTaskResponseBody self = new BatchGetVideoClipTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoClipTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetVideoClipTaskResponseBody setTaskList(java.util.List<BatchGetVideoClipTaskResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<BatchGetVideoClipTaskResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class BatchGetVideoClipTaskResponseBodyTaskListVideoList extends TeaModel {
        @NameInMap("beginTime")
        public Integer beginTime;

        @NameInMap("description")
        public String description;

        @NameInMap("endTime")
        public Integer endTime;

        @NameInMap("errorMsg")
        public String errorMsg;

        @NameInMap("title")
        public String title;

        @NameInMap("videoDownloadUrl")
        public String videoDownloadUrl;

        @NameInMap("videoName")
        public String videoName;

        @NameInMap("videoUrl")
        public String videoUrl;

        public static BatchGetVideoClipTaskResponseBodyTaskListVideoList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoClipTaskResponseBodyTaskListVideoList self = new BatchGetVideoClipTaskResponseBodyTaskListVideoList();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Integer getBeginTime() {
            return this.beginTime;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setVideoDownloadUrl(String videoDownloadUrl) {
            this.videoDownloadUrl = videoDownloadUrl;
            return this;
        }
        public String getVideoDownloadUrl() {
            return this.videoDownloadUrl;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public BatchGetVideoClipTaskResponseBodyTaskListVideoList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class BatchGetVideoClipTaskResponseBodyTaskList extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("totalDuration")
        public Double totalDuration;

        @NameInMap("totalToken")
        public Long totalToken;

        @NameInMap("videoList")
        public java.util.List<BatchGetVideoClipTaskResponseBodyTaskListVideoList> videoList;

        public static BatchGetVideoClipTaskResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetVideoClipTaskResponseBodyTaskList self = new BatchGetVideoClipTaskResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public BatchGetVideoClipTaskResponseBodyTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetVideoClipTaskResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchGetVideoClipTaskResponseBodyTaskList setTotalDuration(Double totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Double getTotalDuration() {
            return this.totalDuration;
        }

        public BatchGetVideoClipTaskResponseBodyTaskList setTotalToken(Long totalToken) {
            this.totalToken = totalToken;
            return this;
        }
        public Long getTotalToken() {
            return this.totalToken;
        }

        public BatchGetVideoClipTaskResponseBodyTaskList setVideoList(java.util.List<BatchGetVideoClipTaskResponseBodyTaskListVideoList> videoList) {
            this.videoList = videoList;
            return this;
        }
        public java.util.List<BatchGetVideoClipTaskResponseBodyTaskListVideoList> getVideoList() {
            return this.videoList;
        }

    }

}
