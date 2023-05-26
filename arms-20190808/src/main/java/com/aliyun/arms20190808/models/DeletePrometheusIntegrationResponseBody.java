// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusIntegrationResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The success or failure information.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrometheusIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusIntegrationResponseBody self = new DeletePrometheusIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeletePrometheusIntegrationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeletePrometheusIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePrometheusIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
