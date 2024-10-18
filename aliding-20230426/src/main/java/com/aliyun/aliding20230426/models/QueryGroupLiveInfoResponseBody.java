// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryGroupLiveInfoResponseBody extends TeaModel {
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
     * <p>1687928400000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("introduction")
    public String introduction;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
     * <p>1687924800000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
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

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static QueryGroupLiveInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupLiveInfoResponseBody self = new QueryGroupLiveInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupLiveInfoResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public QueryGroupLiveInfoResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public QueryGroupLiveInfoResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryGroupLiveInfoResponseBody setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public QueryGroupLiveInfoResponseBody setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryGroupLiveInfoResponseBody setLivePlayUrl(String livePlayUrl) {
        this.livePlayUrl = livePlayUrl;
        return this;
    }
    public String getLivePlayUrl() {
        return this.livePlayUrl;
    }

    public QueryGroupLiveInfoResponseBody setLiveStatus(Integer liveStatus) {
        this.liveStatus = liveStatus;
        return this;
    }
    public Integer getLiveStatus() {
        return this.liveStatus;
    }

    public QueryGroupLiveInfoResponseBody setPlaybackDuration(Long playbackDuration) {
        this.playbackDuration = playbackDuration;
        return this;
    }
    public Long getPlaybackDuration() {
        return this.playbackDuration;
    }

    public QueryGroupLiveInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGroupLiveInfoResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryGroupLiveInfoResponseBody setSubscribeCount(Integer subscribeCount) {
        this.subscribeCount = subscribeCount;
        return this;
    }
    public Integer getSubscribeCount() {
        return this.subscribeCount;
    }

    public QueryGroupLiveInfoResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryGroupLiveInfoResponseBody setUv(Integer uv) {
        this.uv = uv;
        return this;
    }
    public Integer getUv() {
        return this.uv;
    }

    public QueryGroupLiveInfoResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryGroupLiveInfoResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
