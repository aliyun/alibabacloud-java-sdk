// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusRemoteWriteResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The remote write configuration items. If the request fails, an error message is returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeletePrometheusRemoteWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusRemoteWriteResponseBody self = new DeletePrometheusRemoteWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusRemoteWriteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeletePrometheusRemoteWriteResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeletePrometheusRemoteWriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePrometheusRemoteWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePrometheusRemoteWriteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
