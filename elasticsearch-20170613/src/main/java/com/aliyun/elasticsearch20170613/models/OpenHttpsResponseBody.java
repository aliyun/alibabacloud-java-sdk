// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenHttpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result. Valid values:</p>
     * <ul>
     * <li>true: The HTTPS protocol is enabled.</li>
     * <li>false: The HTTPS protocol failed to be enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static OpenHttpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenHttpsResponseBody self = new OpenHttpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenHttpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenHttpsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
