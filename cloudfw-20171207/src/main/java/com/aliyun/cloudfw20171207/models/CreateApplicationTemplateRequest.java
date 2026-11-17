// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationTemplateRequest extends TeaModel {
    /**
     * <p>The list of custom actions to configure for built-in applications. The application IDs in the list must be unique.</p>
     */
    @NameInMap("AddBuiltInApplicationCustomActions")
    public java.util.List<CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions;

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

    public static CreateApplicationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTemplateRequest self = new CreateApplicationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTemplateRequest setAddBuiltInApplicationCustomActions(java.util.List<CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions) {
        this.addBuiltInApplicationCustomActions = addBuiltInApplicationCustomActions;
        return this;
    }
    public java.util.List<CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions> getAddBuiltInApplicationCustomActions() {
        return this.addBuiltInApplicationCustomActions;
    }

    public CreateApplicationTemplateRequest setApplicationTemplateName(String applicationTemplateName) {
        this.applicationTemplateName = applicationTemplateName;
        return this;
    }
    public String getApplicationTemplateName() {
        return this.applicationTemplateName;
    }

    public CreateApplicationTemplateRequest setBuiltInApplicationStatus(String builtInApplicationStatus) {
        this.builtInApplicationStatus = builtInApplicationStatus;
        return this;
    }
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
    }

    public CreateApplicationTemplateRequest setCustomRuleStatus(String customRuleStatus) {
        this.customRuleStatus = customRuleStatus;
        return this;
    }
    public String getCustomRuleStatus() {
        return this.customRuleStatus;
    }

    public CreateApplicationTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationTemplateRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public CreateApplicationTemplateRequest setUnknownAction(String unknownAction) {
        this.unknownAction = unknownAction;
        return this;
    }
    public String getUnknownAction() {
        return this.unknownAction;
    }

    public static class CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions extends TeaModel {
        /**
         * <p>The action to perform on the application. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: Allows the traffic.</li>
         * <li><strong>Alert</strong>: Monitors the traffic.</li>
         * <li><strong>Deny</strong>: Blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The ID of the application for which you want to configure a custom action. The application must exist in the built-in application signature library and the ID cannot be 0. You can call the ListApplications operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        public static CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions self = new CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions();
            return TeaModel.build(map, self);
        }

        public CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateApplicationTemplateRequestAddBuiltInApplicationCustomActions setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

    }

}
