// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreDataResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<java.util.List<String>> data;

    @NameInMap("header")
    public java.util.List<String> header;

    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetEntityStoreDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreDataResponseBody self = new GetEntityStoreDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreDataResponseBody setData(java.util.List<java.util.List<String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.List<String>> getData() {
        return this.data;
    }

    public GetEntityStoreDataResponseBody setHeader(java.util.List<String> header) {
        this.header = header;
        return this;
    }
    public java.util.List<String> getHeader() {
        return this.header;
    }

    public GetEntityStoreDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
