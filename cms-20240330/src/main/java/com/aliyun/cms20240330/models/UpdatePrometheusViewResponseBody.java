// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rw-xxxxxx</p>
     */
    @NameInMap("prometheusViewId")
    public String prometheusViewId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>64D964F5-76C7-19A2-9399-457744AB3619</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePrometheusViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusViewResponseBody self = new UpdatePrometheusViewResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusViewResponseBody setPrometheusViewId(String prometheusViewId) {
        this.prometheusViewId = prometheusViewId;
        return this;
    }
    public String getPrometheusViewId() {
        return this.prometheusViewId;
    }

    public UpdatePrometheusViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
