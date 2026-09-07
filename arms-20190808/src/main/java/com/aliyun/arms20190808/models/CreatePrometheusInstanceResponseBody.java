// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li>2XX: success.</li>
     * <li>3XX: redirection.</li>
     * <li>4XX: request error.</li>
     * <li>5XX: server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The instance ID returned after the instance is created.</p>
     * <ul>
     * <li><p>For aliyun-cs instances, the Prometheus instance ID is the Container Service cluster ID.</p>
     * </li>
     * <li><p>For ecs instances, the Prometheus instance ID is the VPC ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>qduukd****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceResponseBody self = new CreatePrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePrometheusInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreatePrometheusInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
