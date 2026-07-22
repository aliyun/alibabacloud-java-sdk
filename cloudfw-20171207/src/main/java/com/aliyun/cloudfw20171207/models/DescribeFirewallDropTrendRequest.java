// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropTrendRequest extends TeaModel {
    /**
     * <p>Specifies the end time of the query. The value is a UNIX timestamp in seconds. This parameter is required and must be provided together with StartTime. The value must be a UNIX timestamp in seconds and must be later than StartTime. If this parameter is not provided, the API returns ErrorTimeError(400).</p>
     * 
     * <strong>example:</strong>
     * <p>1758474000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language type of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the start time of the query. The value is a UNIX timestamp in seconds. This parameter is required and must be provided together with EndTime. The value must be a UNIX timestamp in seconds and must be earlier than EndTime. If this parameter is not provided, the API returns ErrorTimeError(400).</p>
     * 
     * <strong>example:</strong>
     * <p>1758470400</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeFirewallDropTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallDropTrendRequest self = new DescribeFirewallDropTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallDropTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFirewallDropTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFirewallDropTrendRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
