// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SLSTriggerLogConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-sls-logstore-name</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <strong>example:</strong>
     * <p>my-sls-project-name</p>
     */
    @NameInMap("project")
    public String project;

    public static SLSTriggerLogConfig build(java.util.Map<String, ?> map) throws Exception {
        SLSTriggerLogConfig self = new SLSTriggerLogConfig();
        return TeaModel.build(map, self);
    }

    public SLSTriggerLogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public SLSTriggerLogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
