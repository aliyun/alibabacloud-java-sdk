// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateLogConfig extends TeaModel {
    /**
     * <p>The name of the SLS Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the Simple Log Service (SLS) project.</p>
     * 
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("project")
    public String project;

    public static CreateTemplateLogConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateLogConfig self = new CreateTemplateLogConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateLogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateTemplateLogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
