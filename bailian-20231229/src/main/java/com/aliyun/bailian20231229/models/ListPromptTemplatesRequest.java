// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPromptTemplatesRequest extends TeaModel {
    /**
     * <p>The maximum number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The keyword that is used to search for templates.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The token that determines the start position of the query. Set this parameter to the value of the NextToken parameter that is returned from the last call.</p>
     * 
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa34e0e</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The type of the template. Valid values: · System · Custom</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("type")
    public String type;

    public static ListPromptTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPromptTemplatesRequest self = new ListPromptTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPromptTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPromptTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPromptTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPromptTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
