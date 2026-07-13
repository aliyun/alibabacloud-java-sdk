// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsHistoryRequest extends TeaModel {
    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt;You can get this value by calling the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a> operation.
     * &lt;props=&quot;intl&quot;&gt;You can get this value by calling the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. This value is a Unix timestamp in milliseconds.</p>
     * <blockquote>
     * <p>Warning: A large time range for a domain with a high volume of resolution logs may cause query timeouts or inaccurate results.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1741526400000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The DNS response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <p>The server region.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-3</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <p>The start of the time range to query. This value is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The statistical metric type.</p>
     * 
     * <strong>example:</strong>
     * <p>PROTOCOL
     * 其它：
     * PROTOCOL：DNS请求UDP协议、TCP协议维度统计（仅全局域名统计）
     * QTYPE：DNS请求记录类型分布，如A、AAAA、CNAME、MX 等
     * RCODE：DNS否定应答统计
     * SUCCESS_RATIO：SUCCESS_RATIO：平均解析成功率（解析成功率 = 返回与请求记录类型（QTYPE）匹配的有效应答次数 / 总解析次数）
     * REQUEST：DNS请求量统计，展示QPS查询趋势</p>
     */
    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
     * <p>The zone name.</p>
     * 
     * <strong>example:</strong>
     * <p>lisheng999.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeInterAuthStatisticsHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsHistoryRequest self = new DescribeInterAuthStatisticsHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeInterAuthStatisticsHistoryRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeInterAuthStatisticsHistoryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribeInterAuthStatisticsHistoryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribeInterAuthStatisticsHistoryRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeInterAuthStatisticsHistoryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribeInterAuthStatisticsHistoryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
