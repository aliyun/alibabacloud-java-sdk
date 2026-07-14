// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class OpenChatappServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OpenStatus")
    public Boolean openStatus;

    /**
     * <strong>example:</strong>
     * <p>3D2FFEE6-368D-532D-87AA-F45B02DD28B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenChatappServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenChatappServiceResponseBody self = new OpenChatappServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenChatappServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenChatappServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenChatappServiceResponseBody setOpenStatus(Boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    public OpenChatappServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
