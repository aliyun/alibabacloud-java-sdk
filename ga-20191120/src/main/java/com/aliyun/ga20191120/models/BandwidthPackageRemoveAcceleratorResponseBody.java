// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageRemoveAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B7770CB9-9745-4FE5-9EDA-D14B01A12A50</p>
     */
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
