// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterInspectReportDetailRequest extends TeaModel {
    /**
     * <p>The category of the inspection item. Valid values:</p>
     * <ul>
     * <li>security: security and compliance</li>
     * <li>performance: performance and efficiency </li>
     * <li>stability: business stability</li>
     * <li>limitation: service limits </li>
     * <li>cost: cost optimization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cost</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>Specifies whether to filter check items. If set to true, only abnormal check items with result=true are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableFilter")
    public Boolean enableFilter;

    /**
     * <p>The query language. Valid values:</p>
     * <ul>
     * <li>zh_CN</li>
     * <li>en_US.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The level of the inspection item. Valid values:</p>
     * <ul>
     * <li>advice: suggestion</li>
     * <li>warning: low-risk</li>
     * <li>error: medium-risk</li>
     * <li>critical: high-risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("level")
    public String level;

    /**
     * <p>The maximum number of entries per page. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>bb41e2bcb47b747389dce6c0d2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The object type of the inspection target. Only check items that match the specified targetType are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NodePool</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static GetClusterInspectReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInspectReportDetailRequest self = new GetClusterInspectReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterInspectReportDetailRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetClusterInspectReportDetailRequest setEnableFilter(Boolean enableFilter) {
        this.enableFilter = enableFilter;
        return this;
    }
    public Boolean getEnableFilter() {
        return this.enableFilter;
    }

    public GetClusterInspectReportDetailRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetClusterInspectReportDetailRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetClusterInspectReportDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetClusterInspectReportDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetClusterInspectReportDetailRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
