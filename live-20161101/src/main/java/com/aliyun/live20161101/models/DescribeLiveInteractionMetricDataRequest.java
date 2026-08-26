// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveInteractionMetricDataRequest extends TeaModel {
    /**
     * <p>The ARTC application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e4d7f08a-01fe-41b5-a091-fe41060a****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The start time of the query, specified as a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698195600000</p>
     */
    @NameInMap("BeginTs")
    public Long beginTs;

    /**
     * <p>The channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>770513</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The end time of the query, specified as a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698201013000</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li><p><code>JoinChannelSucRate</code>: the success rate of joining a channel within 5 seconds.</p>
     * </li>
     * <li><p><code>VideoStuckRate</code>: the video stuttering rate.</p>
     * </li>
     * <li><p><code>AudioStuckRate</code>: the audio stuttering rate.</p>
     * </li>
     * <li><p><code>FirstFrameCost</code>: the time to first frame.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FirstFrameCost</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The operating system. Valid values: <code>iOS</code> and <code>Android</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The terminal type. Valid values: <code>web</code> and <code>mobile</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribeLiveInteractionMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveInteractionMetricDataRequest self = new DescribeLiveInteractionMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveInteractionMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLiveInteractionMetricDataRequest setBeginTs(Long beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public Long getBeginTs() {
        return this.beginTs;
    }

    public DescribeLiveInteractionMetricDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeLiveInteractionMetricDataRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeLiveInteractionMetricDataRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeLiveInteractionMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeLiveInteractionMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
