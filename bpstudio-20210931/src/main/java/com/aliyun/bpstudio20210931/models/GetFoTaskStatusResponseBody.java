// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetFoTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status of the switchover task.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>OKITHEVRQCN6ULQG</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>923692F0-A15B-58B4-BAF4-2AFA4AF46240</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFoTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoTaskStatusResponseBody self = new GetFoTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFoTaskStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetFoTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFoTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
