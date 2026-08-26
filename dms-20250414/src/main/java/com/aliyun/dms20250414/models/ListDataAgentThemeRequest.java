// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentThemeRequest extends TeaModel {
    /**
     * <p>The common scenarios. Valid values: report, infographic, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p><strong>[Not supported]</strong> The page size. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p><strong>[Not supported]</strong> The pagination token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> has a return value, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The current page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source of the theme. Valid values:</p>
     * <ul>
     * <li>system</li>
     * <li>custom</li>
     * <li>derived</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ThemeFrom")
    public String themeFrom;

    /**
     * <p>The theme stage. Valid values:</p>
     * <ul>
     * <li>design: contains only design.md.</li>
     * <li>template: complete and renderable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("ThemeType")
    public String themeType;

    public static ListDataAgentThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentThemeRequest self = new ListDataAgentThemeRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentThemeRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListDataAgentThemeRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentThemeRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentThemeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentThemeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentThemeRequest setThemeFrom(String themeFrom) {
        this.themeFrom = themeFrom;
        return this;
    }
    public String getThemeFrom() {
        return this.themeFrom;
    }

    public ListDataAgentThemeRequest setThemeType(String themeType) {
        this.themeType = themeType;
        return this;
    }
    public String getThemeType() {
        return this.themeType;
    }

}
