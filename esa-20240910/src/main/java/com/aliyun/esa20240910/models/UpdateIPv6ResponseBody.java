// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateIPv6ResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIPv6ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIPv6ResponseBody self = new UpdateIPv6ResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIPv6ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
