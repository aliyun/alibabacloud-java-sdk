// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class VerifyRankingSystemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;userFeatures&quot;: &quot;a:c,d:b&quot;,
     *   &quot;itemFeatures&quot;: &quot;a:1,b:2&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static VerifyRankingSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRankingSystemRequest self = new VerifyRankingSystemRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRankingSystemRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
