// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetProjectTaskResponseBody extends TeaModel {
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    @NameInMap("videoDownloadUrl")
    public String videoDownloadUrl;

    @NameInMap("videoDuration")
    public Integer videoDuration;

    @NameInMap("videoUrl")
    public String videoUrl;

    public static GetProjectTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectTaskResponseBody self = new GetProjectTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetProjectTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetProjectTaskResponseBody setVideoDownloadUrl(String videoDownloadUrl) {
        this.videoDownloadUrl = videoDownloadUrl;
        return this;
    }
    public String getVideoDownloadUrl() {
        return this.videoDownloadUrl;
    }

    public GetProjectTaskResponseBody setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

    public GetProjectTaskResponseBody setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
