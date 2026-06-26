// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListFunctionsRequest extends TeaModel {
    /**
     * <p>A pattern to filter function names.</p>
     * 
     * <strong>example:</strong>
     * <p>function%</p>
     */
    @NameInMap("functionNamePattern")
    public String functionNamePattern;

    /**
     * <p>The maximum number of records to return in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. Use this token to retrieve the next page of results. Pass an empty string (&quot;&quot;) if this parameter is not returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    public static ListFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsRequest self = new ListFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionsRequest setFunctionNamePattern(String functionNamePattern) {
        this.functionNamePattern = functionNamePattern;
        return this;
    }
    public String getFunctionNamePattern() {
        return this.functionNamePattern;
    }

    public ListFunctionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFunctionsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
