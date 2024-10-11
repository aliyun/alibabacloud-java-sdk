// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingSystemRequest extends TeaModel {
    /**
     * <p>The configurations that you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifyRankingSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingSystemRequest self = new ModifyRankingSystemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRankingSystemRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
