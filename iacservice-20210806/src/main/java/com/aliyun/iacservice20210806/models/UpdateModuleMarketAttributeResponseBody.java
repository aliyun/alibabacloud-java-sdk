// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleMarketAttributeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateModuleMarketAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleMarketAttributeResponseBody self = new UpdateModuleMarketAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModuleMarketAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
