// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTrendRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    @NameInMap("SrcPublicIP")
    public String srcPublicIP;

    @NameInMap("StartTime")
    public String startTime;

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
