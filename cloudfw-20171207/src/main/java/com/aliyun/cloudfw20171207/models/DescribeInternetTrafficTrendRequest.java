// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendRequest extends TeaModel {
    /**
     * <p>The direction of the Internet traffic. Valid values:</p>
     * <ul>
     * <li><p><strong>in</strong>: inbound</p>
     * </li>
     * <li><p><strong>out</strong>: outbound</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1674958929</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source tracking code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>101.80.171.196</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The source private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.134.60</p>
     */
    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    /**
     * <p>The source public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.112.210.136</p>
     */
    @NameInMap("SrcPublicIP")
    public String srcPublicIP;

    /**
     * <p>The start of the time range to query. This value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1670307484</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of traffic to query. Valid values:</p>
     * <ul>
     * <li><p><strong>max</strong> (default): peak traffic</p>
     * </li>
     * <li><p><strong>avg</strong>: average traffic</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static DescribeInternetTrafficTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTrafficTrendRequest self = new DescribeInternetTrafficTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTrafficTrendRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeInternetTrafficTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInternetTrafficTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetTrafficTrendRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    @Deprecated
    public DescribeInternetTrafficTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInternetTrafficTrendRequest setSrcPrivateIP(String srcPrivateIP) {
        this.srcPrivateIP = srcPrivateIP;
        return this;
    }
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    public DescribeInternetTrafficTrendRequest setSrcPublicIP(String srcPublicIP) {
        this.srcPublicIP = srcPublicIP;
        return this;
    }
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    public DescribeInternetTrafficTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInternetTrafficTrendRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
