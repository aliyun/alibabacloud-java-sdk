// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * 
     * <strong>example:</strong>
     * <p>b4b37bde-a125-43fc-****-741f7f4a9ae3</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9041389c-*****-459c-8253-724bca7f51f0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteK8sServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sServiceResponseBody self = new DeleteK8sServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteK8sServiceResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public DeleteK8sServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteK8sServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteK8sServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
