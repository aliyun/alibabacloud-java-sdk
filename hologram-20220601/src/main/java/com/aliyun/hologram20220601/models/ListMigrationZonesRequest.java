// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListMigrationZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListMigrationZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationZonesRequest self = new ListMigrationZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationZonesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMigrationZonesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
