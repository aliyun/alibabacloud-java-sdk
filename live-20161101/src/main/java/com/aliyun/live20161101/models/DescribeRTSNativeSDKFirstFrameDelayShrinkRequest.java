// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKFirstFrameDelayShrinkRequest extends TeaModel {
    /**
     * <p>The time granularity. Valid values: 300, 3600, 14400, 28800, and 86400. Unit: seconds. If you do not specify this parameter or specify an unsupported value, the default value 300 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The domain names to query. By default, all domain names are queried (version 2.1.0 and later). You can also specify domain names. Separate multiple domain names with commas (,). You can specify up to 500 domain names at a time.</p>
     */
    @NameInMap("DomainNameList")
    public String domainNameListShrink;

    /**
     * <p>The end time. This parameter is required. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The start time. This parameter is required. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRTSNativeSDKFirstFrameDelayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKFirstFrameDelayShrinkRequest self = new DescribeRTSNativeSDKFirstFrameDelayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKFirstFrameDelayShrinkRequest setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKFirstFrameDelayShrinkRequest setDomainNameListShrink(String domainNameListShrink) {
        this.domainNameListShrink = domainNameListShrink;
        return this;
    }
    public String getDomainNameListShrink() {
        return this.domainNameListShrink;
    }

    public DescribeRTSNativeSDKFirstFrameDelayShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKFirstFrameDelayShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
