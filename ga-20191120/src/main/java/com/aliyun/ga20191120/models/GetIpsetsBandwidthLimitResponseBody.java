// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetIpsetsBandwidthLimitResponseBody extends TeaModel {
    /**
     * <p>The type of the bandwidth that is allocated.</p>
     * <ul>
     * <li><strong>ShareBandwidth:</strong> shared bandwidth.</li>
     * <li><strong>ExclusiveBandwidth:</strong> dedicated bandwidth.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ShareBandwidth</p>
     */
    @NameInMap("BandwidthAllocationType")
    public String bandwidthAllocationType;

    /**
     * <p>The maximum bandwidth of the acceleration area. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("BandwidthLimit")
    public Long bandwidthLimit;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIpsetsBandwidthLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpsetsBandwidthLimitResponseBody self = new GetIpsetsBandwidthLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpsetsBandwidthLimitResponseBody setBandwidthAllocationType(String bandwidthAllocationType) {
        this.bandwidthAllocationType = bandwidthAllocationType;
        return this;
    }
    public String getBandwidthAllocationType() {
        return this.bandwidthAllocationType;
    }

    public GetIpsetsBandwidthLimitResponseBody setBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public GetIpsetsBandwidthLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
