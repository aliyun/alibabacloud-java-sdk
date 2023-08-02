// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeHighlightInfoRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeHighlightInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighlightInfoRequest self = new DescribeHighlightInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHighlightInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHighlightInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeHighlightInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeHighlightInfoRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
