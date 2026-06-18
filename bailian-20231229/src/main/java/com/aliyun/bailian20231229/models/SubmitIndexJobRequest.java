// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexJobRequest extends TeaModel {
    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    public static SubmitIndexJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexJobRequest self = new SubmitIndexJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIndexJobRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

}
