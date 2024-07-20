// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The bandwidth plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1eo4f57z1kbbcmn****</p>
     */
    @NameInMap("BandwidthPackage")
    public String bandwidthPackage;

    /**
     * <p>The description of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF3A3CB-B621-44F8-9870-C20D034D7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public UpdateBandwidthPackageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
