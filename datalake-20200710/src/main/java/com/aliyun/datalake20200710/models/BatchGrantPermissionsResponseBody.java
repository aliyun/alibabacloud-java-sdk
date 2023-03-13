// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsResponseBody extends TeaModel {
    /**
     * <p>result</p>
     */
    @NameInMap("BatchGrantRevokeFailureResult")
    public java.util.List<GrantRevokeFailureEntry> batchGrantRevokeFailureResult;

    /**
     * <p>Response Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchGrantPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantPermissionsResponseBody self = new BatchGrantPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGrantPermissionsResponseBody setBatchGrantRevokeFailureResult(java.util.List<GrantRevokeFailureEntry> batchGrantRevokeFailureResult) {
        this.batchGrantRevokeFailureResult = batchGrantRevokeFailureResult;
        return this;
    }
    public java.util.List<GrantRevokeFailureEntry> getBatchGrantRevokeFailureResult() {
        return this.batchGrantRevokeFailureResult;
    }

    public BatchGrantPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGrantPermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGrantPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGrantPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
