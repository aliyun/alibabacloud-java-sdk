// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDevicesResponseBody extends TeaModel {
    /**
     * <p>The execution result. If the request was successful, <code>success</code> is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned error message. This parameter is not returned if the value of Code is <code>success</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is not specified.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A87DBB05-653A-5E4B-B72B-5F4A1E07****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDevicesResponseBody self = new AddDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
