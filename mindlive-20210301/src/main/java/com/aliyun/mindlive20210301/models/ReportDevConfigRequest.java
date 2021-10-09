// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportDevConfigRequest extends TeaModel {
    @NameInMap("Configs")
    public String configs;

    public static ReportDevConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDevConfigRequest self = new ReportDevConfigRequest();
        return TeaModel.build(map, self);
    }

    public ReportDevConfigRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

}
