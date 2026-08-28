// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiRegistrantsRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <ul>
     * <li>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the real-name verified registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The real-name verification status. Valid values:</p>
     * <ul>
     * <li>Approved</li>
     * <li>Pending</li>
     * <li>Rejected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAtiRegistrantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAtiRegistrantsRequest self = new ListAtiRegistrantsRequest();
        return TeaModel.build(map, self);
    }

    public ListAtiRegistrantsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListAtiRegistrantsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAtiRegistrantsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAtiRegistrantsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAtiRegistrantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiRegistrantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiRegistrantsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
