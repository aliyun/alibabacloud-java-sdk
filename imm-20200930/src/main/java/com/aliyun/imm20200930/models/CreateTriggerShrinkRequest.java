// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateTriggerShrinkRequest extends TeaModel {
    @NameInMap("Actions")
    public String actionsShrink;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateTriggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerShrinkRequest self = new CreateTriggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerShrinkRequest setActionsShrink(String actionsShrink) {
        this.actionsShrink = actionsShrink;
        return this;
    }
    public String getActionsShrink() {
        return this.actionsShrink;
    }

    public CreateTriggerShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public CreateTriggerShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateTriggerShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTriggerShrinkRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateTriggerShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
