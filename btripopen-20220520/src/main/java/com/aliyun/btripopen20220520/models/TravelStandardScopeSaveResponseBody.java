// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardScopeSaveResponseBody extends TeaModel {
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>05F9C201-1B53-5905-94AB-0D7444D8466A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("resultCode")
    public Integer resultCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041aa317070996148671005d0a0b</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TravelStandardScopeSaveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardScopeSaveResponseBody self = new TravelStandardScopeSaveResponseBody();
        return TeaModel.build(map, self);
    }

    public TravelStandardScopeSaveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TravelStandardScopeSaveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TravelStandardScopeSaveResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public TravelStandardScopeSaveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TravelStandardScopeSaveResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
