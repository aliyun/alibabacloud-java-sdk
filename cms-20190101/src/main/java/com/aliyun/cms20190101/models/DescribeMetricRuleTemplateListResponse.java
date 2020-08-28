// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Templates")
    @Validation(required = true)
    public DescribeMetricRuleTemplateListResponseTemplates templates;

    public static DescribeMetricRuleTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListResponse self = new DescribeMetricRuleTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistoriesApplyHistory extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("ApplyTime")
        @Validation(required = true)
        public Long applyTime;

        public static DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistoriesApplyHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistoriesApplyHistory self = new DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistoriesApplyHistory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistories extends TeaModel {
        @NameInMap("ApplyHistory")
        @Validation(required = true)
        public java.util.List<DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistoriesApplyHistory> applyHistory;

        public static DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistories self = new DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistories();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateListResponseTemplatesTemplate extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RestVersion")
        @Validation(required = true)
        public Long restVersion;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public Long templateId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("ApplyHistories")
        @Validation(required = true)
        public DescribeMetricRuleTemplateListResponseTemplatesTemplateApplyHistories applyHistories;

        public static DescribeMetricRuleTemplateListResponseTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseTemplatesTemplate self = new DescribeMetricRuleTemplateListResponseTemplatesTemplate();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTemplateListResponseTemplates extends TeaModel {
        @NameInMap("Template")
        @Validation(required = true)
        public java.util.List<DescribeMetricRuleTemplateListResponseTemplatesTemplate> template;

        public static DescribeMetricRuleTemplateListResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTemplateListResponseTemplates self = new DescribeMetricRuleTemplateListResponseTemplates();
            return TeaModel.build(map, self);
        }

    }

}
