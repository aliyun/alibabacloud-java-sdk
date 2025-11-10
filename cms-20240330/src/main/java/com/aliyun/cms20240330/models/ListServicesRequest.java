// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query, an empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>7-b81a-4bc9-bbfa-a50cc6988667</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Service type</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
