// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityAlertRuleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>results.any { r -&gt; r.status == \&quot;fail\&quot; &amp;&amp; r.rule.severity == \&quot;High\&quot; }</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Target")
    public String targetShrink;

    public static UpdateDataQualityAlertRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityAlertRuleShrinkRequest self = new UpdateDataQualityAlertRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityAlertRuleShrinkRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public UpdateDataQualityAlertRuleShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityAlertRuleShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public UpdateDataQualityAlertRuleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityAlertRuleShrinkRequest setTargetShrink(String targetShrink) {
        this.targetShrink = targetShrink;
        return this;
    }
    public String getTargetShrink() {
        return this.targetShrink;
    }

}
