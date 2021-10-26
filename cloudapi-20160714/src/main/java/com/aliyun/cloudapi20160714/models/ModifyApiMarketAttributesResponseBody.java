// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiMarketAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiMarketAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiMarketAttributesResponseBody self = new ModifyApiMarketAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiMarketAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
