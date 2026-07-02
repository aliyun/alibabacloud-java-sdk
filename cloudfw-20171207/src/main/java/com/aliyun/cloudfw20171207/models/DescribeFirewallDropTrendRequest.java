// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropTrendRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify the value as a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1758474000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start time of the query. Specify the value as a UNIX timestamp in seconds.</p>
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
