// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractContentRequest extends TeaModel {
    // 合同ID
    @NameInMap("ContractId")
    public java.io.InputStream contractId;

    public static GetContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractContentRequest self = new GetContractContentRequest();
        return TeaModel.build(map, self);
    }

    public GetContractContentRequest setContractId(java.io.InputStream contractId) {
        this.contractId = contractId;
        return this;
    }
    public java.io.InputStream getContractId() {
        return this.contractId;
    }

}
