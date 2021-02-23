// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateDescription")
    public String templateDescription;

    @NameInMap("TemplateTag")
    public String templateTag;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("TemplateConnector")
    public String templateConnector;

    @NameInMap("TemplateSummary")
    public String templateSummary;

    @NameInMap("TemplateSummaryEn")
    public String templateSummaryEn;

    @NameInMap("TemplateLocale")
    public String templateLocale;

    @NameInMap("TemplateVersion")
    public Integer templateVersion;

    @NameInMap("TemplateOverview")
    public String templateOverview;

    @NameInMap("TemplateCreator")
    public String templateCreator;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponseBody setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetTemplateResponseBody setTemplateTag(String templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public String getTemplateTag() {
        return this.templateTag;
    }

    public GetTemplateResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetTemplateResponseBody setTemplateConnector(String templateConnector) {
        this.templateConnector = templateConnector;
        return this;
    }
    public String getTemplateConnector() {
        return this.templateConnector;
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

    public GetTemplateResponseBody setTemplateLocale(String templateLocale) {
        this.templateLocale = templateLocale;
        return this;
    }
    public String getTemplateLocale() {
        return this.templateLocale;
    }

    public GetTemplateResponseBody setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponseBody setTemplateOverview(String templateOverview) {
        this.templateOverview = templateOverview;
        return this;
    }
    public String getTemplateOverview() {
        return this.templateOverview;
    }

    public GetTemplateResponseBody setTemplateCreator(String templateCreator) {
        this.templateCreator = templateCreator;
        return this;
    }
    public String getTemplateCreator() {
        return this.templateCreator;
    }

}
