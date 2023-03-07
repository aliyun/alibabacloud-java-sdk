// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed. For more information, see the "Error codes" section of this topic.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The remaining quota of the account.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryResellerAvailableQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaResponseBody self = new QueryResellerAvailableQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResellerAvailableQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResellerAvailableQuotaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryResellerAvailableQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResellerAvailableQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResellerAvailableQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
