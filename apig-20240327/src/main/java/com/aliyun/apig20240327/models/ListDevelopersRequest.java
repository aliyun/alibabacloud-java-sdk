// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListDevelopersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page. The default value and valid values are not specified in the API definition.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. Pass the nextToken value returned in the previous response to retrieve the next page. Do not pass this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the portal used to filter developers.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxxxxxxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    /**
     * <p>The status of the developer used to filter developers. Valid values: PENDING, APPROVED, and REJECTED.</p>
     * 
     * <strong>example:</strong>
     * <p>APPROVED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The logon username of the developer used to filter developers.</p>
     * 
     * <strong>example:</strong>
     * <p>developer-demo</p>
     */
    @NameInMap("username")
    public String username;

    public static ListDevelopersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevelopersRequest self = new ListDevelopersRequest();
        return TeaModel.build(map, self);
    }

    public ListDevelopersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevelopersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDevelopersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDevelopersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDevelopersRequest setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

    public ListDevelopersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDevelopersRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
