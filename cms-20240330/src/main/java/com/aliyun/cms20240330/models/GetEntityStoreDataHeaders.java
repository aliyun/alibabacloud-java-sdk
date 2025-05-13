// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreDataHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>gzip</p>
     */
    @NameInMap("acceptEncoding")
    public String acceptEncoding;

    public static GetEntityStoreDataHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreDataHeaders self = new GetEntityStoreDataHeaders();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreDataHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetEntityStoreDataHeaders setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
        return this;
    }
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

}
