// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvDetailResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the key. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public String expirationTtl;

    /**
     * <p>The expiration time of the key. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the key. The value of the root node.</p>
     * 
     * <strong>example:</strong>
     * <p>test_value</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetKvDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKvDetailResponseBody self = new GetKvDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKvDetailResponseBody setExpirationTtl(String expirationTtl) {
        this.expirationTtl = expirationTtl;
        return this;
    }
    public String getExpirationTtl() {
        return this.expirationTtl;
    }

    public GetKvDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKvDetailResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
