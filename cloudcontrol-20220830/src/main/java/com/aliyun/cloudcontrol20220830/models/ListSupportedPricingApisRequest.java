// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListSupportedPricingApisRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListSupportedPricingApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedPricingApisRequest self = new ListSupportedPricingApisRequest();
        return TeaModel.build(map, self);
    }

    public ListSupportedPricingApisRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupportedPricingApisRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
