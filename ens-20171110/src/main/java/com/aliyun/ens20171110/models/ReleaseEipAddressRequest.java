// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressRequest extends TeaModel {
    @NameInMap("Eips")
    public String eips;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("Version")
    public String version;

    public static ReleaseEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressRequest self = new ReleaseEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseEipAddressRequest setEips(String eips) {
        this.eips = eips;
        return this;
    }
    public String getEips() {
        return this.eips;
    }

    public ReleaseEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public ReleaseEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
