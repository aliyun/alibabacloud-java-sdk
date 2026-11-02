// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusUserSettingRequest extends TeaModel {
    /**
     * <p>The locale. Default value: zh. Valid values: zh, en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    public static GetPrometheusUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusUserSettingRequest self = new GetPrometheusUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusUserSettingRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

}
