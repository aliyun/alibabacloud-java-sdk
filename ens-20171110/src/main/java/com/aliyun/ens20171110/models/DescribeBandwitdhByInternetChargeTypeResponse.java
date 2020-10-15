// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandwitdhByInternetChargeTypeResponse extends TeaModel {
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

    public static DescribeBandwitdhByInternetChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwitdhByInternetChargeTypeResponse self = new DescribeBandwitdhByInternetChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setBandwidthValue(Long bandwidthValue) {
        this.bandwidthValue = bandwidthValue;
        return this;
    }
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    public DescribeBandwitdhByInternetChargeTypeResponse setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
