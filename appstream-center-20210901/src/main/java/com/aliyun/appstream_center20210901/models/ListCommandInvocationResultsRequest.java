// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListCommandInvocationResultsRequest extends TeaModel {
    /**
     * <p>The delivery group ID. Queries the command execution results under this delivery group. This parameter is required when AppInstanceGroupIds is not specified. If both are specified, AppInstanceGroupIds takes precedence and this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bxls9m9arax6****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The list of delivery group IDs. You can specify up to 200 IDs, and all delivery groups must be in the same region. When specified, this parameter takes precedence over AppInstanceGroupId and queries the command execution results of all persistent sessions under these delivery groups. The list cannot contain null values.</p>
     */
    @NameInMap("AppInstanceGroupIds")
    public java.util.List<String> appInstanceGroupIds;

    /**
     * <p>The list of persistent session IDs. You can specify up to 100 IDs to query the command execution results of only the specified persistent sessions. When AppInstanceGroupIds is specified, only persistent sessions that belong to these delivery groups are retained. If no matching persistent sessions are found, an empty list is returned.</p>
     */
    @NameInMap("AppInstancePersistentIds")
    public java.util.List<String> appInstancePersistentIds;

    /**
     * <p>The command execution ID, which is the InvocationId returned when RunAppInstanceCommand is called to deliver a command.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-0bxls9m9ara****</p>
     */
    @NameInMap("InvocationId")
    public String invocationId;

    /**
     * <p>This parameter does not take effect in the current version and does not affect the query results if passed. Use PageNumber and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter does not take effect in the current version and does not affect the query results if passed. Use PageNumber and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kDw2Ml****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the query results to return. This parameter is used together with PageSize for paging. If this parameter is not passed, the default value is 0, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type. Currently, only WuyingServer is supported. If you pass other values, a parameter error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListCommandInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommandInvocationResultsRequest self = new ListCommandInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommandInvocationResultsRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListCommandInvocationResultsRequest setAppInstanceGroupIds(java.util.List<String> appInstanceGroupIds) {
        this.appInstanceGroupIds = appInstanceGroupIds;
        return this;
    }
    public java.util.List<String> getAppInstanceGroupIds() {
        return this.appInstanceGroupIds;
    }

    public ListCommandInvocationResultsRequest setAppInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
        this.appInstancePersistentIds = appInstancePersistentIds;
        return this;
    }
    public java.util.List<String> getAppInstancePersistentIds() {
        return this.appInstancePersistentIds;
    }

    public ListCommandInvocationResultsRequest setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public ListCommandInvocationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCommandInvocationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCommandInvocationResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommandInvocationResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommandInvocationResultsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
