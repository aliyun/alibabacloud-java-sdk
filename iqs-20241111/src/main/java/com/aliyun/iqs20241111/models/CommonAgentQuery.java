// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class CommonAgentQuery extends TeaModel {
    /**
     * <p>The maximum number of place results to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The natural language question used to retrieve nearby places.</p>
     * 
     * <strong>example:</strong>
     * <p>High-end hotels within 5 km of Lingyin Temple in Hangzhou</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The search scenario code. Valid values: hotels (hotel), attractions (attraction), restaurants (restaurant), and entertainment (leisure and entertainment). If you do not specify this parameter, the model identifies the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>hotels</p>
     */
    @NameInMap("querySceneEnumCode")
    public String querySceneEnumCode;

    /**
     * <p>The search result mode. Valid values: single (returns simplified fields) and normal (returns all fields). Default value: normal.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("searchModel")
    public String searchModel;

    public static CommonAgentQuery build(java.util.Map<String, ?> map) throws Exception {
        CommonAgentQuery self = new CommonAgentQuery();
        return TeaModel.build(map, self);
    }

    public CommonAgentQuery setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public CommonAgentQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public CommonAgentQuery setQuerySceneEnumCode(String querySceneEnumCode) {
        this.querySceneEnumCode = querySceneEnumCode;
        return this;
    }
    public String getQuerySceneEnumCode() {
        return this.querySceneEnumCode;
    }

    public CommonAgentQuery setSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    public String getSearchModel() {
        return this.searchModel;
    }

}
