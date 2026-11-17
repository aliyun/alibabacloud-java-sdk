// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateResponseBody extends TeaModel {
    /**
     * <p>The application template details.</p>
     */
    @NameInMap("ApplicationTemplate")
    public GetApplicationTemplateResponseBodyApplicationTemplate applicationTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTemplateResponseBody self = new GetApplicationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationTemplateResponseBody setApplicationTemplate(GetApplicationTemplateResponseBodyApplicationTemplate applicationTemplate) {
        this.applicationTemplate = applicationTemplate;
        return this;
    }
    public GetApplicationTemplateResponseBodyApplicationTemplate getApplicationTemplate() {
        return this.applicationTemplate;
    }

    public GetApplicationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions extends TeaModel {
        /**
         * <p>The action performed on the application. Valid values:</p>
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
         * <p>The ID of the application in the built-in application signature library.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        public static GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions self = new GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions();
            return TeaModel.build(map, self);
        }

        public GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

    }

    public static class GetApplicationTemplateResponseBodyApplicationTemplate extends TeaModel {
        /**
         * <p>The ID of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The name of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>Application Template 01</p>
         */
        @NameInMap("ApplicationTemplateName")
        public String applicationTemplateName;

        /**
         * <p>The list of built-in application actions.</p>
         */
        @NameInMap("BuiltInApplicationActions")
        public java.util.List<GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions> builtInApplicationActions;

        /**
         * <p>The switch status for built-in application control. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("BuiltInApplicationStatus")
        public String builtInApplicationStatus;

        /**
         * <p>The creation time of the application template. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The switch status for custom application rules. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("CustomRuleStatus")
        public String customRuleStatus;

        /**
         * <p>The description of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>Office network application control</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The overall switch status of the application template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
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
         * <li><strong>Allow</strong>: Allows the traffic.</li>
         * <li><strong>Alert</strong>: Monitors the traffic.</li>
         * <li><strong>Deny</strong>: Blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("UnknownAction")
        public String unknownAction;

        /**
         * <p>The last update time of the application template. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731469200</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetApplicationTemplateResponseBodyApplicationTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationTemplateResponseBodyApplicationTemplate self = new GetApplicationTemplateResponseBodyApplicationTemplate();
            return TeaModel.build(map, self);
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setApplicationTemplateName(String applicationTemplateName) {
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }
        public String getApplicationTemplateName() {
            return this.applicationTemplateName;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setBuiltInApplicationActions(java.util.List<GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions> builtInApplicationActions) {
            this.builtInApplicationActions = builtInApplicationActions;
            return this;
        }
        public java.util.List<GetApplicationTemplateResponseBodyApplicationTemplateBuiltInApplicationActions> getBuiltInApplicationActions() {
            return this.builtInApplicationActions;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setBuiltInApplicationStatus(String builtInApplicationStatus) {
            this.builtInApplicationStatus = builtInApplicationStatus;
            return this;
        }
        public String getBuiltInApplicationStatus() {
            return this.builtInApplicationStatus;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setCustomRuleStatus(String customRuleStatus) {
            this.customRuleStatus = customRuleStatus;
            return this;
        }
        public String getCustomRuleStatus() {
            return this.customRuleStatus;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setTemplateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setUnknownAction(String unknownAction) {
            this.unknownAction = unknownAction;
            return this;
        }
        public String getUnknownAction() {
            return this.unknownAction;
        }

        public GetApplicationTemplateResponseBodyApplicationTemplate setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
