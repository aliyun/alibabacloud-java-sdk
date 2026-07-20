// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class SubmitQueryResponseBody extends TeaModel {
    /**
     * <p>The query ID, which is used for subsequent polling of results.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b21d1ec4f441e79d5ba917c3283200</p>
     */
    @NameInMap("queryId")
    public String queryId;

    public static SubmitQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryResponseBody self = new SubmitQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitQueryResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
