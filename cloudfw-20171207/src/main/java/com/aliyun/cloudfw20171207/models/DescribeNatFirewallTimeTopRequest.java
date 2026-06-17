// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallTimeTopRequest extends TeaModel {
    /**
     * <p>The time interval.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The language of the content within the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of top entries to return. The default value is 200. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-uf62zzi7000bca7zn****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The sorting method.</p>
     * 
     * <strong>example:</strong>
     * <p>total_max_bps</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The private IP address of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.134.XXX</p>
     */
    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    /**
     * <p>The public IP address of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>47.93.47.XXX</p>
     */
    @NameInMap("SrcPublicIP")
    public String srcPublicIP;

    /**
     * <p>The point in time to query the traffic data. This is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749693960</p>
     */
    @NameInMap("TrafficTime")
    public String trafficTime;

    public static DescribeNatFirewallTimeTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallTimeTopRequest self = new DescribeNatFirewallTimeTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallTimeTopRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeNatFirewallTimeTopRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallTimeTopRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeNatFirewallTimeTopRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatFirewallTimeTopRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeNatFirewallTimeTopRequest setSrcPrivateIP(String srcPrivateIP) {
        this.srcPrivateIP = srcPrivateIP;
        return this;
    }
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    public DescribeNatFirewallTimeTopRequest setSrcPublicIP(String srcPublicIP) {
        this.srcPublicIP = srcPublicIP;
        return this;
    }
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    public DescribeNatFirewallTimeTopRequest setTrafficTime(String trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public String getTrafficTime() {
        return this.trafficTime;
    }

}
