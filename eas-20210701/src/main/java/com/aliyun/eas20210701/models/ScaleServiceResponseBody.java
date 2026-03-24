// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ScaleServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Service [foo] in region [cn-shanghai] is scaling</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScaleServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleServiceResponseBody self = new ScaleServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScaleServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
