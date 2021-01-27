// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    public static DeleteBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBandwidthPackageResponseBody self = new DeleteBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBandwidthPackageResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

}
