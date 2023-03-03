// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusRemoteWriteResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call was successful. Other status code indicates that the call failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The name of the remote write configuration that was added, or the exception information.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddPrometheusRemoteWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusRemoteWriteResponseBody self = new AddPrometheusRemoteWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusRemoteWriteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusRemoteWriteResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddPrometheusRemoteWriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusRemoteWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddPrometheusRemoteWriteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
