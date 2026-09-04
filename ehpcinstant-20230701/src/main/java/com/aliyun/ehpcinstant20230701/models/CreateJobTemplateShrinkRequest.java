// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("JobTemplateConfig")
    public String jobTemplateConfigShrink;

    /**
     * <p>The description of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobTemplateDescription")
    public String jobTemplateDescription;

    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("JobTemplateName")
    public String jobTemplateName;

    public static CreateJobTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateShrinkRequest self = new CreateJobTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateShrinkRequest setJobTemplateConfigShrink(String jobTemplateConfigShrink) {
        this.jobTemplateConfigShrink = jobTemplateConfigShrink;
        return this;
    }
    public String getJobTemplateConfigShrink() {
        return this.jobTemplateConfigShrink;
    }

    public CreateJobTemplateShrinkRequest setJobTemplateDescription(String jobTemplateDescription) {
        this.jobTemplateDescription = jobTemplateDescription;
        return this;
    }
    public String getJobTemplateDescription() {
        return this.jobTemplateDescription;
    }

    public CreateJobTemplateShrinkRequest setJobTemplateName(String jobTemplateName) {
        this.jobTemplateName = jobTemplateName;
        return this;
    }
    public String getJobTemplateName() {
        return this.jobTemplateName;
    }

}
