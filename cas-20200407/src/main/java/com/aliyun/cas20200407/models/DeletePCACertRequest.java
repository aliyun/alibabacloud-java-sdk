// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeletePCACertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccaf0c629c2be1e2ab</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DeletePCACertRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePCACertRequest self = new DeletePCACertRequest();
        return TeaModel.build(map, self);
    }

    public DeletePCACertRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
