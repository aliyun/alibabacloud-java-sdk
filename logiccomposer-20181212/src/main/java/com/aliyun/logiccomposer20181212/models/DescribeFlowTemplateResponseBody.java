// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowTemplateResponseBody extends TeaModel {
    @NameInMap("Locale")
    public String locale;

    @NameInMap("Connector")
    public String connector;

    @NameInMap("SummaryEn")
    public String summaryEn;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("Overview")
    public String overview;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Name")
    public String name;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("TemplateId")
    public String templateId;

    public static DescribeFlowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTemplateResponseBody self = new DescribeFlowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTemplateResponseBody setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public DescribeFlowTemplateResponseBody setConnector(String connector) {
        this.connector = connector;
        return this;
    }
    public String getConnector() {
        return this.connector;
    }

    public DescribeFlowTemplateResponseBody setSummaryEn(String summaryEn) {
        this.summaryEn = summaryEn;
        return this;
    }
    public String getSummaryEn() {
        return this.summaryEn;
    }

    public DescribeFlowTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowTemplateResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DescribeFlowTemplateResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeFlowTemplateResponseBody setOverview(String overview) {
        this.overview = overview;
        return this;
    }
    public String getOverview() {
        return this.overview;
    }

    public DescribeFlowTemplateResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DescribeFlowTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowTemplateResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public DescribeFlowTemplateResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeFlowTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
