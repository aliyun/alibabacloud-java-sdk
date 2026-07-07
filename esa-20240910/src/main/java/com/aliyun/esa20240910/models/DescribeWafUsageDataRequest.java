// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeWafUsageDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-10T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for the query data, in seconds.</p>
     * <p>The valid values vary based on the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>:</p>
     * <ul>
     * <li><p>Less than 3 days: <strong>300</strong>, <strong>3600</strong>, or <strong>86400</strong>. Default value: <strong>300</strong>.</p>
     * </li>
     * <li><p>3 to 31 days (excluding 31 days): <strong>3600</strong> or <strong>86400</strong>. Default value: <strong>3600</strong>.</p>
     * </li>
     * <li><p>31 days or more: <strong>86400</strong>. Default value: <strong>86400</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The domain record name. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the domain record name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The grouping key. You can set this parameter to <strong>domain</strong>.</p>
     * <ul>
     * <li><strong>domain</strong>: groups the data by domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-10T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeWafUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafUsageDataRequest self = new DescribeWafUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWafUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeWafUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeWafUsageDataRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public DescribeWafUsageDataRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeWafUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeWafUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
