// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetMatchedResourcesRequest extends TeaModel {
    /**
     * <p>The certificate IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19736665</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>Because of the large number of matched resources, the backend uses aggregation and does not support pagination. This parameter is reserved. By default, a maximum of 2,000 entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Because of the large number of matched resources, the backend uses aggregation and does not support pagination. This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>666</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource match scope. This parameter can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>目前支持全部云产品</p>
     */
    @NameInMap("ResourceScope")
    public String resourceScope;

    public static GetMatchedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMatchedResourcesRequest self = new GetMatchedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetMatchedResourcesRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public GetMatchedResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetMatchedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetMatchedResourcesRequest setResourceScope(String resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }
    public String getResourceScope() {
        return this.resourceScope;
    }

}
