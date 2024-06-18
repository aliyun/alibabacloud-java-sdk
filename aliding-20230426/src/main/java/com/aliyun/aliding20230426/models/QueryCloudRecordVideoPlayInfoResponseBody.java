// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>59886</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>1127942</p>
     */
    @NameInMap("fileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p><a href="https://vod.mcs.dingtalk.com/faa1566c5bc24f21821ae2394f82db2e/8bbd1612e686462ab4717919f67bb721-b8531e0d534b2f9747a9fdfxxxxxxxxc-sd.mp4">https://vod.mcs.dingtalk.com/faa1566c5bc24f21821ae2394f82db2e/8bbd1612e686462ab4717919f67bb721-b8531e0d534b2f9747a9fdfxxxxxxxxc-sd.mp4</a></p>
     */
    @NameInMap("mp4FileUrl")
    public String mp4FileUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://vod.mcs.dingtalk.com/faa1566c5bc24f21821ae2394f82db2e/8bbd1612e686462ab4717919f67bb721-ab85cc044a163568c9485xxxxxxxx76d-sd.m3u8">https://vod.mcs.dingtalk.com/faa1566c5bc24f21821ae2394f82db2e/8bbd1612e686462ab4717919f67bb721-ab85cc044a163568c9485xxxxxxxx76d-sd.m3u8</a></p>
     */
    @NameInMap("playUrl")
    public String playUrl;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
