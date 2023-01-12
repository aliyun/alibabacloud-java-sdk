// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetIpsetsBandwidthLimitResponseBody extends TeaModel {
    @NameInMap("BandwidthAllocationType")
    public String bandwidthAllocationType;

    @NameInMap("BandwidthLimit")
    public Long bandwidthLimit;

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
