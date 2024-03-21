// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeHighlightInfoRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The access language. Valid values:</p>
     * <br>
     * <p>*   **en-US** (default): English</p>
     * <p>*   **zh-CN**: Chinese</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the trace.</p>
     */
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
