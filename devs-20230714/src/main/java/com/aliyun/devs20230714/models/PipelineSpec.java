// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineSpec extends TeaModel {
    @NameInMap("context")
    public Context context;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("templateSpec")
    public PipelineTemplateSpec templateSpec;

    public static PipelineSpec build(java.util.Map<String, ?> map) throws Exception {
        PipelineSpec self = new PipelineSpec();
        return TeaModel.build(map, self);
    }

    public PipelineSpec setContext(Context context) {
        this.context = context;
        return this;
    }
    public Context getContext() {
        return this.context;
    }

    public PipelineSpec setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PipelineSpec setTemplateSpec(PipelineTemplateSpec templateSpec) {
        this.templateSpec = templateSpec;
        return this;
    }
    public PipelineTemplateSpec getTemplateSpec() {
        return this.templateSpec;
    }

}
