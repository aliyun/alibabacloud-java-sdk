// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveInfoResponseBody extends TeaModel {
    @NameInMap("coverUrl")
    public String coverUrl;

    @NameInMap("duration")
    public Long duration;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("introduction")
    public String introduction;

    @NameInMap("liveId")
    public Integer liveId;

    @NameInMap("livePlayUrl")
    public String livePlayUrl;

    @NameInMap("playbackDuration")
    public Long playbackDuration;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("subscribeCount")
    public Integer subscribeCount;

    @NameInMap("title")
    public String title;

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

    public QueryLiveInfoResponseBody setLiveId(Integer liveId) {
        this.liveId = liveId;
        return this;
    }
    public Integer getLiveId() {
        return this.liveId;
    }

    public QueryLiveInfoResponseBody setLivePlayUrl(String livePlayUrl) {
        this.livePlayUrl = livePlayUrl;
        return this;
    }
    public String getLivePlayUrl() {
        return this.livePlayUrl;
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
