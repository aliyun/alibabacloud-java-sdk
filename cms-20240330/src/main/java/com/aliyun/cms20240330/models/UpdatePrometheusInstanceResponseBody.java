// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rw-abc123</p>
     */
    @NameInMap("prometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1E92F783-E057-58F1-BD5C-92DED088E7A5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusInstanceResponseBody self = new UpdatePrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusInstanceResponseBody setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public UpdatePrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
