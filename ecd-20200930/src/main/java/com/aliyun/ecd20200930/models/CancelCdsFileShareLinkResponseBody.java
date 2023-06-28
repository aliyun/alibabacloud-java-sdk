// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCdsFileShareLinkResponseBody extends TeaModel {
    /**
     * <p>The operation result. The value success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error message that is returned if the request failed. This parameter is not returned if the value of Code is `success`.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelCdsFileShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCdsFileShareLinkResponseBody self = new CancelCdsFileShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCdsFileShareLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelCdsFileShareLinkResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CancelCdsFileShareLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelCdsFileShareLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelCdsFileShareLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
