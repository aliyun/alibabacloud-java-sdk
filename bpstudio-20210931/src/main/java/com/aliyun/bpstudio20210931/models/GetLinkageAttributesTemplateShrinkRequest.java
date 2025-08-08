// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetLinkageAttributesTemplateShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AreaId")
    public String areaId;

    @NameInMap("Instances")
    public String instancesShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>${instance_type}</p>
     */
    @NameInMap("TargetVariable")
    public String targetVariable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XFKR6WYRVS24S07R</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Variables")
    public String variablesShrink;

    public static GetLinkageAttributesTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkageAttributesTemplateShrinkRequest self = new GetLinkageAttributesTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkageAttributesTemplateShrinkRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public GetLinkageAttributesTemplateShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public GetLinkageAttributesTemplateShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetLinkageAttributesTemplateShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetLinkageAttributesTemplateShrinkRequest setTargetVariable(String targetVariable) {
        this.targetVariable = targetVariable;
        return this;
    }
    public String getTargetVariable() {
        return this.targetVariable;
    }

    public GetLinkageAttributesTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLinkageAttributesTemplateShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
