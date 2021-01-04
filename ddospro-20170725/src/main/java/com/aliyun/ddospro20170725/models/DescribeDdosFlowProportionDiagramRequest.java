// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosFlowProportionDiagramRequest extends TeaModel {
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

    public static DescribeDdosFlowProportionDiagramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosFlowProportionDiagramRequest self = new DescribeDdosFlowProportionDiagramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosFlowProportionDiagramRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDdosFlowProportionDiagramRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDdosFlowProportionDiagramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDdosFlowProportionDiagramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDdosFlowProportionDiagramRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
