// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomViewId")
    public String customViewId;

    /**
     * <strong>example:</strong>
     * <p>580e8ce3-3b80-44c5-9f3f-36ac3cc5bdd5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterCustomViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomViewResponseBody self = new RegisterCustomViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterCustomViewResponseBody setCustomViewId(String customViewId) {
        this.customViewId = customViewId;
        return this;
    }
    public String getCustomViewId() {
        return this.customViewId;
    }

    public RegisterCustomViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
