// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationAssignmentsForPrincipalRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of query results. This parameter is not required for the first API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The principal name of the RAM user or the role name.</p>
     * <ul>
     * <li>User principal name: The format is <code>&lt;username&gt;@&lt;account-id&gt;.onaliyun.com</code>. You can query it by calling the GetUser or ListUsers API operation.</li>
     * <li>Role name: You can query it by calling the RAM ListRoles API operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:user@example.onaliyun.com">user@example.onaliyun.com</a></p>
     */
    @NameInMap("PrincipalName")
    public String principalName;

    /**
     * <p>The type of the target principal for the application assignment. Valid values:</p>
     * <ul>
     * <li>user: The principal type is RAM user. In this case, PrincipalName must be the user principal name.</li>
     * <li>role: The principal type is RAM role. In this case, PrincipalName must be the role name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    public static ListApplicationAssignmentsForPrincipalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationAssignmentsForPrincipalRequest self = new ListApplicationAssignmentsForPrincipalRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationAssignmentsForPrincipalRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationAssignmentsForPrincipalRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationAssignmentsForPrincipalRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public ListApplicationAssignmentsForPrincipalRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
