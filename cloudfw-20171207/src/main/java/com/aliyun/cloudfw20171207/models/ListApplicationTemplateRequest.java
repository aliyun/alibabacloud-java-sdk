// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationTemplateRequest extends TeaModel {
    /**
     * <p>The list of application template IDs for batch exact matching.</p>
     */
    @NameInMap("ApplicationTemplateIds")
    public java.util.List<String> applicationTemplateIds;

    /**
     * <p>The application template name for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Application template</p>
     */
    @NameInMap("ApplicationTemplateName")
    public String applicationTemplateName;

    /**
     * <p>The switch status of built-in application control for exact matching. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enabled</li>
     * <li><strong>Disable</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("BuiltInApplicationStatus")
    public String builtInApplicationStatus;

    /**
     * <p>The switch status of custom application rules for exact matching. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enabled</li>
     * <li><strong>Disable</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("CustomRuleStatus")
    public String customRuleStatus;

    /**
     * <p>The description of the application template for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Office network application control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The master switch status of the application template for exact matching. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enabled</li>
     * <li><strong>Disable</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <p>The action for unrecognized applications for exact matching. Valid values:</p>
     * <ul>
     * <li><strong>Allow</strong>: allow</li>
     * <li><strong>Alert</strong>: monitor</li>
     * <li><strong>Deny</strong>: block</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Alert</p>
     */
    @NameInMap("UnknownAction")
    public String unknownAction;

    public static ListApplicationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTemplateRequest self = new ListApplicationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationTemplateRequest setApplicationTemplateIds(java.util.List<String> applicationTemplateIds) {
        this.applicationTemplateIds = applicationTemplateIds;
        return this;
    }
    public java.util.List<String> getApplicationTemplateIds() {
        return this.applicationTemplateIds;
    }

    public ListApplicationTemplateRequest setApplicationTemplateName(String applicationTemplateName) {
        this.applicationTemplateName = applicationTemplateName;
        return this;
    }
    public String getApplicationTemplateName() {
        return this.applicationTemplateName;
    }

    public ListApplicationTemplateRequest setBuiltInApplicationStatus(String builtInApplicationStatus) {
        this.builtInApplicationStatus = builtInApplicationStatus;
        return this;
    }
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
    }

    public ListApplicationTemplateRequest setCustomRuleStatus(String customRuleStatus) {
        this.customRuleStatus = customRuleStatus;
        return this;
    }
    public String getCustomRuleStatus() {
        return this.customRuleStatus;
    }

    public ListApplicationTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApplicationTemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationTemplateRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public ListApplicationTemplateRequest setUnknownAction(String unknownAction) {
        this.unknownAction = unknownAction;
        return this;
    }
    public String getUnknownAction() {
        return this.unknownAction;
    }

}
