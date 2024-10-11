// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingModelTemplateRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifyRankingModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingModelTemplateRequest self = new ModifyRankingModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRankingModelTemplateRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
