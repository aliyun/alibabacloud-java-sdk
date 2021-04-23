// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Split")
    public String split;

    public static DescribeLiveDomainStreamTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStreamTranscodeDataRequest self = new DescribeLiveDomainStreamTranscodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainStreamTranscodeDataRequest setSplit(String split) {
        this.split = split;
        return this;
    }
    public String getSplit() {
        return this.split;
    }

}
