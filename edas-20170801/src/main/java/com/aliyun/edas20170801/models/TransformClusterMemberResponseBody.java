// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p><code>Transform submit success!</code> is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Transform submit success!</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransformClusterMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformClusterMemberResponseBody self = new TransformClusterMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformClusterMemberResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TransformClusterMemberResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public TransformClusterMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TransformClusterMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
