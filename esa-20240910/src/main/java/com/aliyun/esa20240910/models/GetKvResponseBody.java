// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>test_value</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKvResponseBody self = new GetKvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKvResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
