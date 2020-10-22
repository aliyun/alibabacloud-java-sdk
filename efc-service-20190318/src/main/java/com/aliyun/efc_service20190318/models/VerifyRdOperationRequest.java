// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class VerifyRdOperationRequest extends TeaModel {
    @NameInMap("RdOperation")
    public String rdOperation;

    public static VerifyRdOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRdOperationRequest self = new VerifyRdOperationRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRdOperationRequest setRdOperation(String rdOperation) {
        this.rdOperation = rdOperation;
        return this;
    }
    public String getRdOperation() {
        return this.rdOperation;
    }

}
