// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class AbortContractRequest extends TeaModel {
    // 合同ID
    @NameInMap("ContractId")
    public String contractId;

    @NameInMap("Origin")
    public String origin;

    public static AbortContractRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortContractRequest self = new AbortContractRequest();
        return TeaModel.build(map, self);
    }

    public AbortContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public AbortContractRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

}
