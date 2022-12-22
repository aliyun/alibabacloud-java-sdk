// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // The time when the template was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The definition of the template.
    @NameInMap("Definition")
    public String definition;

    // The region where the template resides.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // A list of connectors that are used in the template. The connectors are separated by commas.
    @NameInMap("TemplateConnector")
    public String templateConnector;

    // The publisher of the template.
    @NameInMap("TemplateCreator")
    public String templateCreator;

    // A description of the template.
    @NameInMap("TemplateDescription")
    public String templateDescription;

    // The ID of the template.
    @NameInMap("TemplateId")
    public String templateId;

    // The language that is used in the template. Chinese and English are supported.
    @NameInMap("TemplateLocale")
    public String templateLocale;

    // The name of the template.
    @NameInMap("TemplateName")
    public String templateName;

    // An overview of the template, which is a JSON string.
    @NameInMap("TemplateOverview")
    public String templateOverview;

    // A brief introduction to the template.
    @NameInMap("TemplateSummary")
    public String templateSummary;

    // A brief introduction to the template.
    @NameInMap("TemplateSummaryEn")
    public String templateSummaryEn;

    // The tag of the template.
    @NameInMap("TemplateTag")
    public String templateTag;

    // The version of the template, which is a number that increments from 0.
    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    // The time when the template was last updated.
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetTemplateResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setTemplateConnector(String templateConnector) {
        this.templateConnector = templateConnector;
        return this;
    }
    public String getTemplateConnector() {
        return this.templateConnector;
    }

    public GetTemplateResponseBody setTemplateCreator(String templateCreator) {
        this.templateCreator = templateCreator;
        return this;
    }
    public String getTemplateCreator() {
        return this.templateCreator;
    }

    public GetTemplateResponseBody setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setTemplateLocale(String templateLocale) {
        this.templateLocale = templateLocale;
        return this;
    }
    public String getTemplateLocale() {
        return this.templateLocale;
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponseBody setTemplateOverview(String templateOverview) {
        this.templateOverview = templateOverview;
        return this;
    }
    public String getTemplateOverview() {
        return this.templateOverview;
    }

    public GetTemplateResponseBody setTemplateSummary(String templateSummary) {
        this.templateSummary = templateSummary;
        return this;
    }
    public String getTemplateSummary() {
        return this.templateSummary;
    }

    public GetTemplateResponseBody setTemplateSummaryEn(String templateSummaryEn) {
        this.templateSummaryEn = templateSummaryEn;
        return this;
    }
    public String getTemplateSummaryEn() {
        return this.templateSummaryEn;
    }

    public GetTemplateResponseBody setTemplateTag(String templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public String getTemplateTag() {
        return this.templateTag;
    }

    public GetTemplateResponseBody setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
