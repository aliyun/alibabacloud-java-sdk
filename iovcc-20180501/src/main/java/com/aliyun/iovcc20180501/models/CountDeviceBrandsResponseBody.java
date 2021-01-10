// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceBrandsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BrandCount")
    public Integer brandCount;

    public static CountDeviceBrandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceBrandsResponseBody self = new CountDeviceBrandsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDeviceBrandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDeviceBrandsResponseBody setBrandCount(Integer brandCount) {
        this.brandCount = brandCount;
        return this;
    }
    public Integer getBrandCount() {
        return this.brandCount;
    }

}
