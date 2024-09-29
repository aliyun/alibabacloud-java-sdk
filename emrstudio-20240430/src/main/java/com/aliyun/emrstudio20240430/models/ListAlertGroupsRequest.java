// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListAlertGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("searchVal")
    public String searchVal;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-lxyy60mpgpg****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListAlertGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertGroupsRequest self = new ListAlertGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertGroupsRequest setSearchVal(String searchVal) {
        this.searchVal = searchVal;
        return this;
    }
    public String getSearchVal() {
        return this.searchVal;
    }

    public ListAlertGroupsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
