// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApiTemplatesRequest extends TeaModel {
    /**
     * <p>The API operation name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The starting position for the read operation.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The cluster template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>at-41b4c6a0fc63****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>A list of API template IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;AT-****&quot;]</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>The name of the cluster template.</p>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListApiTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiTemplatesRequest self = new ListApiTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListApiTemplatesRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ListApiTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApiTemplatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListApiTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListApiTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public ListApiTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
