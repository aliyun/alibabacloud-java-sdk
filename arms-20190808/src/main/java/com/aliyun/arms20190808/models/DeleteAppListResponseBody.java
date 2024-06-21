// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAppListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;code\&quot;:200,\&quot;data\&quot;:\&quot;{\\\&quot;code\\\&quot;:200,\\\&quot;data\\\&quot;:true,\\\&quot;errorCode\\ \&quot;:\\\&quot;Deletion of application successful\\\&quot;,\\\&quot;Message\\\&quot;:\\\&quot;Deletion of application successful\\\&quot;,\\\&quot;Successful\\\&quot;:true,\ \\&quot;traceId\\\&quot;:\\\&quot;0bc1667516940677164677396d0088\\\&quot;}\&quot;,\&quot;errorCode\&quot;:\&quot;Batch deletion of applications successful\&quot;,\&quot;message\&quot;:\&quot;Batch deletion of applications successful\ &quot;,\&quot;Success\&quot;:true,\&quot;traceId\&quot;:\&quot;210f470416940677161213505e0e7a\&quot;}&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned when the request parameters are invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Deletion of application successful&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B446DF2-3DDD-4B5B-8E3F-D5225120****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the specified applications are deleted. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The applications are deleted.</li>
     * <li><code>false</code>: The applications failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppListResponseBody self = new DeleteAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteAppListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteAppListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
