// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public PolicyDetailInfo data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32A***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPolicyResponseBody setData(PolicyDetailInfo data) {
        this.data = data;
        return this;
    }
    public PolicyDetailInfo getData() {
        return this.data;
    }

    public GetPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
