// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public String expirationTtl;

    /**
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetDcdnKvDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvDetailResponseBody self = new GetDcdnKvDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvDetailResponseBody setExpirationTtl(String expirationTtl) {
        this.expirationTtl = expirationTtl;
        return this;
    }
    public String getExpirationTtl() {
        return this.expirationTtl;
    }

    public GetDcdnKvDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDcdnKvDetailResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
