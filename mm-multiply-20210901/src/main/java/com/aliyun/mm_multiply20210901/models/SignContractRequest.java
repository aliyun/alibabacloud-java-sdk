// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SignContractRequest extends TeaModel {
    // 合同ID
    @NameInMap("ContractId")
    public String contractId;

    @NameInMap("Origin")
    public String origin;

    // 签约内容
    @NameInMap("SignContent")
    public String signContent;

    public static SignContractRequest build(java.util.Map<String, ?> map) throws Exception {
        SignContractRequest self = new SignContractRequest();
        return TeaModel.build(map, self);
    }

    public SignContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public SignContractRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public SignContractRequest setSignContent(String signContent) {
        this.signContent = signContent;
        return this;
    }
    public String getSignContent() {
        return this.signContent;
    }

}
