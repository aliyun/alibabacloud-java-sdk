// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCsrRequest extends TeaModel {
    /**
     * <p>The ID of the CSR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3013</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    public static DeleteCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCsrRequest self = new DeleteCsrRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCsrRequest setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

}
