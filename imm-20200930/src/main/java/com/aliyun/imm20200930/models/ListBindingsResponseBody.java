// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBindingsResponseBody extends TeaModel {
    /**
     * <p>The bindings between the dataset and OSS buckets.</p>
     */
    @NameInMap("Bindings")
    public java.util.List<Binding> bindings;

    /**
     * <ul>
     * <li>The pagination token that is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter.</li>
     * <li>The next request returns remaining results starting from the position marked by the NextToken parameter value.</li>
     * <li>This parameter has a non-empty value only when not all bindings are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>immtest:dataset001:examplebucket01</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFDFD356-C928-4A36-951A-6EB5A592****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponseBody self = new ListBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponseBody setBindings(java.util.List<Binding> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<Binding> getBindings() {
        return this.bindings;
    }

    public ListBindingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
