// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class RefreshResolveCacheResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FA8C2599-362D-4113-8FB4-E88A40C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshResolveCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshResolveCacheResponseBody self = new RefreshResolveCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshResolveCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshResolveCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshResolveCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
