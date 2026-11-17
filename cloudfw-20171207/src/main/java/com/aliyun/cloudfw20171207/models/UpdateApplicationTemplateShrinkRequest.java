// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The list of custom actions to be added or updated for built-in applications. This list is merged with RemoveBuiltInApplicationCustomActions by removing items first and then adding items. The same application ID cannot appear in both lists at the same time.</p>
     */
    @NameInMap("AddBuiltInApplicationCustomActions")
    public String addBuiltInApplicationCustomActionsShrink;

    /**
     * <p>The ID of the application template to be modified. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The name of the application template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces. If this parameter is not specified or is left empty, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Application template 02</p>
     */
    @NameInMap("ApplicationTemplateName")
    public String applicationTemplateName;

    /**
     * <p>The switch status of built-in application control. Valid values: only <strong>Enable</strong> is supported. If you specify Disable, an error is returned. If this parameter is not specified or is left empty, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BuiltInApplicationStatus")
    public String builtInApplicationStatus;

    /**
     * <p>The switch status of custom rules for applications. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.
     * If this parameter is not specified or is left empty, the original value is retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("CustomRuleStatus")
    public String customRuleStatus;

    /**
     * <p>The description of the application template. The description can be up to 128 characters in length. If this parameter is not specified, the original value is retained. If an empty string is specified, the description is cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>Office network application control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of built-in applications from which to remove custom actions. After removal, these applications revert to the default actions of the template. The same application ID cannot appear in AddBuiltInApplicationCustomActions at the same time.</p>
     */
    @NameInMap("RemoveBuiltInApplicationCustomActions")
    public String removeBuiltInApplicationCustomActionsShrink;

    /**
     * <p>The master switch status of the application template. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.
     * If this parameter is not specified or is left empty, the original value is retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <p>The action for unidentified applications. Valid values:</p>
     * <ul>
     * <li><strong>Allow</strong>: Allow.</li>
     * <li><strong>Alert</strong>: Monitor.</li>
     * <li><strong>Deny</strong>: Block.
     * If this parameter is not specified or is left empty, the original value is retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Alert</p>
     */
    @NameInMap("UnknownAction")
    public String unknownAction;

    public static UpdateApplicationTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTemplateShrinkRequest self = new UpdateApplicationTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTemplateShrinkRequest setAddBuiltInApplicationCustomActionsShrink(String addBuiltInApplicationCustomActionsShrink) {
        this.addBuiltInApplicationCustomActionsShrink = addBuiltInApplicationCustomActionsShrink;
        return this;
    }
    public String getAddBuiltInApplicationCustomActionsShrink() {
        return this.addBuiltInApplicationCustomActionsShrink;
    }

    public UpdateApplicationTemplateShrinkRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public UpdateApplicationTemplateShrinkRequest setApplicationTemplateName(String applicationTemplateName) {
        this.applicationTemplateName = applicationTemplateName;
        return this;
    }
    public String getApplicationTemplateName() {
        return this.applicationTemplateName;
    }

    public UpdateApplicationTemplateShrinkRequest setBuiltInApplicationStatus(String builtInApplicationStatus) {
        this.builtInApplicationStatus = builtInApplicationStatus;
        return this;
    }
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
    }

    public UpdateApplicationTemplateShrinkRequest setCustomRuleStatus(String customRuleStatus) {
        this.customRuleStatus = customRuleStatus;
        return this;
    }
    public String getCustomRuleStatus() {
        return this.customRuleStatus;
    }

    public UpdateApplicationTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationTemplateShrinkRequest setRemoveBuiltInApplicationCustomActionsShrink(String removeBuiltInApplicationCustomActionsShrink) {
        this.removeBuiltInApplicationCustomActionsShrink = removeBuiltInApplicationCustomActionsShrink;
        return this;
    }
    public String getRemoveBuiltInApplicationCustomActionsShrink() {
        return this.removeBuiltInApplicationCustomActionsShrink;
    }

    public UpdateApplicationTemplateShrinkRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public UpdateApplicationTemplateShrinkRequest setUnknownAction(String unknownAction) {
        this.unknownAction = unknownAction;
        return this;
    }
    public String getUnknownAction() {
        return this.unknownAction;
    }

}
