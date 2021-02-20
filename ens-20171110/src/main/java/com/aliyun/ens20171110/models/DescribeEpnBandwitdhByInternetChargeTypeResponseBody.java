// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    @NameInMap("BandwidthValue")
    public Long bandwidthValue;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeStamp")
    public String timeStamp;

    public static DescribeEpnBandwitdhByInternetChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnBandwitdhByInternetChargeTypeResponseBody self = new DescribeEpnBandwitdhByInternetChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody setBandwidthValue(Long bandwidthValue) {
        this.bandwidthValue = bandwidthValue;
        return this;
    }
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
