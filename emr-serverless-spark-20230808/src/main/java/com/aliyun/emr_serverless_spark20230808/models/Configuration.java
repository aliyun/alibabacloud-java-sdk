// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Configuration extends TeaModel {
    @NameInMap("configFileName")
    public String configFileName;

    @NameInMap("configItemKey")
    public String configItemKey;

    @NameInMap("configItemValue")
    public String configItemValue;

    public static Configuration build(java.util.Map<String, ?> map) throws Exception {
        Configuration self = new Configuration();
        return TeaModel.build(map, self);
    }

    public Configuration setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

    public Configuration setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
        return this;
    }
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    public Configuration setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
        return this;
    }
    public String getConfigItemValue() {
        return this.configItemValue;
    }

}
