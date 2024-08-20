// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchGetProjectTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultList")
    public java.util.List<BatchGetProjectTaskResponseBodyResultList> resultList;

    public static BatchGetProjectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetProjectTaskResponseBody self = new BatchGetProjectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetProjectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetProjectTaskResponseBody setResultList(java.util.List<BatchGetProjectTaskResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<BatchGetProjectTaskResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class BatchGetProjectTaskResponseBodyResultList extends TeaModel {
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("videoDownloadUrl")
        public String videoDownloadUrl;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("videoDuration")
        public Integer videoDuration;

        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("videoUrl")
        public String videoUrl;

        public static BatchGetProjectTaskResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetProjectTaskResponseBodyResultList self = new BatchGetProjectTaskResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public BatchGetProjectTaskResponseBodyResultList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchGetProjectTaskResponseBodyResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetProjectTaskResponseBodyResultList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public BatchGetProjectTaskResponseBodyResultList setVideoDownloadUrl(String videoDownloadUrl) {
            this.videoDownloadUrl = videoDownloadUrl;
            return this;
        }
        public String getVideoDownloadUrl() {
            return this.videoDownloadUrl;
        }

        public BatchGetProjectTaskResponseBodyResultList setVideoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        public BatchGetProjectTaskResponseBodyResultList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
