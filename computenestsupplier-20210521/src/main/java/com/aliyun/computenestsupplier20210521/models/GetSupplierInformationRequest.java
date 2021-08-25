// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetSupplierInformationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetSupplierInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupplierInformationRequest self = new GetSupplierInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetSupplierInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
