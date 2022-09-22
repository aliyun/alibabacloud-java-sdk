// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static CheckModifyConfigNeedRestartRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartRequest self = new CheckModifyConfigNeedRestartRequest();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CheckModifyConfigNeedRestartRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
