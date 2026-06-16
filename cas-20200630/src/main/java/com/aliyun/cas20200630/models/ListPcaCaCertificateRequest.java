// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListPcaCaCertificateRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page. The default value is 20.</p>
     * <p>Valid values: 1 to 2000.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. Leave this parameter empty to start the query from the first page. If this parameter is not returned, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListPcaCaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPcaCaCertificateRequest self = new ListPcaCaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ListPcaCaCertificateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPcaCaCertificateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
