// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTerraformProviderVersionsRequest extends TeaModel {
    /**
     * <p>The keyword for searching versions. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of records to retrieve in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. A value of null indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>ar9lHbaidqWequN5orMba54dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The usage. Set to Explorer to retrieve meta information.</p>
     * 
     * <strong>example:</strong>
     * <p>Explorer</p>
     */
    @NameInMap("usage")
    public String usage;

    public static ListTerraformProviderVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerraformProviderVersionsRequest self = new ListTerraformProviderVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTerraformProviderVersionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTerraformProviderVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerraformProviderVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerraformProviderVersionsRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
