// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class SLSLogDestination extends TeaModel {
    /**
     * <p>SLS日志库名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logStore")
    public String logStore;

    /**
     * <p>SLS项目名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("project")
    public String project;

    public static SLSLogDestination build(java.util.Map<String, ?> map) throws Exception {
        SLSLogDestination self = new SLSLogDestination();
        return TeaModel.build(map, self);
    }

    public SLSLogDestination setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public SLSLogDestination setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
