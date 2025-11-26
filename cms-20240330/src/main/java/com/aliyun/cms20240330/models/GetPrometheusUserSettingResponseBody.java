// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusUserSettingResponseBody extends TeaModel {
    @NameInMap("prometheusUserSetting")
    public java.util.Map<String, String> prometheusUserSetting;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>058550FA-DDBE-519E-9C6D-93521B9A5E90</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPrometheusUserSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusUserSettingResponseBody self = new GetPrometheusUserSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusUserSettingResponseBody setPrometheusUserSetting(java.util.Map<String, String> prometheusUserSetting) {
        this.prometheusUserSetting = prometheusUserSetting;
        return this;
    }
    public java.util.Map<String, String> getPrometheusUserSetting() {
        return this.prometheusUserSetting;
    }

    public GetPrometheusUserSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
