// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRtcRecordUsageDataRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraVideo Real-time Communication application. You can view the ID in <a href="https://help.aliyun.com/document_detail/2355593.html">ApsaraVideo Real-time Communication application management</a>. Navigate to <strong>ApsaraVideo Live &gt; Live+ &gt; Real-time Communication &gt; Application Management</strong> to view your application IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>intl7f92-a5a8*************7ce4eb44a6</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time for the query. The query granularity must be ≥ 5 minutes and ≤ 31 days. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for the query data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>3600 (default).</p>
     * </li>
     * <li><ol start="86400">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The recording mode. Valid values:</p>
     * <ul>
     * <li><p>0: single-stream recording mode.</p>
     * </li>
     * <li><p>1: stream mixing recording mode.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecordMode")
    public String recordMode;

    /**
     * <p>The start time for the query. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveRtcRecordUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRtcRecordUsageDataRequest self = new DescribeLiveRtcRecordUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRtcRecordUsageDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeLiveRtcRecordUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveRtcRecordUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveRtcRecordUsageDataRequest setRecordMode(String recordMode) {
        this.recordMode = recordMode;
        return this;
    }
    public String getRecordMode() {
        return this.recordMode;
    }

    public DescribeLiveRtcRecordUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
