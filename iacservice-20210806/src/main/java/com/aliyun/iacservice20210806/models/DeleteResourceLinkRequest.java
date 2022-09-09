// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteResourceLinkRequest extends TeaModel {
    @NameInMap("productCode")
    public String productCode;

    @NameInMap("resourceTypeCode")
    public String resourceTypeCode;

    public static DeleteResourceLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceLinkRequest self = new DeleteResourceLinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceLinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeleteResourceLinkRequest setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }
    public String getResourceTypeCode() {
        return this.resourceTypeCode;
    }

}
