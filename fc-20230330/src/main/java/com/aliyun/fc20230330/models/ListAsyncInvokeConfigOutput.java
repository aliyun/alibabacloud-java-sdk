// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncInvokeConfigOutput extends TeaModel {
    /**
     * <p>The configurations of the asynchronous invocation.</p>
     */
    @NameInMap("configs")
    public java.util.List<AsyncConfig> configs;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>8bj81uI8n****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAsyncInvokeConfigOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncInvokeConfigOutput self = new ListAsyncInvokeConfigOutput();
        return TeaModel.build(map, self);
    }

    public ListAsyncInvokeConfigOutput setConfigs(java.util.List<AsyncConfig> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<AsyncConfig> getConfigs() {
        return this.configs;
    }

    public ListAsyncInvokeConfigOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
