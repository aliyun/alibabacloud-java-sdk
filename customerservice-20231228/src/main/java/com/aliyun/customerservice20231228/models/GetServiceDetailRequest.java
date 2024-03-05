// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetServiceDetailRequest extends TeaModel {
    @NameInMap("applyCode")
    public String applyCode;

    public static GetServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailRequest self = new GetServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailRequest setApplyCode(String applyCode) {
        this.applyCode = applyCode;
        return this;
    }
    public String getApplyCode() {
        return this.applyCode;
    }

}
