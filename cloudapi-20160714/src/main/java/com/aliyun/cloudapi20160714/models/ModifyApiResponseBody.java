// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiResponseBody extends TeaModel {
    /**
     * <p>ModifyApi</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiResponseBody self = new ModifyApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
