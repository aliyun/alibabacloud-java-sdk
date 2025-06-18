// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UploadPcaCertToCasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>59425,59426</p>
     */
    @NameInMap("Ids")
    public String ids;

    public static UploadPcaCertToCasRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPcaCertToCasRequest self = new UploadPcaCertToCasRequest();
        return TeaModel.build(map, self);
    }

    public UploadPcaCertToCasRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
