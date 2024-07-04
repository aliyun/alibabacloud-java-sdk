// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    /**
     * <p>The bandwidth. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BandwidthValue")
    public Long bandwidthValue;

    /**
     * <p>The metering method. Valid values:</p>
     * <ul>
     * <li>BandwidthByDay: Pay by daily peak bandwidth</li>
     * <li>95BandwidthByMonth: Pay by monthly 95th percentile bandwidth</li>
     * <li>PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth</li>
     * <li>PayByBandwidth: Pay by fixed bandwidth</li>
     * </ul>
     * <p>You can specify only one metering method for network usage and cannot overwrite the existing metering method.</p>
     * 
     * <strong>example:</strong>
     * <p>BandwidthByDay</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>216BCED0-E055-5DDB-8E06-4084A62A4A44</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp when the monitoring data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-12T05:45:00Z</p>
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
