// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    /**
     * <p>应用名称。从EMR控制台集群创建页面可查看到指定发行版的应用名称列表。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    public static Application build(java.util.Map<String, ?> map) throws Exception {
        Application self = new Application();
        return TeaModel.build(map, self);
    }

    public Application setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

}
