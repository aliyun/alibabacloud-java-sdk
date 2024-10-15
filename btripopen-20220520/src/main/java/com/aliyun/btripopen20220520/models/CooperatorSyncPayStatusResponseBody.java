// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorSyncPayStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>System.Error</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CooperatorSyncPayStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CooperatorSyncPayStatusResponseBody self = new CooperatorSyncPayStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CooperatorSyncPayStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CooperatorSyncPayStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CooperatorSyncPayStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CooperatorSyncPayStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
