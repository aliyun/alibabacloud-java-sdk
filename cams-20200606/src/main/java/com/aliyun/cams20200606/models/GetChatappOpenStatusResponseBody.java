// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappOpenStatusResponseBody extends TeaModel {
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
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappOpenStatusResponseBody self = new GetChatappOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappOpenStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappOpenStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappOpenStatusResponseBody setOpenStatus(Boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    public GetChatappOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
