// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteEcuRequest extends TeaModel {
    /**
     * <p>The unique ID of the ECU to be deleted.</p>
     * <br>
     * <p>This parameter is required.</p>
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
