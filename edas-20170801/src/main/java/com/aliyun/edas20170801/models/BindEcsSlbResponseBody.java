// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbResponseBody extends TeaModel {
    /**
     * <p>The change process ID for this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cd65b247-****-475b-ad4b-7039040d625c</p>
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
     * <p>03FD1520-0FD6-436A-<strong><strong>-265318D7</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindEcsSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindEcsSlbResponseBody self = new BindEcsSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindEcsSlbResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public BindEcsSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindEcsSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindEcsSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
