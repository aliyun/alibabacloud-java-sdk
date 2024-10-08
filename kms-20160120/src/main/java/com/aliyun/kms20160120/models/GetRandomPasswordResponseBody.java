// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordResponseBody extends TeaModel {
    /**
     * <p>The generated random password.</p>
     * 
     * <strong>example:</strong>
     * <p>IxGn&gt;NMmNB(y?iZ&lt;Yc,_H/{2GC\&quot;U****</p>
     */
    @NameInMap("RandomPassword")
    public String randomPassword;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6b0cbe25-5e33-467e-972e-7a83c6c97604</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRandomPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordResponseBody self = new GetRandomPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRandomPasswordResponseBody setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
        return this;
    }
    public String getRandomPassword() {
        return this.randomPassword;
    }

    public GetRandomPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
