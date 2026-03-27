// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusUserSettingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("settingValue")
    public String settingValue;

    public static UpdatePrometheusUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusUserSettingRequest self = new UpdatePrometheusUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusUserSettingRequest setSettingValue(String settingValue) {
        this.settingValue = settingValue;
        return this;
    }
    public String getSettingValue() {
        return this.settingValue;
    }

}
