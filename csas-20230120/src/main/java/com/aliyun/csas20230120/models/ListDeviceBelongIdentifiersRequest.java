// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceBelongIdentifiersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IdentifierIds")
    public java.util.List<String> identifierIds;

    @NameInMap("IdentifierType")
    public String identifierType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeviceBelongIdentifiersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBelongIdentifiersRequest self = new ListDeviceBelongIdentifiersRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceBelongIdentifiersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeviceBelongIdentifiersRequest setIdentifierIds(java.util.List<String> identifierIds) {
        this.identifierIds = identifierIds;
        return this;
    }
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    public ListDeviceBelongIdentifiersRequest setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
        return this;
    }
    public String getIdentifierType() {
        return this.identifierType;
    }

    public ListDeviceBelongIdentifiersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceBelongIdentifiersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeviceBelongIdentifiersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
