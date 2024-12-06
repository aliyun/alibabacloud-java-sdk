// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyLogConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75A4ADCB-AA26-51FB-94D4-AB3240040974</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogConfigResponseBody self = new ModifyLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
