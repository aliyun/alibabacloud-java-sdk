// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeletePrometheusViewResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeletePrometheusViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusViewResponseBody self = new DeletePrometheusViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
