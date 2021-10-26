// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateProductSpecsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProductSpecsId")
    public Long productSpecsId;

    @NameInMap("ProductSpecsCode")
    public String productSpecsCode;

    public static CreateProductSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductSpecsResponseBody self = new CreateProductSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductSpecsResponseBody setProductSpecsId(Long productSpecsId) {
        this.productSpecsId = productSpecsId;
        return this;
    }
    public Long getProductSpecsId() {
        return this.productSpecsId;
    }

    public CreateProductSpecsResponseBody setProductSpecsCode(String productSpecsCode) {
        this.productSpecsCode = productSpecsCode;
        return this;
    }
    public String getProductSpecsCode() {
        return this.productSpecsCode;
    }

}
