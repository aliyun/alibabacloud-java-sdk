// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingConfigurationRequest extends TeaModel {
    /**
     * <p>The name of the packaging configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    public static GetVodPackagingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingConfigurationRequest self = new GetVodPackagingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingConfigurationRequest setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

}
