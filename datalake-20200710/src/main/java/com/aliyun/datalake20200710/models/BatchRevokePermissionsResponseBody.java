// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsResponseBody extends TeaModel {
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
     * <p>Message Code</p>
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

    public static BatchRevokePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokePermissionsResponseBody self = new BatchRevokePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRevokePermissionsResponseBody setBatchGrantRevokeFailureResult(java.util.List<GrantRevokeFailureEntry> batchGrantRevokeFailureResult) {
        this.batchGrantRevokeFailureResult = batchGrantRevokeFailureResult;
        return this;
    }
    public java.util.List<GrantRevokeFailureEntry> getBatchGrantRevokeFailureResult() {
        return this.batchGrantRevokeFailureResult;
    }

    public BatchRevokePermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRevokePermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRevokePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRevokePermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
