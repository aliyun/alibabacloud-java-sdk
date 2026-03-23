// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSendifyAutoLoginURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://dingstore.cn">https://dingstore.cn</a></p>
     */
    @NameInMap("AutoLoginURL")
    public String autoLoginURL;

    /**
     * <strong>example:</strong>
     * <p>123423</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSendifyAutoLoginURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSendifyAutoLoginURLResponseBody self = new GetSendifyAutoLoginURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSendifyAutoLoginURLResponseBody setAutoLoginURL(String autoLoginURL) {
        this.autoLoginURL = autoLoginURL;
        return this;
    }
    public String getAutoLoginURL() {
        return this.autoLoginURL;
    }

    public GetSendifyAutoLoginURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
