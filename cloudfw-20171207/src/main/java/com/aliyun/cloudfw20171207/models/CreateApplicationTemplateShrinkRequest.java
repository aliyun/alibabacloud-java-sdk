// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The list of custom actions to configure for built-in applications. The application IDs in the list must be unique.</p>
     */
    @NameInMap("AddBuiltInApplicationCustomActions")
    public String addBuiltInApplicationCustomActionsShrink;

    /**
     * <p>The name of the application template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces or be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ApplicationTemplate01</p>
     */
    @NameInMap("ApplicationTemplateName")
    public String applicationTemplateName;

    /**
     * <p>The switch status of built-in application control. Only <strong>Enable</strong> is supported, which indicates that built-in application control is enabled. If you pass Disable, an error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BuiltInApplicationStatus")
    public String builtInApplicationStatus;

    /**
     * <p>The switch status of custom application rules. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enables the feature.</li>
     * <li><strong>Disable</strong>: Disables the feature.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("CustomRuleStatus")
    public String customRuleStatus;

    /**
     * <p>The description of the application template. The description can be up to 128 characters in length and can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Office network application control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The overall switch status of the application template. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enables the template.</li>
     * <li><strong>Disable</strong>: Disables the template.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <p>The action to take on unidentified applications. Valid values:</p>
     * <ul>
     * <li><strong>Allow</strong>: Allows the traffic.</li>
     * <li><strong>Alert</strong>: Monitors the traffic.</li>
     * <li><strong>Deny</strong>: Blocks the traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert</p>
     */
    @NameInMap("UnknownAction")
    public String unknownAction;

    public static CreateApplicationTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTemplateShrinkRequest self = new CreateApplicationTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTemplateShrinkRequest setAddBuiltInApplicationCustomActionsShrink(String addBuiltInApplicationCustomActionsShrink) {
        this.addBuiltInApplicationCustomActionsShrink = addBuiltInApplicationCustomActionsShrink;
        return this;
    }
    public String getAddBuiltInApplicationCustomActionsShrink() {
        return this.addBuiltInApplicationCustomActionsShrink;
    }

    public CreateApplicationTemplateShrinkRequest setApplicationTemplateName(String applicationTemplateName) {
        this.applicationTemplateName = applicationTemplateName;
        return this;
    }
    public String getApplicationTemplateName() {
        return this.applicationTemplateName;
    }

    public CreateApplicationTemplateShrinkRequest setBuiltInApplicationStatus(String builtInApplicationStatus) {
        this.builtInApplicationStatus = builtInApplicationStatus;
        return this;
    }
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
    }

    public CreateApplicationTemplateShrinkRequest setCustomRuleStatus(String customRuleStatus) {
        this.customRuleStatus = customRuleStatus;
        return this;
    }
    public String getCustomRuleStatus() {
        return this.customRuleStatus;
    }

    public CreateApplicationTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationTemplateShrinkRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public CreateApplicationTemplateShrinkRequest setUnknownAction(String unknownAction) {
        this.unknownAction = unknownAction;
        return this;
    }
    public String getUnknownAction() {
        return this.unknownAction;
    }

}
