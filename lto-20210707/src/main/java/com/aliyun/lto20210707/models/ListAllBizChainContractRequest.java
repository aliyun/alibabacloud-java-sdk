// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainContractRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    public static ListAllBizChainContractRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainContractRequest self = new ListAllBizChainContractRequest();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainContractRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

}
