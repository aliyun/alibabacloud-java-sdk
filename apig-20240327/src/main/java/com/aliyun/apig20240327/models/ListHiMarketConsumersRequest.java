// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHiMarketConsumersRequest extends TeaModel {
    /**
     * <p>The developer ID. This parameter is used to filter consumers by developer.</p>
     * 
     * <strong>example:</strong>
     * <p>dev-xxxxxxxx</p>
     */
    @NameInMap("developerId")
    public String developerId;

    /**
     * <p>The maximum number of entries per page. The default value and valid values are not specified in the API definition.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The search keyword for the consumer name.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer-1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token. To retrieve the next page, pass the nextToken value returned in the previous response. Do not specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The portal ID. This parameter is used to filter consumers by portal.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxxxxxxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    public static ListHiMarketConsumersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHiMarketConsumersRequest self = new ListHiMarketConsumersRequest();
        return TeaModel.build(map, self);
    }

    public ListHiMarketConsumersRequest setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public ListHiMarketConsumersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHiMarketConsumersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHiMarketConsumersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHiMarketConsumersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHiMarketConsumersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHiMarketConsumersRequest setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

}
