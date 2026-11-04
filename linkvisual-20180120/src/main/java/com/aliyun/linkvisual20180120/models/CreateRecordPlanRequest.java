// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordPlanRequest extends TeaModel {
    /**
     * <p>The name of the recording plan.</p>
     * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the time template for the recording plan. You can call the <a href="https://help.aliyun.com/document_detail/107888.html">CreateTimeTemplate</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36f06322442e4e3f85a5ae8862c9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordPlanRequest self = new CreateRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
