// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class GetReserveDomainUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D34B02AE-09AF-41C1-A6D3-951A2233EDB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetReserveDomainUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReserveDomainUrlResponseBody self = new GetReserveDomainUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReserveDomainUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReserveDomainUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
