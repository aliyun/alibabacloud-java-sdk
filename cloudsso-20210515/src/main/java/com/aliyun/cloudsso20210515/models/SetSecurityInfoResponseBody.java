// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F44F02EC-70D1-5E51-8E8E-FA9AC4EF952A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoResponseBody self = new SetSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
