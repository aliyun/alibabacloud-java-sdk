// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The bandwidth. Unit: bit/s.</p>
     */
    @NameInMap("BandwidthValue")
    public Long bandwidthValue;

    /**
     * <p>The metering method. Valid values:</p>
     * <br>
     * <p>*   BandwidthByDay: Pay by daily peak bandwidth</p>
     * <p>*   95BandwidthByMonth: Pay by monthly 95th percentile bandwidth</p>
     * <p>*   PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth</p>
     * <p>*   PayByBandwidth: Pay by fixed bandwidth</p>
     * <br>
     * <p>You can specify only one metering method for network usage and cannot overwrite the existing metering method.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the monitoring data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
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
