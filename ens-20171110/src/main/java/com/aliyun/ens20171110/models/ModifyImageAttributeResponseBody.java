// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeResponseBody extends TeaModel {
    /**
     * <p>The service code. 0 is returned for a successful request. An error code is returned for a failed request.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeResponseBody self = new ModifyImageAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ModifyImageAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
