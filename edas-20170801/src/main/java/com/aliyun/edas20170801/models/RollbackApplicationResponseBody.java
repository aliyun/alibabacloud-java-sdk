// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackApplicationResponseBody extends TeaModel {
    /**
     * <p>The change process ID. You can call the GetChangeOrderInfo operation to query the progress of this rollback. For more information, see <a href="https://help.aliyun.com/document_detail/423155.html">GetChangeOrderInfo</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>921026b8-d1be-************</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D16979DC-4D42-*********</p>
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
