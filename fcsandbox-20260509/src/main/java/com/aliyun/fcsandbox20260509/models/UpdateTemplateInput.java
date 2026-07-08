// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateTemplateInput extends TeaModel {
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    public static UpdateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateInput self = new UpdateTemplateInput();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateTemplateInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

}
