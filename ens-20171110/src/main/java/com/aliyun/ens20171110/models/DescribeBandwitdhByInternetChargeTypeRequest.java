// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandwitdhByInternetChargeTypeRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    public static DescribeBandwitdhByInternetChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwitdhByInternetChargeTypeRequest self = new DescribeBandwitdhByInternetChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandwitdhByInternetChargeTypeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeBandwitdhByInternetChargeTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeBandwitdhByInternetChargeTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBandwitdhByInternetChargeTypeRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeBandwitdhByInternetChargeTypeRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
