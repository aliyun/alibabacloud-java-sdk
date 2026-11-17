// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteLogicalModelRequest extends TeaModel {
    /**
     * <p>The expected object version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedRevision")
    public Long expectedRevision;

    public static DeleteLogicalModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicalModelRequest self = new DeleteLogicalModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogicalModelRequest setExpectedRevision(Long expectedRevision) {
        this.expectedRevision = expectedRevision;
        return this;
    }
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

}
