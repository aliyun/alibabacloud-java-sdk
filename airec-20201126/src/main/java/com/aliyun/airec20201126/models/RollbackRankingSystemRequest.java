// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RollbackRankingSystemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;operateId&quot;: &quot;a-b-c&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static RollbackRankingSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackRankingSystemRequest self = new RollbackRankingSystemRequest();
        return TeaModel.build(map, self);
    }

    public RollbackRankingSystemRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
