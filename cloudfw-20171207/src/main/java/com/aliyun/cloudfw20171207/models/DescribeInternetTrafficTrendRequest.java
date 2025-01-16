// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendRequest extends TeaModel {
    /**
     * <p>The direction of the internet traffic.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound traffic</li>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1674958929</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content in the request and response. Valid values:</p>
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
     * <p>The source code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>101.80.171.196</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The private IP address of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>10.100.134.60</p>
     */
    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    /**
     * <p>The public IP address of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>47.112.210.136</p>
     */
    @NameInMap("SrcPublicIP")
    public String srcPublicIP;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1670307484</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the traffic that is captured. Valid values:</p>
     * <ul>
     * <li><strong>max</strong> (default): peak traffic</li>
     * <li><strong>avg</strong>: average traffic</li>
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
