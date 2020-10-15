// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    public static DescribeEpnBandwitdhByInternetChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandwitdhByInternetChargeTypeRequest self = new DescribeEpnBandwitdhByInternetChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

}
