// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponseBody extends TeaModel {
    /**
     * <p>The change process ID. You can call the GetChangeOrderInfo operation to query the progress of this rollback. For more information, see [GetChangeOrderInfo](~~423155~~).</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationResponseBody self = new RollbackApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public RollbackApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RollbackApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
