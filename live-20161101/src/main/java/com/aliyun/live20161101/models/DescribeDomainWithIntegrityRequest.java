// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainWithIntegrityRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Integrity")
    public Float integrity;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainWithIntegrityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainWithIntegrityRequest self = new DescribeDomainWithIntegrityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainWithIntegrityRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainWithIntegrityRequest setIntegrity(Float integrity) {
        this.integrity = integrity;
        return this;
    }
    public Float getIntegrity() {
        return this.integrity;
    }

    public DescribeDomainWithIntegrityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainWithIntegrityRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
