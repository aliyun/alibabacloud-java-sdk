// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateLogConfig extends TeaModel {
    /**
     * <p>The name of the Simple Log Service (SLS) Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the SLS project.</p>
     * 
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("project")
    public String project;

    public static PublicUpdateTemplateLogConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateLogConfig self = new PublicUpdateTemplateLogConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateLogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public PublicUpdateTemplateLogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
