// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogTaskCollectionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public Object model;

    /**
     * <strong>example:</strong>
     * <p>A8313212-EB4E-4E15-A7F9-D9C8F3FE8E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTlogTaskCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTlogTaskCollectionsResponseBody self = new GetTlogTaskCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTlogTaskCollectionsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetTlogTaskCollectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTlogTaskCollectionsResponseBody setModel(Object model) {
        this.model = model;
        return this;
    }
    public Object getModel() {
        return this.model;
    }

    public GetTlogTaskCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTlogTaskCollectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
