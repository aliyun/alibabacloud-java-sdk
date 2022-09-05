// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetBusinessIdRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    public static GetBusinessIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessIdRequest self = new GetBusinessIdRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessIdRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
