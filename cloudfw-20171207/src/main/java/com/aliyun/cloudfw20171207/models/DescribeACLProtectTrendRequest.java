// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendRequest extends TeaModel {
    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1670397599</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the firewall border. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong> (default): Internet Border firewall, which monitors traffic between the Internet and your assets.</li>
     * <li><strong>vpc</strong>: virtual private cloud (VPC) firewalls, which monitor traffic between VPCs.</li>
     * <li><strong>nat</strong>: NAT firewalls, which monitor traffic from internal-facing assets to the Internet.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The time aggregation granularity for trend data, in seconds. Valid values:</p>
     * <ul>
     * <li><strong>60</strong>: 1-minute granularity (uses the minute-level detail table).</li>
     * <li><strong>1800</strong>: 30-minute granularity.</li>
     * <li><strong>3600</strong>: 1-hour granularity.</li>
     * <li><strong>86400</strong> (default): 1-day granularity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>223.95.87.130</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1677050306</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeACLProtectTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLProtectTrendRequest self = new DescribeACLProtectTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeACLProtectTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeACLProtectTrendRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeACLProtectTrendRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeACLProtectTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    @Deprecated
    public DescribeACLProtectTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeACLProtectTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
