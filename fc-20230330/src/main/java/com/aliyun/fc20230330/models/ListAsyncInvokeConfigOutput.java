// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncInvokeConfigOutput extends TeaModel {
    @NameInMap("configs")
    public java.util.List<AsyncConfig> configs;

    /**
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
