// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InternetChargeType")
    @Validation(required = true)
    public String internetChargeType;

    @NameInMap("BandwidthValue")
    @Validation(required = true)
    public Long bandwidthValue;

    @NameInMap("TimeStamp")
    @Validation(required = true)
    public String timeStamp;

    public static DescribeEpnBandwitdhByInternetChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandwitdhByInternetChargeTypeResponse self = new DescribeEpnBandwitdhByInternetChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setBandwidthValue(Long bandwidthValue) {
        this.bandwidthValue = bandwidthValue;
        return this;
    }
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
