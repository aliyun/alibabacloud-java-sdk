// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteChaincodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>code-sacc-1pr09q7jm****</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    public static DeleteChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChaincodeRequest self = new DeleteChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

}
