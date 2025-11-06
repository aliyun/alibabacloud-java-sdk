// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteFaultInjectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Successfully delete acl policy for gateway</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaultInjectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaultInjectionResponseBody self = new DeleteFaultInjectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaultInjectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFaultInjectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
