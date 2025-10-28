// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindK8sSlbResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * 
     * <strong>example:</strong>
     * <p>b0a8441e-****-4e8e-9874-b56dea02952f</p>
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
     * <p>The message that is returned.</p>
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
     * <p>1234-1sda-321d-1234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindK8sSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindK8sSlbResponseBody self = new UnbindK8sSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindK8sSlbResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public UnbindK8sSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnbindK8sSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindK8sSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
