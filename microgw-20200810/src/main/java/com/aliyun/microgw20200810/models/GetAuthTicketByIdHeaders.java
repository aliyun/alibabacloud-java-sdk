// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAuthTicketByIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // cookie
    @NameInMap("cookie")
    public java.util.Map<String, ?> cookie;

    public static GetAuthTicketByIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTicketByIdHeaders self = new GetAuthTicketByIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetAuthTicketByIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetAuthTicketByIdHeaders setCookie(java.util.Map<String, ?> cookie) {
        this.cookie = cookie;
        return this;
    }
    public java.util.Map<String, ?> getCookie() {
        return this.cookie;
    }

}
