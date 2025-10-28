// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateContainerResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * 
     * <strong>example:</strong>
     * <p>eb1b9862-****-476f-9e78-d6aa0842835a</p>
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
     * <p>a5281053-08e4-47a5-b2ab-5c0323******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateContainerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerResponseBody self = new UpdateContainerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContainerResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public UpdateContainerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateContainerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContainerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
