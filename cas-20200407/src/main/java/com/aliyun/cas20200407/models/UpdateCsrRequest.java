// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrRequest extends TeaModel {
    /**
     * <p>CSR ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    public static UpdateCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCsrRequest self = new UpdateCsrRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCsrRequest setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

    public UpdateCsrRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
