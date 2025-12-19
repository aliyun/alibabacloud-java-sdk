// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListAPIKeyCredentialProvidersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l8i017XhgKLf/HqWDGD375</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAPIKeyCredentialProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAPIKeyCredentialProvidersRequest self = new ListAPIKeyCredentialProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListAPIKeyCredentialProvidersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAPIKeyCredentialProvidersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
