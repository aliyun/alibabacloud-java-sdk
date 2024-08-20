// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeHighlightInfoRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-10T02:43:34Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The access language. Valid values:</p>
     * <ul>
     * <li><strong>en-US</strong> (default): English.</li>
     * <li><strong>zh-CN</strong>: Chinese.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en_US</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-19T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the trace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>800e749616838513398137319e</p>
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
