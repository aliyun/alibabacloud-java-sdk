// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Split")
    public String split;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainStreamTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStreamTranscodeDataRequest self = new DescribeLiveDomainStreamTranscodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setSplit(String split) {
        this.split = split;
        return this;
    }
    public String getSplit() {
        return this.split;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
