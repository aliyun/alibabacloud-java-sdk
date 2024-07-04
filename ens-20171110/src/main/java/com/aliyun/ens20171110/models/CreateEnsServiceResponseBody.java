// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceResponseBody extends TeaModel {
    /**
     * <p>The service code. 0 is returned for a successful request. An error code is returned for a failed request.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AF02B43-2D08-49D3-8AAF-65B9C792ED14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceResponseBody self = new CreateEnsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
