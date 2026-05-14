// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListModelCatalogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>uat-assembly-cut-3d-bbig</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

}
