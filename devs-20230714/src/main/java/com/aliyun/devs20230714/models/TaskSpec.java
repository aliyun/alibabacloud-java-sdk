// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskSpec extends TeaModel {
    @NameInMap("context")
    public Context context;

    @NameInMap("templateName")
    public String templateName;

    public static TaskSpec build(java.util.Map<String, ?> map) throws Exception {
        TaskSpec self = new TaskSpec();
        return TeaModel.build(map, self);
    }

    public TaskSpec setContext(Context context) {
        this.context = context;
        return this;
    }
    public Context getContext() {
        return this.context;
    }

    public TaskSpec setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
