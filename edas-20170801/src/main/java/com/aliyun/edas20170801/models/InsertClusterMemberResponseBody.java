// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Transform submit success!</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The additional information returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01B49A88-B06F-423B-A5EF-E5C0A89******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InsertClusterMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterMemberResponseBody self = new InsertClusterMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertClusterMemberResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertClusterMemberResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InsertClusterMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertClusterMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
