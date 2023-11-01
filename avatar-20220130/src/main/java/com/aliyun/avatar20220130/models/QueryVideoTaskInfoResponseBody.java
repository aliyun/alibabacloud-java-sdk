// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryVideoTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryVideoTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryVideoTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoTaskInfoResponseBody self = new QueryVideoTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVideoTaskInfoResponseBody setData(QueryVideoTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryVideoTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryVideoTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVideoTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVideoTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVideoTaskInfoResponseBodyDataListTaskResult extends TeaModel {
        @NameInMap("AlphaUrl")
        public String alphaUrl;

        @NameInMap("AttachmentUrl")
        public String attachmentUrl;

        @NameInMap("FailCode")
        public String failCode;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("PreviewPic")
        public String previewPic;

        @NameInMap("SubtitlesUrl")
        public String subtitlesUrl;

        @NameInMap("VideoDuration")
        public Integer videoDuration;

        @NameInMap("VideoUrl")
        public String videoUrl;

        @NameInMap("WordSubtitlesUrl")
        public String wordSubtitlesUrl;

        public static QueryVideoTaskInfoResponseBodyDataListTaskResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoTaskInfoResponseBodyDataListTaskResult self = new QueryVideoTaskInfoResponseBodyDataListTaskResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setAlphaUrl(String alphaUrl) {
            this.alphaUrl = alphaUrl;
            return this;
        }
        public String getAlphaUrl() {
            return this.alphaUrl;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setAttachmentUrl(String attachmentUrl) {
            this.attachmentUrl = attachmentUrl;
            return this;
        }
        public String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setPreviewPic(String previewPic) {
            this.previewPic = previewPic;
            return this;
        }
        public String getPreviewPic() {
            return this.previewPic;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setSubtitlesUrl(String subtitlesUrl) {
            this.subtitlesUrl = subtitlesUrl;
            return this;
        }
        public String getSubtitlesUrl() {
            return this.subtitlesUrl;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setVideoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public QueryVideoTaskInfoResponseBodyDataListTaskResult setWordSubtitlesUrl(String wordSubtitlesUrl) {
            this.wordSubtitlesUrl = wordSubtitlesUrl;
            return this;
        }
        public String getWordSubtitlesUrl() {
            return this.wordSubtitlesUrl;
        }

    }

    public static class QueryVideoTaskInfoResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskResult")
        public QueryVideoTaskInfoResponseBodyDataListTaskResult taskResult;

        @NameInMap("TaskUuid")
        public String taskUuid;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public Integer type;

        public static QueryVideoTaskInfoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoTaskInfoResponseBodyDataList self = new QueryVideoTaskInfoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryVideoTaskInfoResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryVideoTaskInfoResponseBodyDataList setTaskResult(QueryVideoTaskInfoResponseBodyDataListTaskResult taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public QueryVideoTaskInfoResponseBodyDataListTaskResult getTaskResult() {
            return this.taskResult;
        }

        public QueryVideoTaskInfoResponseBodyDataList setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

        public QueryVideoTaskInfoResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryVideoTaskInfoResponseBodyDataList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryVideoTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryVideoTaskInfoResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryVideoTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoTaskInfoResponseBodyData self = new QueryVideoTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVideoTaskInfoResponseBodyData setList(java.util.List<QueryVideoTaskInfoResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryVideoTaskInfoResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryVideoTaskInfoResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryVideoTaskInfoResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryVideoTaskInfoResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
