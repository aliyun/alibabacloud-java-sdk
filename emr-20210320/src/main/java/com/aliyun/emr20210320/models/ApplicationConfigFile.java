// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApplicationConfigFile extends TeaModel {
    /**
     * <p>应用名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>配置文件名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>core-site.xml</p>
     */
    @NameInMap("ConfigFileName")
    public String configFileName;

    public static ApplicationConfigFile build(java.util.Map<String, ?> map) throws Exception {
        ApplicationConfigFile self = new ApplicationConfigFile();
        return TeaModel.build(map, self);
    }

    public ApplicationConfigFile setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ApplicationConfigFile setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
        return this;
    }
    public String getConfigFileName() {
        return this.configFileName;
    }

}
