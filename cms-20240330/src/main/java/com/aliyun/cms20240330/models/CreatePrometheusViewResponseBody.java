// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusViewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cd5237f7dbd574cf9bbd648ff9efb16cd</p>
     */
    @NameInMap("prometheusViewId")
    public String prometheusViewId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePrometheusViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusViewResponseBody self = new CreatePrometheusViewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusViewResponseBody setPrometheusViewId(String prometheusViewId) {
        this.prometheusViewId = prometheusViewId;
        return this;
    }
    public String getPrometheusViewId() {
        return this.prometheusViewId;
    }

    public CreatePrometheusViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
