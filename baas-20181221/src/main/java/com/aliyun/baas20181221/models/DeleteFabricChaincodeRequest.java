// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteFabricChaincodeRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    public static DeleteFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFabricChaincodeRequest self = new DeleteFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

}
