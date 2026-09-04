// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateJobTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("JobTemplateConfig")
    public String jobTemplateConfigShrink;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("JobTemplateDescription")
    public String jobTemplateDescription;

    /**
     * <p>The job template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jt-xxxx</p>
     */
    @NameInMap("JobTemplateId")
    public String jobTemplateId;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("JobTemplateName")
    public String jobTemplateName;

    public static UpdateJobTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobTemplateShrinkRequest self = new UpdateJobTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobTemplateShrinkRequest setJobTemplateConfigShrink(String jobTemplateConfigShrink) {
        this.jobTemplateConfigShrink = jobTemplateConfigShrink;
        return this;
    }
    public String getJobTemplateConfigShrink() {
        return this.jobTemplateConfigShrink;
    }

    public UpdateJobTemplateShrinkRequest setJobTemplateDescription(String jobTemplateDescription) {
        this.jobTemplateDescription = jobTemplateDescription;
        return this;
    }
    public String getJobTemplateDescription() {
        return this.jobTemplateDescription;
    }

    public UpdateJobTemplateShrinkRequest setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public UpdateJobTemplateShrinkRequest setJobTemplateName(String jobTemplateName) {
        this.jobTemplateName = jobTemplateName;
        return this;
    }
    public String getJobTemplateName() {
        return this.jobTemplateName;
    }

}
