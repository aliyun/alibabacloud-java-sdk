// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListNotifyPoliciesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The policy name used for fuzzy filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-alert</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token. Leave this parameter empty for the first page. For subsequent pages, set this parameter to the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJjdXJzb3IiOjEwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The field used for sorting. Valid values: createTime, updateTime, and name.</p>
     * 
     * <strong>example:</strong>
     * <p>createTime</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>Specifies whether to sort results in descending order. Valid values:</p>
     * <ul>
     * <li>true: descending order.</li>
     * <li>false: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("orderDesc")
    public String orderDesc;

    /**
     * <p>The workspace ID. This parameter is used to isolate notify policy resources across different business spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListNotifyPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotifyPoliciesRequest self = new ListNotifyPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotifyPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotifyPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNotifyPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotifyPoliciesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListNotifyPoliciesRequest setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
        return this;
    }
    public String getOrderDesc() {
        return this.orderDesc;
    }

    public ListNotifyPoliciesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
