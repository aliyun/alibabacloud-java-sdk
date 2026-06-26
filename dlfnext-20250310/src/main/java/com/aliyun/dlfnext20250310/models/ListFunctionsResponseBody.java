// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListFunctionsResponseBody extends TeaModel {
    /**
     * <p>The function definitions.</p>
     */
    @NameInMap("functions")
    public java.util.List<String> functions;

    /**
     * <p>A pagination token. Use this token to retrieve the next page of results. If this parameter is null, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    public static ListFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsResponseBody self = new ListFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionsResponseBody setFunctions(java.util.List<String> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<String> getFunctions() {
        return this.functions;
    }

    public ListFunctionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

}
