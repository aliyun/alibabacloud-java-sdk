// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    public static DeleteVodPackagingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingConfigurationRequest self = new DeleteVodPackagingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingConfigurationRequest setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

}
