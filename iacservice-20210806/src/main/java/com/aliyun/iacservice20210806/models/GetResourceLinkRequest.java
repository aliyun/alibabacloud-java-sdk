// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceLinkRequest extends TeaModel {
    @NameInMap("productCode")
    public String productCode;

    @NameInMap("resourceTypeCode")
    public String resourceTypeCode;

    public static GetResourceLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceLinkRequest self = new GetResourceLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceLinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetResourceLinkRequest setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }
    public String getResourceTypeCode() {
        return this.resourceTypeCode;
    }

}
