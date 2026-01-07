// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateTextLabelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;textID&quot;: &quot;12345&quot;, &quot;type&quot;:&quot;dialogue&quot;, &quot;text&quot;: &quot;您好&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("LabelTemplateId")
    public String labelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1241148226163200</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateTextLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextLabelRequest self = new CreateTextLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextLabelRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTextLabelRequest setLabelTemplateId(String labelTemplateId) {
        this.labelTemplateId = labelTemplateId;
        return this;
    }
    public String getLabelTemplateId() {
        return this.labelTemplateId;
    }

    public CreateTextLabelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
