// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosPeakFlowRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Ip")
    public String ip;

    public static DescribeDdosPeakFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosPeakFlowRequest self = new DescribeDdosPeakFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosPeakFlowRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDdosPeakFlowRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDdosPeakFlowRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDdosPeakFlowRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDdosPeakFlowRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
