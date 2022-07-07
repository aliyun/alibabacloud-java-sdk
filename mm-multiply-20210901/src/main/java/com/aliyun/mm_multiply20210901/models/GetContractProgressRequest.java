// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractProgressRequest extends TeaModel {
    @NameInMap("ContractId")
    public String contractId;

    public static GetContractProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractProgressRequest self = new GetContractProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetContractProgressRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
