// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class GetRootBusinessLocationsRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ActionMethodRegionId")
    public String actionMethodRegionId;

    public static GetRootBusinessLocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRootBusinessLocationsRequest self = new GetRootBusinessLocationsRequest();
        return TeaModel.build(map, self);
    }

    public GetRootBusinessLocationsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetRootBusinessLocationsRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

}
