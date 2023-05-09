// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetDebugAppInstanceRequest extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("ProductType")
    public String productType;

    public static GetDebugAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDebugAppInstanceRequest self = new GetDebugAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDebugAppInstanceRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetDebugAppInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
