// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The filter condition for exact match on the email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 100. If this parameter is not specified, 10 records are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The filter condition for exact match on the user name.</p>
     * 
     * <strong>example:</strong>
     * <p>user-01</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The filter condition for fuzzy match on the user name. The value can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The cursor for querying the next page. Do not specify this parameter in the first call. In subsequent calls, specify the nextToken value returned in the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>dXNlci1vZmZzZXQ6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUsersRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
