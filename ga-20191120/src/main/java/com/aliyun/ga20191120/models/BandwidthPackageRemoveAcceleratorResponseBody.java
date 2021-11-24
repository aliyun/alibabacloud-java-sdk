// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageRemoveAcceleratorResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("RequestId")
    public String requestId;

    public static BandwidthPackageRemoveAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageRemoveAcceleratorResponseBody self = new BandwidthPackageRemoveAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageRemoveAcceleratorResponseBody setAccelerators(java.util.List<String> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<String> getAccelerators() {
        return this.accelerators;
    }

    public BandwidthPackageRemoveAcceleratorResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public BandwidthPackageRemoveAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
