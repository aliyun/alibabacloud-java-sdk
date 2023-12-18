// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    /**
     * <p>The information about the EIPs.</p>
     */
    @NameInMap("Eips")
    public String eips;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The version number. Set the value to 2017-11-10.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesRequest self = new DescribeEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesRequest setEips(String eips) {
        this.eips = eips;
        return this;
    }
    public String getEips() {
        return this.eips;
    }

    public DescribeEipAddressesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEipAddressesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
