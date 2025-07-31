// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityAlertRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Target")
    public String targetShrink;

    public static CreateDataQualityAlertRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityAlertRuleShrinkRequest self = new CreateDataQualityAlertRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityAlertRuleShrinkRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public CreateDataQualityAlertRuleShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateDataQualityAlertRuleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataQualityAlertRuleShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

}
