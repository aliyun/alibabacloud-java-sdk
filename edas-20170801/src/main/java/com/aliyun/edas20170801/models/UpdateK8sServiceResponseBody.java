// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * 
     * <strong>example:</strong>
     * <p>b4b37bde-a125-<strong><strong>-</strong></strong>-741f7f4a9ae3</p>
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
     * <p>4823-bhjf-23u4-eiufh</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateK8sServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sServiceResponseBody self = new UpdateK8sServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateK8sServiceResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public UpdateK8sServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateK8sServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateK8sServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
