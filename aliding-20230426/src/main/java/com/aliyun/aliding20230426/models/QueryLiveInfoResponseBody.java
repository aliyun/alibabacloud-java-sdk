// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/kk.jpg">http://xxx/kk.jpg</a></p>
     */
    @NameInMap("coverUrl")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>59886</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>1662447951960</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("introduction")
    public String introduction;

    /**
     * <strong>example:</strong>
     * <p>1211-3442-122</p>
     */
    @NameInMap("liveId")
    public String liveId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://ssssss">http://ssssss</a></p>
     */
    @NameInMap("livePlayUrl")
    public String livePlayUrl;

    @NameInMap("liveStatus")
    public Integer liveStatus;

    /**
     * <strong>example:</strong>
     * <p>13414</p>
     */
    @NameInMap("playbackDuration")
    public Long playbackDuration;

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
     * <p>1627353123000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("subscribeCount")
    public Integer subscribeCount;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("uv")
    public Integer uv;

    public static QueryLiveInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveInfoResponseBody self = new QueryLiveInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLiveInfoResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public QueryLiveInfoResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public QueryLiveInfoResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryLiveInfoResponseBody setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public QueryLiveInfoResponseBody setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveInfoResponseBody setLivePlayUrl(String livePlayUrl) {
        this.livePlayUrl = livePlayUrl;
        return this;
    }
    public String getLivePlayUrl() {
        return this.livePlayUrl;
    }

    public QueryLiveInfoResponseBody setLiveStatus(Integer liveStatus) {
        this.liveStatus = liveStatus;
        return this;
    }
    public Integer getLiveStatus() {
        return this.liveStatus;
    }

    public QueryLiveInfoResponseBody setPlaybackDuration(Long playbackDuration) {
        this.playbackDuration = playbackDuration;
        return this;
    }
    public Long getPlaybackDuration() {
        return this.playbackDuration;
    }

    public QueryLiveInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLiveInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryLiveInfoResponseBody setSubscribeCount(Integer subscribeCount) {
        this.subscribeCount = subscribeCount;
        return this;
    }
    public Integer getSubscribeCount() {
        return this.subscribeCount;
    }

    public QueryLiveInfoResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryLiveInfoResponseBody setUv(Integer uv) {
        this.uv = uv;
        return this;
    }
    public Integer getUv() {
        return this.uv;
    }

}
