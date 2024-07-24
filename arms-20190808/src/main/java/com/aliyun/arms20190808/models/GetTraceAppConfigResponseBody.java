// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>2xx: The request was successful.</li>
     * <li>3xx: The request was redirected.</li>
     * <li>4xx: A request error occurred.</li>
     * <li>5xx: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The custom settings of the application, which is a JSON string. For more information, see <strong>Additional description of response parameters</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;profiler&quot;:{&quot;enable&quot;:true}}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTraceAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppConfigResponseBody self = new GetTraceAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceAppConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTraceAppConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetTraceAppConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTraceAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceAppConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
