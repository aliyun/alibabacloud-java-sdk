// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sServiceResponseBody extends TeaModel {
    /**
     * <p>The change process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b4b37bde-a125-<strong><strong>-</strong></strong>-741f7f4a9ae3</p>
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
     * <p>The additional information returned.</p>
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
     * <p>4823-bhjf-23u4-eiufh</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateK8sServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sServiceResponseBody self = new CreateK8sServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateK8sServiceResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public CreateK8sServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateK8sServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateK8sServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
