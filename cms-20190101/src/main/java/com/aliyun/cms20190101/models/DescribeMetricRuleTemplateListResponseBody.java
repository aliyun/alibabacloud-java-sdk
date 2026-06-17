// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>659401C0-6214-5C02-972A-CFA929D717B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Templates")
    public DescribeMetricRuleTemplateListResponseBodyTemplates templates;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeMetricRuleTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListResponseBody self = new DescribeMetricRuleTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTemplateListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMetricRuleTemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleTemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleTemplateListResponseBody setTemplates(DescribeMetricRuleTemplateListResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public DescribeMetricRuleTemplateListResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public DescribeMetricRuleTemplateListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory extends TeaModel {
        @NameInMap("ApplyTime")
        public Long applyTime;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        public static DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory self = new DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories extends TeaModel {
        @NameInMap("ApplyHistory")
        public java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory> applyHistory;

        public static DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories self = new DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories setApplyHistory(java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory> applyHistory) {
            this.applyHistory = applyHistory;
            return this;
        }
        public java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistoriesApplyHistory> getApplyHistory() {
            return this.applyHistory;
        }

    }

    public static class DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate extends TeaModel {
        @NameInMap("ApplyHistories")
        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories applyHistories;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("RestVersion")
        public Long restVersion;

        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate self = new DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setApplyHistories(DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories applyHistories) {
            this.applyHistories = applyHistories;
            return this;
        }
        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplateApplyHistories getApplyHistories() {
            return this.applyHistories;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setRestVersion(Long restVersion) {
            this.restVersion = restVersion;
            return this;
        }
        public Long getRestVersion() {
            return this.restVersion;
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribeMetricRuleTemplateListResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate> template;

        public static DescribeMetricRuleTemplateListResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseBodyTemplates self = new DescribeMetricRuleTemplateListResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTemplateListResponseBodyTemplates setTemplate(java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<DescribeMetricRuleTemplateListResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
