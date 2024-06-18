// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>84600</p>
     */
    @NameInMap("avgWatchTime")
    public Long avgWatchTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("liveUv")
    public Integer liveUv;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("msgCount")
    public Integer msgCount;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("playbackUv")
    public Integer playbackUv;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("praiseCount")
    public Integer praiseCount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("pv")
    public Integer pv;

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
     * <p>1222000</p>
     */
    @NameInMap("totalWatchTime")
    public Long totalWatchTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("uv")
    public Integer uv;

    public static QueryLiveWatchDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchDetailResponseBody self = new QueryLiveWatchDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchDetailResponseBody setAvgWatchTime(Long avgWatchTime) {
        this.avgWatchTime = avgWatchTime;
        return this;
    }
    public Long getAvgWatchTime() {
        return this.avgWatchTime;
    }

    public QueryLiveWatchDetailResponseBody setLiveUv(Integer liveUv) {
        this.liveUv = liveUv;
        return this;
    }
    public Integer getLiveUv() {
        return this.liveUv;
    }

    public QueryLiveWatchDetailResponseBody setMsgCount(Integer msgCount) {
        this.msgCount = msgCount;
        return this;
    }
    public Integer getMsgCount() {
        return this.msgCount;
    }

    public QueryLiveWatchDetailResponseBody setPlaybackUv(Integer playbackUv) {
        this.playbackUv = playbackUv;
        return this;
    }
    public Integer getPlaybackUv() {
        return this.playbackUv;
    }

    public QueryLiveWatchDetailResponseBody setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
        return this;
    }
    public Integer getPraiseCount() {
        return this.praiseCount;
    }

    public QueryLiveWatchDetailResponseBody setPv(Integer pv) {
        this.pv = pv;
        return this;
    }
    public Integer getPv() {
        return this.pv;
    }

    public QueryLiveWatchDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLiveWatchDetailResponseBody setTotalWatchTime(Long totalWatchTime) {
        this.totalWatchTime = totalWatchTime;
        return this;
    }
    public Long getTotalWatchTime() {
        return this.totalWatchTime;
    }

    public QueryLiveWatchDetailResponseBody setUv(Integer uv) {
        this.uv = uv;
        return this;
    }
    public Integer getUv() {
        return this.uv;
    }

}
