// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class JobLogConfig extends TeaModel {
    // logstore
    @NameInMap("logstore")
    public String logstore;

    // project
    @NameInMap("project")
    public String project;

    public static JobLogConfig build(java.util.Map<String, ?> map) throws Exception {
        JobLogConfig self = new JobLogConfig();
        return TeaModel.build(map, self);
    }

    public JobLogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public JobLogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
