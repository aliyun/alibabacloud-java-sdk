// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rw-abc123</p>
     */
    @NameInMap("prometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-BE6E-5F82-A484-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceResponseBody self = new CreatePrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceResponseBody setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public CreatePrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
