// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("TemplateDescription")
    @Validation(required = true)
    public String templateDescription;

    @NameInMap("TemplateTag")
    @Validation(required = true)
    public String templateTag;

    @NameInMap("Definition")
    @Validation(required = true)
    public String definition;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("TemplateConnector")
    @Validation(required = true)
    public String templateConnector;

    @NameInMap("TemplateSummary")
    @Validation(required = true)
    public String templateSummary;

    @NameInMap("TemplateSummaryEn")
    @Validation(required = true)
    public String templateSummaryEn;

    @NameInMap("TemplateLocale")
    @Validation(required = true)
    public String templateLocale;

    @NameInMap("TemplateVersion")
    @Validation(required = true)
    public Integer templateVersion;

    @NameInMap("TemplateOverview")
    @Validation(required = true)
    public String templateOverview;

    @NameInMap("TemplateCreator")
    @Validation(required = true)
    public String templateCreator;

    public static GetTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponse self = new GetTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetTemplateResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponse setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public GetTemplateResponse setTemplateTag(String templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public String getTemplateTag() {
        return this.templateTag;
    }

    public GetTemplateResponse setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetTemplateResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetTemplateResponse setTemplateConnector(String templateConnector) {
        this.templateConnector = templateConnector;
        return this;
    }
    public String getTemplateConnector() {
        return this.templateConnector;
    }

    public GetTemplateResponse setTemplateSummary(String templateSummary) {
        this.templateSummary = templateSummary;
        return this;
    }
    public String getTemplateSummary() {
        return this.templateSummary;
    }

    public GetTemplateResponse setTemplateSummaryEn(String templateSummaryEn) {
        this.templateSummaryEn = templateSummaryEn;
        return this;
    }
    public String getTemplateSummaryEn() {
        return this.templateSummaryEn;
    }

    public GetTemplateResponse setTemplateLocale(String templateLocale) {
        this.templateLocale = templateLocale;
        return this;
    }
    public String getTemplateLocale() {
        return this.templateLocale;
    }

    public GetTemplateResponse setTemplateVersion(Integer templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    public GetTemplateResponse setTemplateOverview(String templateOverview) {
        this.templateOverview = templateOverview;
        return this;
    }
    public String getTemplateOverview() {
        return this.templateOverview;
    }

    public GetTemplateResponse setTemplateCreator(String templateCreator) {
        this.templateCreator = templateCreator;
        return this;
    }
    public String getTemplateCreator() {
        return this.templateCreator;
    }

}
