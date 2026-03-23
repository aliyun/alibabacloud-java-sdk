// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class OpenSendifyTrialServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("AutoLoginURL")
    public String autoLoginURL;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenSendifyTrialServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSendifyTrialServiceResponseBody self = new OpenSendifyTrialServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSendifyTrialServiceResponseBody setAutoLoginURL(String autoLoginURL) {
        this.autoLoginURL = autoLoginURL;
        return this;
    }
    public String getAutoLoginURL() {
        return this.autoLoginURL;
    }

    public OpenSendifyTrialServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
