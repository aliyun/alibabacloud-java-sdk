// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process for this operation. If an instance on which the application is deployed is running or a Server Load Balancer (SLB) instance is bound to the application, this operation generates a change process ID and deletes the application. You can call the GetChangeOrderInfo operation to query the progress of this operation. You can determine whether the operation is successful based on the value of the Code parameter.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sApplicationResponseBody self = new DeleteK8sApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteK8sApplicationResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public DeleteK8sApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteK8sApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteK8sApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
