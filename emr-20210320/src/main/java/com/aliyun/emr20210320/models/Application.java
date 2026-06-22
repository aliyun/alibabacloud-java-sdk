// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Application extends TeaModel {
    /**
     * <p>The application name. You can find the list of application names for each EMR distribution on the cluster creation page in the EMR console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPARK</p>
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
