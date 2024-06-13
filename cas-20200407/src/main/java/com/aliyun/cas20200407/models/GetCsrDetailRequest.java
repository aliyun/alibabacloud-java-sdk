// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCsrDetailRequest extends TeaModel {
    /**
     * <p>CSR ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    public static GetCsrDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsrDetailRequest self = new GetCsrDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCsrDetailRequest setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

}
