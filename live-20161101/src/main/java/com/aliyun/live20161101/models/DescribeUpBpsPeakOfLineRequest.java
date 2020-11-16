// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakOfLineRequest extends TeaModel {
    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Line")
    @Validation(required = true)
    public String line;

    @NameInMap("DomainSwitch")
    public String domainSwitch;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeUpBpsPeakOfLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakOfLineRequest self = new DescribeUpBpsPeakOfLineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakOfLineRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUpBpsPeakOfLineRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUpBpsPeakOfLineRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeUpBpsPeakOfLineRequest setDomainSwitch(String domainSwitch) {
        this.domainSwitch = domainSwitch;
        return this;
    }
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    public DescribeUpBpsPeakOfLineRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
