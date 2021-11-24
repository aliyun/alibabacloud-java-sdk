// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageAddAcceleratorResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("RequestId")
    public String requestId;

    public static BandwidthPackageAddAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageAddAcceleratorResponseBody self = new BandwidthPackageAddAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageAddAcceleratorResponseBody setAccelerators(java.util.List<String> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<String> getAccelerators() {
        return this.accelerators;
    }

    public BandwidthPackageAddAcceleratorResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public BandwidthPackageAddAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
