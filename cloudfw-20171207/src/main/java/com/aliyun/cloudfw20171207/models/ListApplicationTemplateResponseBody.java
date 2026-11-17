// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationTemplateResponseBody extends TeaModel {
    /**
     * <p>The list of application templates.</p>
     */
    @NameInMap("ApplicationTemplates")
    public java.util.List<ListApplicationTemplateResponseBodyApplicationTemplates> applicationTemplates;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of application templates that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTemplateResponseBody self = new ListApplicationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationTemplateResponseBody setApplicationTemplates(java.util.List<ListApplicationTemplateResponseBodyApplicationTemplates> applicationTemplates) {
        this.applicationTemplates = applicationTemplates;
        return this;
    }
    public java.util.List<ListApplicationTemplateResponseBodyApplicationTemplates> getApplicationTemplates() {
        return this.applicationTemplates;
    }

    public ListApplicationTemplateResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationTemplateResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics extends TeaModel {
        /**
         * <p>The number of built-in applications whose final effective action is Alert.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AlertApplicationCount")
        public Long alertApplicationCount;

        /**
         * <p>The number of built-in applications whose final effective action is Allow.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AllowApplicationCount")
        public Long allowApplicationCount;

        /**
         * <p>The number of built-in applications whose final effective action is Deny.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DenyApplicationCount")
        public Long denyApplicationCount;

        public static ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics self = new ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics();
            return TeaModel.build(map, self);
        }

        public ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics setAlertApplicationCount(Long alertApplicationCount) {
            this.alertApplicationCount = alertApplicationCount;
            return this;
        }
        public Long getAlertApplicationCount() {
            return this.alertApplicationCount;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics setAllowApplicationCount(Long allowApplicationCount) {
            this.allowApplicationCount = allowApplicationCount;
            return this;
        }
        public Long getAllowApplicationCount() {
            return this.allowApplicationCount;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics setDenyApplicationCount(Long denyApplicationCount) {
            this.denyApplicationCount = denyApplicationCount;
            return this;
        }
        public Long getDenyApplicationCount() {
            return this.denyApplicationCount;
        }

    }

    public static class ListApplicationTemplateResponseBodyApplicationTemplates extends TeaModel {
        /**
         * <p>The application template ID.</p>
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
         * <p>Application template 01</p>
         */
        @NameInMap("ApplicationTemplateName")
        public String applicationTemplateName;

        /**
         * <p>The statistics on the number of built-in applications in the template, categorized by the final effective action.</p>
         */
        @NameInMap("BuiltInApplicationActionStatistics")
        public ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics builtInApplicationActionStatistics;

        /**
         * <p>The switch status of built-in application control. Valid values:</p>
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
         * <p>The creation time of the application template. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The number of custom application rules under the template.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CustomRuleCount")
        public Long customRuleCount;

        /**
         * <p>The switch status of custom application rules. Valid values:</p>
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
         * <p>The description of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>Office network application control</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The master switch status of the application template. Valid values:</p>
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
         * <p>The action for unrecognized applications. Valid values:</p>
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

        /**
         * <p>The last modification time of the application template. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731469200</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListApplicationTemplateResponseBodyApplicationTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationTemplateResponseBodyApplicationTemplates self = new ListApplicationTemplateResponseBodyApplicationTemplates();
            return TeaModel.build(map, self);
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setApplicationTemplateName(String applicationTemplateName) {
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }
        public String getApplicationTemplateName() {
            return this.applicationTemplateName;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setBuiltInApplicationActionStatistics(ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics builtInApplicationActionStatistics) {
            this.builtInApplicationActionStatistics = builtInApplicationActionStatistics;
            return this;
        }
        public ListApplicationTemplateResponseBodyApplicationTemplatesBuiltInApplicationActionStatistics getBuiltInApplicationActionStatistics() {
            return this.builtInApplicationActionStatistics;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setBuiltInApplicationStatus(String builtInApplicationStatus) {
            this.builtInApplicationStatus = builtInApplicationStatus;
            return this;
        }
        public String getBuiltInApplicationStatus() {
            return this.builtInApplicationStatus;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setCustomRuleCount(Long customRuleCount) {
            this.customRuleCount = customRuleCount;
            return this;
        }
        public Long getCustomRuleCount() {
            return this.customRuleCount;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setCustomRuleStatus(String customRuleStatus) {
            this.customRuleStatus = customRuleStatus;
            return this;
        }
        public String getCustomRuleStatus() {
            return this.customRuleStatus;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setTemplateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setUnknownAction(String unknownAction) {
            this.unknownAction = unknownAction;
            return this;
        }
        public String getUnknownAction() {
            return this.unknownAction;
        }

        public ListApplicationTemplateResponseBodyApplicationTemplates setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
