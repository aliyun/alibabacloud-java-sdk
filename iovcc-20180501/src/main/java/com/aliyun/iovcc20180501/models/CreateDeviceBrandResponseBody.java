// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceBrandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BrandId")
    public Long brandId;

    public static CreateDeviceBrandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceBrandResponseBody self = new CreateDeviceBrandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceBrandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceBrandResponseBody setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }
    public Long getBrandId() {
        return this.brandId;
    }

}
