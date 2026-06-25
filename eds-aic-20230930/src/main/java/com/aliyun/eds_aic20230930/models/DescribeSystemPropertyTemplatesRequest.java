// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSystemPropertyTemplatesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The starting position for reading. If this parameter is empty, reading starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The property template ID.</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static DescribeSystemPropertyTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemPropertyTemplatesRequest self = new DescribeSystemPropertyTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSystemPropertyTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSystemPropertyTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSystemPropertyTemplatesRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public DescribeSystemPropertyTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
