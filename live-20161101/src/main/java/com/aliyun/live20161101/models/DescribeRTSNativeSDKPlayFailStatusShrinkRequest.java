// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRTSNativeSDKPlayFailStatusShrinkRequest extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainNameList")
    public String domainNameListShrink;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRTSNativeSDKPlayFailStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRTSNativeSDKPlayFailStatusShrinkRequest self = new DescribeRTSNativeSDKPlayFailStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRTSNativeSDKPlayFailStatusShrinkRequest setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeRTSNativeSDKPlayFailStatusShrinkRequest setDomainNameListShrink(String domainNameListShrink) {
        this.domainNameListShrink = domainNameListShrink;
        return this;
    }
    public String getDomainNameListShrink() {
        return this.domainNameListShrink;
    }

    public DescribeRTSNativeSDKPlayFailStatusShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRTSNativeSDKPlayFailStatusShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
