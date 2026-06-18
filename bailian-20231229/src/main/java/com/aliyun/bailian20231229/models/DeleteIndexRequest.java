// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteIndexRequest extends TeaModel {
    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f89ie0xxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    public static DeleteIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexRequest self = new DeleteIndexRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndexRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

}
