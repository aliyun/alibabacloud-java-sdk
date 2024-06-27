// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopConfigsResponseBody extends TeaModel {
    /**
     * <p>The name of the configuration file. Valid values:</p>
     * <ul>
     * <li>hdfs-site</li>
     * <li>core-site</li>
     * <li>yarn-site</li>
     * <li>mapred-site</li>
     * <li>hive-site</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hdfs-site</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <strong>example:</strong>
     * <?xml version="1.0"?>
     * <configuration>
     *     <property>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
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
