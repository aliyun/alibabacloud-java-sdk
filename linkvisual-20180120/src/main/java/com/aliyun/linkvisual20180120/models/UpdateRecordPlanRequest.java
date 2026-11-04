// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRecordPlanRequest extends TeaModel {
    /**
     * <p>The name of the recording plan.</p>
     * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the recording plan. You can call <a href="https://help.aliyun.com/document_detail/107896.html">QueryRecordPlans</a> to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c5a397bc17c4b48ace86f0f0c30****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the time template to be associated with the recording plan. You can call <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36f06322442e4e3f85a5ae8862c9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordPlanRequest self = new UpdateRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
