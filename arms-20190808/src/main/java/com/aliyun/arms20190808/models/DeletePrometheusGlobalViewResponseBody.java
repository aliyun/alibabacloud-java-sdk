// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters in the JSON format.</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewResponseBody self = new DeletePrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeletePrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeletePrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
