// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderRequest extends TeaModel {
    @NameInMap("EnterpriseEdition")
    public Boolean enterpriseEdition;

    public static StartConfigurationRecorderRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderRequest self = new StartConfigurationRecorderRequest();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderRequest setEnterpriseEdition(Boolean enterpriseEdition) {
        this.enterpriseEdition = enterpriseEdition;
        return this;
    }
    public Boolean getEnterpriseEdition() {
        return this.enterpriseEdition;
    }

}
