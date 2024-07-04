// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
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
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>08027633-8501-5A36-B90D-F7C38B5EC75D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp. The time follows the ISO 8601 standard. The time is displayed in UTC. Example: 2016-10-20T04:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-12T05:45:00Z</p>
     */
    @NameInMap("TimeStamp")
    public String timeStamp;

    public static DescribeBandwitdhByInternetChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwitdhByInternetChargeTypeResponseBody self = new DescribeBandwitdhByInternetChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwitdhByInternetChargeTypeResponseBody setBandwidthValue(Long bandwidthValue) {
        this.bandwidthValue = bandwidthValue;
        return this;
    }
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    public DescribeBandwitdhByInternetChargeTypeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeBandwitdhByInternetChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwitdhByInternetChargeTypeResponseBody setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

}
