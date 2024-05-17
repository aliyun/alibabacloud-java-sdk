// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopConfigsResponseBody extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHadoopConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopConfigsResponseBody self = new DescribeHadoopConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopConfigsResponseBody setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public DescribeHadoopConfigsResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeHadoopConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
