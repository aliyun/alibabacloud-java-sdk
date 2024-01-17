// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiMarketInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiMarketInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiMarketInstanceAttributeResponseBody self = new ModifyApiMarketInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiMarketInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
