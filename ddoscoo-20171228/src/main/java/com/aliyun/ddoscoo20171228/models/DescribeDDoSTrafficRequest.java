// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSTrafficRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Eip")
    @Validation(required = true)
    public String eip;

    public static DescribeDDoSTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSTrafficRequest self = new DescribeDDoSTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSTrafficRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDDoSTrafficRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDDoSTrafficRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDDoSTrafficRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDDoSTrafficRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSTrafficRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }
    public String getEip() {
        return this.eip;
    }

}
