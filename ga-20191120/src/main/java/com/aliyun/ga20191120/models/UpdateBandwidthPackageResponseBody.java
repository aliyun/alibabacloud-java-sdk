// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackage")
    public String bandwidthPackage;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    public static UpdateBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackageResponseBody self = new UpdateBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackageResponseBody setBandwidthPackage(String bandwidthPackage) {
        this.bandwidthPackage = bandwidthPackage;
        return this;
    }
    public String getBandwidthPackage() {
        return this.bandwidthPackage;
    }

    public UpdateBandwidthPackageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBandwidthPackageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
