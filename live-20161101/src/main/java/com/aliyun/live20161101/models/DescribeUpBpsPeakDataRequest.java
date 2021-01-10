// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DomainSwitch")
    public String domainSwitch;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeUpBpsPeakDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakDataRequest self = new DescribeUpBpsPeakDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUpBpsPeakDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUpBpsPeakDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUpBpsPeakDataRequest setDomainSwitch(String domainSwitch) {
        this.domainSwitch = domainSwitch;
        return this;
    }
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    public DescribeUpBpsPeakDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
