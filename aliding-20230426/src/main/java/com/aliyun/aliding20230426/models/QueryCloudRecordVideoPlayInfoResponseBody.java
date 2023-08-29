// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoResponseBody extends TeaModel {
    @NameInMap("duration")
    public Long duration;

    @NameInMap("fileSize")
    public Long fileSize;

    @NameInMap("mp4FileUrl")
    public String mp4FileUrl;

    @NameInMap("playUrl")
    public String playUrl;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public Long status;

    public static QueryCloudRecordVideoPlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoPlayInfoResponseBody self = new QueryCloudRecordVideoPlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setMp4FileUrl(String mp4FileUrl) {
        this.mp4FileUrl = mp4FileUrl;
        return this;
    }
    public String getMp4FileUrl() {
        return this.mp4FileUrl;
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }
    public String getPlayUrl() {
        return this.playUrl;
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCloudRecordVideoPlayInfoResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
