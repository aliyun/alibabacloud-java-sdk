// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeUserBandWidthDataRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    @NameInMap("Isp")
    public String isp;

    public static DescribeUserBandWidthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBandWidthDataRequest self = new DescribeUserBandWidthDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBandWidthDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeUserBandWidthDataRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeUserBandWidthDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserBandWidthDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUserBandWidthDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUserBandWidthDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeUserBandWidthDataRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

}
