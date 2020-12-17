// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAuthTicketByIdShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // cookie
    @NameInMap("cookie")
    public String cookieShrink;

    public static GetAuthTicketByIdShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTicketByIdShrinkHeaders self = new GetAuthTicketByIdShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public GetAuthTicketByIdShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetAuthTicketByIdShrinkHeaders setCookieShrink(String cookieShrink) {
        this.cookieShrink = cookieShrink;
        return this;
    }
    public String getCookieShrink() {
        return this.cookieShrink;
    }

}
