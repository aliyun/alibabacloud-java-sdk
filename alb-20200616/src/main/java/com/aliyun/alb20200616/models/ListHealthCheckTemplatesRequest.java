// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesRequest extends TeaModel {
    // 健康检查模板ID列表
    @NameInMap("HealthCheckTemplateIds")
    public java.util.List<String> healthCheckTemplateIds;

    // 健康检查模板名称列表
    @NameInMap("HealthCheckTemplateNames")
    public java.util.List<String> healthCheckTemplateNames;

    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    public static ListHealthCheckTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHealthCheckTemplatesRequest self = new ListHealthCheckTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListHealthCheckTemplatesRequest setHealthCheckTemplateIds(java.util.List<String> healthCheckTemplateIds) {
        this.healthCheckTemplateIds = healthCheckTemplateIds;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateIds() {
        return this.healthCheckTemplateIds;
    }

    public ListHealthCheckTemplatesRequest setHealthCheckTemplateNames(java.util.List<String> healthCheckTemplateNames) {
        this.healthCheckTemplateNames = healthCheckTemplateNames;
        return this;
    }
    public java.util.List<String> getHealthCheckTemplateNames() {
        return this.healthCheckTemplateNames;
    }

    public ListHealthCheckTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHealthCheckTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
