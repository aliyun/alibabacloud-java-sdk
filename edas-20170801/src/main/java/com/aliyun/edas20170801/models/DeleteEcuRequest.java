// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteEcuRequest extends TeaModel {
    /**
     * <p>The unique ID of the ECU to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5c0b8c82-4ba9-<strong><strong>-</strong></strong>-130a34ffa534</p>
     */
    @NameInMap("EcuId")
    public String ecuId;

    public static DeleteEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEcuRequest self = new DeleteEcuRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEcuRequest setEcuId(String ecuId) {
        this.ecuId = ecuId;
        return this;
    }
    public String getEcuId() {
        return this.ecuId;
    }

}
