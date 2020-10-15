// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    @NameInMap("Eips")
    @Validation(required = true)
    public String eips;

    public static ReleaseEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressRequest self = new ReleaseEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseEipAddressRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ReleaseEipAddressRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public ReleaseEipAddressRequest setEips(String eips) {
        this.eips = eips;
        return this;
    }
    public String getEips() {
        return this.eips;
    }

}
