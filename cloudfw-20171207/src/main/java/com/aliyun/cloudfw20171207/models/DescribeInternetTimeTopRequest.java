// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTimeTopRequest extends TeaModel {
    /**
     * <p>The direction of the traffic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the query time range, specified as a Unix timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1733796528</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The network type of the IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <p>The time interval in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return. The value must be between 1 and 50. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The NAT public IP address. If omitted, traffic data for all assets is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>47.97.66.XXX</p>
     */
    @NameInMap("NatIP")
    public String natIP;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The metric by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>in_bps</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The identifier for the trace source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>60.179.179.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>8.153.18.XX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The start of the query time range, specified as a Unix timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1749434787</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The traffic timestamp to query, specified as a Unix timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1745222880</p>
     */
    @NameInMap("TrafficTime")
    public String trafficTime;

    /**
     * <p>The traffic type.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP_TRAFFIC</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static DescribeInternetTimeTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTimeTopRequest self = new DescribeInternetTimeTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTimeTopRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeInternetTimeTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetTimeTopRequest setIPType(String IPType) {
        this.IPType = IPType;
        return this;
    }
    public String getIPType() {
        return this.IPType;
    }

    public DescribeInternetTimeTopRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeInternetTimeTopRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetTimeTopRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeInternetTimeTopRequest setNatIP(String natIP) {
        this.natIP = natIP;
        return this;
    }
    public String getNatIP() {
        return this.natIP;
    }

    public DescribeInternetTimeTopRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeInternetTimeTopRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeInternetTimeTopRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeInternetTimeTopRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInternetTimeTopRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeInternetTimeTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInternetTimeTopRequest setTrafficTime(String trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public DescribeInternetTimeTopRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
