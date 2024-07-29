// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ReleaseApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BFB7F5C8-FE7A-06CA-9F87-ABBF6B848F0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseApplicationResponseBody self = new ReleaseApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReleaseApplicationResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public ReleaseApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
