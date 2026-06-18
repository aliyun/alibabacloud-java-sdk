// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class LogConfiguration extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("project")
    public String project;

    public static LogConfiguration build(java.util.Map<String, ?> map) throws Exception {
        LogConfiguration self = new LogConfiguration();
        return TeaModel.build(map, self);
    }

    public LogConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public LogConfiguration setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
