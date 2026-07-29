// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListModelCatalogRequest extends TeaModel {
    /**
     * <p>The number of entries per page.
     * Default value:
     *     20
     * Maximum value:
     *     100</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that is returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>uat-assembly-cut-3d-bbig</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>holo_bailian</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ListModelCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelCatalogRequest self = new ListModelCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListModelCatalogRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelCatalogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelCatalogRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
