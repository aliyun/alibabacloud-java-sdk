// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListConnectorModelsRequest extends TeaModel {
    /**
     * <p>The ID of a service account key. This parameter is required when multiple keys exist. You can leave this parameter empty if only one key exists.</p>
     * 
     * <strong>example:</strong>
     * <p>ckey-xxxx</p>
     */
    @NameInMap("connectorKeyId")
    public String connectorKeyId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListConnectorModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorModelsRequest self = new ListConnectorModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectorModelsRequest setConnectorKeyId(String connectorKeyId) {
        this.connectorKeyId = connectorKeyId;
        return this;
    }
    public String getConnectorKeyId() {
        return this.connectorKeyId;
    }

    public ListConnectorModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectorModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
