// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaNamespacesRequest extends TeaModel {
    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The name of the data catalog bound to the agent. You can call the ListLumaCatalogs operation to obtain the catalog name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. Default value: 100. Each entry requires a back-to-origin metadata query, so this value also limits the number of back-to-origin requests per call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token for the paging query. Leave this parameter empty or set it to &quot;0&quot; for the first query. For subsequent pages, use the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListLumaNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLumaNamespacesRequest self = new ListLumaNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListLumaNamespacesRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ListLumaNamespacesRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListLumaNamespacesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLumaNamespacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
