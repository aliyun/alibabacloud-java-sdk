// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCoupondeductProductCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static GetCoupondeductProductCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCoupondeductProductCodeRequest self = new GetCoupondeductProductCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetCoupondeductProductCodeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
