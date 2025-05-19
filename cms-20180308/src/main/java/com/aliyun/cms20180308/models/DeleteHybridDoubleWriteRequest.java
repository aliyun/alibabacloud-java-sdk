// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteHybridDoubleWriteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-source</p>
     */
    @NameInMap("SourceNamespace")
    public String sourceNamespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12706766********</p>
     */
    @NameInMap("SourceUserId")
    public Long sourceUserId;

    public static DeleteHybridDoubleWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridDoubleWriteRequest self = new DeleteHybridDoubleWriteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridDoubleWriteRequest setSourceNamespace(String sourceNamespace) {
        this.sourceNamespace = sourceNamespace;
        return this;
    }
    public String getSourceNamespace() {
        return this.sourceNamespace;
    }

    public DeleteHybridDoubleWriteRequest setSourceUserId(Long sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public Long getSourceUserId() {
        return this.sourceUserId;
    }

}
