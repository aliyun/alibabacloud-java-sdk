// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class PushMeteringDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>parameter \&quot;service\&quot; can not be blank.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceFatal")
    public Boolean forceFatal;

    /**
     * <strong>example:</strong>
     * <p>Instance 5723f7ee-952d-411f-94f4-b942a550d9b8 does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A6A33748-D573-593C-A3BC-593E33D68311</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PushMeteringDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataResponseBody self = new PushMeteringDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushMeteringDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PushMeteringDataResponseBody setForceFatal(Boolean forceFatal) {
        this.forceFatal = forceFatal;
        return this;
    }
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    public PushMeteringDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushMeteringDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMeteringDataResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public PushMeteringDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
