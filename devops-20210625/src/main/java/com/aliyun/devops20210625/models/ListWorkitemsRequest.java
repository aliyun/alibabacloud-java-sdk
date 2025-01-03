// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Req</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>{&quot;conditionGroups&quot;:[]}</p>
     */
    @NameInMap("conditions")
    public String conditions;

    /**
     * <strong>example:</strong>
     * <p>{&quot;conditionGroups&quot;:[]}</p>
     */
    @NameInMap("extraConditions")
    public String extraConditions;

    /**
     * <strong>example:</strong>
     * <p>{&quot;fieldIdentifier&quot;:&quot;tag&quot;,&quot;className&quot;:&quot;tag&quot;,&quot;format&quot;:&quot;multiList&quot;,&quot;value&quot;:[&quot;c76e0e4bf64801cfad73......&quot;],&quot;operator&quot;:&quot;EQUALS&quot;}</p>
     */
    @NameInMap("groupCondition")
    public String groupCondition;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>{&quot;fieldIdentifier&quot;:&quot;status&quot;,&quot;format&quot;:&quot;list&quot;,&quot;order&quot;:&quot;desc&quot;,&quot;className&quot;:&quot;status&quot;}</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>LIST</p>
     */
    @NameInMap("searchType")
    public String searchType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fb83debd69a6c7c6626......</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Project</p>
     */
    @NameInMap("spaceType")
    public String spaceType;

    public static ListWorkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemsRequest self = new ListWorkitemsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkitemsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListWorkitemsRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public ListWorkitemsRequest setExtraConditions(String extraConditions) {
        this.extraConditions = extraConditions;
        return this;
    }
    public String getExtraConditions() {
        return this.extraConditions;
    }

    public ListWorkitemsRequest setGroupCondition(String groupCondition) {
        this.groupCondition = groupCondition;
        return this;
    }
    public String getGroupCondition() {
        return this.groupCondition;
    }

    public ListWorkitemsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWorkitemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkitemsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListWorkitemsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public ListWorkitemsRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public ListWorkitemsRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
