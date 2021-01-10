// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataRequest extends TeaModel {
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

    public static DescribeUpPeakPublishStreamDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpPeakPublishStreamDataRequest self = new DescribeUpPeakPublishStreamDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUpPeakPublishStreamDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUpPeakPublishStreamDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUpPeakPublishStreamDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUpPeakPublishStreamDataRequest setDomainSwitch(String domainSwitch) {
        this.domainSwitch = domainSwitch;
        return this;
    }
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    public DescribeUpPeakPublishStreamDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
